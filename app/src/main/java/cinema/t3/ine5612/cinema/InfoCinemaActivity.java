package cinema.t3.ine5612.cinema;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;

import cinema.t3.ine5612.cinema.model.DB.DB;
import cinema.t3.ine5612.cinema.model.entity.Cinema;
import cinema.t3.ine5612.cinema.model.entity.Filme;

public class InfoCinemaActivity extends FragmentActivity implements OnMapReadyCallback {

    private Cinema cinema;

    public static ArrayAdapter<Filme> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_cinema);
        Bundle b = getIntent().getExtras();
        ListView listView = (ListView) findViewById(R.id.lista_filmes);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                abrirDetalhesFilme(position);
            }
        });


        cinema = DB.getInstance().getCinemas().get(b.getInt("ID_CINEMA"));
        List<Filme> filmes = (List) cinema.getFilmes();
        adapter = new ArrayAdapter<Filme>(this, android.R.layout.simple_list_item_1, filmes);
        listView.setAdapter(adapter);
        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    private void abrirDetalhesFilme(int id) {
        Bundle b = new Bundle();
        b.putInt("ID_FILME", id);
        Intent i = new Intent(getApplicationContext(), DetalheFilmeActivity.class);
        i.putExtra("CINEMA", cinema);
        i.putExtras(b);
        startActivity(i);
    }

//    public void listarFavoritos(View view) {
//        List<Filme> filmes = (List<Filme>) cinema.getFilmes();
//        for (Filme f : filmes) {
//            if (!f.getFavorito()) {
//                filmes.remove(f);
//            }
//        }
//        adapter.clear();
//        adapter.addAll(filmes);
//        adapter.notifyDataSetChanged();
//    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        LatLng local = new LatLng(cinema.getLatitude(), cinema.getLongitude());
        googleMap.addMarker(new MarkerOptions().position(local)
                .title(cinema.getNome()));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(local));
    }
}
