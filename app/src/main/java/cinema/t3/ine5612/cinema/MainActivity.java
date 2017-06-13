package cinema.t3.ine5612.cinema;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import cinema.t3.ine5612.cinema.model.entity.Cinema;
import cinema.t3.ine5612.cinema.model.DB.DB;
import cinema.t3.ine5612.cinema.model.entity.Filme;
import cinema.t3.ine5612.cinema.model.entity.Sala;
import cinema.t3.ine5612.cinema.model.entity.Tela;
import cinema.t3.ine5612.cinema.model.entity.TipoDeTela;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carregarDados();
        try {
            URL url = new URL("https://image.slidesharecdn.com/histriadocinemaportugues-130624132214-phpapp01/95/histria-do-cinema-portugues-2-638.jpg?cb=1372080520");
            Bitmap bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
            ImageView imageView = (ImageView) findViewById(R.id.imagem_background);
            imageView.setImageBitmap(bmp);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ListView listView = (ListView) findViewById(R.id.lista_cinemas);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               abrirDetalhesCinema(position);
            }
        });

        ArrayAdapter<Cinema> adapter = new ArrayAdapter<Cinema>(this, android.R.layout.simple_list_item_1, DB.getInstance().getCinemas());
        listView.setAdapter(adapter);
    }

    public void abrirDetalhesCinema(int id) {
        Bundle b = new Bundle();
        b.putInt("ID_CINEMA", id);
        Intent i = new Intent(getApplicationContext(), InfoCinemaActivity.class);
        i.putExtras(b);
        startActivity(i);
    }

    private void carregarDados() {
        List<Sala> salas = new ArrayList<Sala>();
        salas.add(new Sala(1, 80, new Tela(700, TipoDeTela.TELA_FULL_HD)));
        salas.add(new Sala(2, 100, new Tela(800, TipoDeTela.TELA_HD)));
        salas.add(new Sala(3, 98, new Tela(800, TipoDeTela.TELA_FULL_HD)));
        salas.add(new Sala(4, 149, new Tela(1000, TipoDeTela.ULTRA_HD)));

        List<Cinema> cinemas = new ArrayList<Cinema>();
        cinemas.add(new Cinema(
                1L,
                "Cinespaço Beira-Mar",
                11122232L,
                44L,
                new ArrayList<Filme>(3),
                salas,
                null
        ));
        cinemas.add(new Cinema(
                2L,
                "CInesystem Iguatemi",
                11122232L,
                44L,
                new ArrayList<Filme>(5),
                salas,
                null
        ));
        cinemas.add(new Cinema(
                3L,
                "Cinemark Floripa Shopping",
                11122232L,
                44L,
                new ArrayList<Filme>(6),
                salas,
                null
        ));

        DB.getInstance().setCinemas(cinemas);
    }
}
