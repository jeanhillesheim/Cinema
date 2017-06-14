package cinema.t3.ine5612.cinema;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

import cinema.t3.ine5612.cinema.model.DB.DB;
import cinema.t3.ine5612.cinema.model.entity.Cinema;
import cinema.t3.ine5612.cinema.model.entity.Filme;
import cinema.t3.ine5612.cinema.model.entity.Pessoa;

public class DetalheFilmeActivity extends AppCompatActivity {

    private Bitmap bmp;

    private Filme filme;

    private Cinema cinema;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_filme);

        Bundle b = getIntent().getExtras();
        cinema = (Cinema) getIntent().getSerializableExtra("CINEMA");
        filme = ((List<Filme>) cinema.getFilmes()).get(b.getInt("ID_FILME"));
        final ImageView imageView = (ImageView) findViewById(R.id.banner);
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... params) {
                try {
                    InputStream in = new URL(filme.getPoster().getUrl()).openStream();
                    bmp = BitmapFactory.decodeStream(in);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void onPostExecute(Void result) {
                if (bmp != null)
                    imageView.setImageBitmap(bmp);
            }

        }.execute();

        TextView titulo = (TextView) findViewById(R.id.titulo);
        titulo.setText("Título: " + filme.getNome());

        titulo.append("\n\n");
        titulo.append("Diretor: " + filme.getDiretor().getNome());
        titulo.append("\n\n");
        titulo.append("Elenco: ");
        for (Pessoa p : filme.getElenco()) {
            titulo.append(p.getNome());
            titulo.append(", ");
        }
        titulo.setText(titulo.getText().subSequence(0, titulo.getText().length() - 2));

        TextView sinopse = (TextView) findViewById(R.id.sinopse);
        sinopse.setText(filme.getSinopse());

        Button btn = (Button) findViewById(R.id.btn_favoritar);
        if (filme.getFavorito()) {
            btn.setCompoundDrawablesWithIntrinsicBounds(0, 0, android.R.drawable.btn_star_big_on, 0);
            btn.setText("Desmarcar favorito");
        } else {
            btn.setCompoundDrawablesWithIntrinsicBounds(0, 0, android.R.drawable.btn_star_big_off, 0);
        }

        Button btnTrailer = (Button) findViewById(R.id.btn_trailer);
        btnTrailer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirecionarYoutube();
            }
        });
    }

    private void redirecionarYoutube(){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(filme.getTrailer())));
    }

    public void favoritar(View view) {
        if (filme.getFavorito()) {
            marcarFavorito(false);
            Button btn = (Button) findViewById(R.id.btn_favoritar);
            btn.setCompoundDrawablesWithIntrinsicBounds(0, 0, android.R.drawable.btn_star_big_off, 0);
            btn.setText("Marcar favorito");
        } else {
            marcarFavorito(true);
            Button btn = (Button) findViewById(R.id.btn_favoritar);
            btn.setCompoundDrawablesWithIntrinsicBounds(0, 0, android.R.drawable.btn_star_big_on, 0);
            btn.setText("Desmarcar favorito");
        }
    }

    private void marcarFavorito(boolean favorito) {
//        InfoCinemaActivity.adapter.clear();
//        InfoCinemaActivity.adapter.notifyDataSetChanged();
//        DB.getInstance().getFilmes().remove(filme);
        filme.setFavorito(favorito);
//        DB.getInstance().getFilmes().add(filme);
//        InfoCinemaActivity.adapter.addAll(DB.getInstance().getFilmes());
        InfoCinemaActivity.adapter.notifyDataSetChanged();
    }
}
