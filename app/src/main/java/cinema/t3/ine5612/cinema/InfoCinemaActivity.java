package cinema.t3.ine5612.cinema;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

import cinema.t3.ine5612.cinema.DB.DB;
import cinema.t3.ine5612.cinema.model.entity.Cinema;

public class InfoCinemaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_cinema);

        Bundle b = getIntent().getExtras();
        ListView listView = (ListView) findViewById(R.id.lista_filmes);
        Cinema cinema = DB.getInstance().getCinemas().get(b.getInt("ID_CINEMA"));
        List<Cinema> c = new ArrayList<>();
        c.add(cinema);
//        List<String> filmes = new ArrayList<>();
//        filmes.add("teyegfdjn,dmg");
//        filmes.add("teyegfdjn,dmg");
//        filmes.add("teyegfdjn,dmg");
//        filmes.add("teyegfdjn,dmg");
//        filmes.add("teyegfdjn,dmg");
        ArrayAdapter<Cinema> adapter = new ArrayAdapter<Cinema>(this, android.R.layout.simple_list_item_1, c);
        listView.setAdapter(adapter);




//        super.onCreate(savedInstanceState);
//        // Get the SupportMapFragment and request notification
//        // when the map is ready to be used.
//        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
//                .findFragmentById(R.id.map);
//        mapFragment.getMapAsync(this);
    }

//    @Override
//    public void onMapReady(GoogleMap googleMap) {
//        // Add a marker in Sydney, Australia,
//        // and move the map's camera to the same location.
//        LatLng sydney = new LatLng(-33.852, 151.211);
//        googleMap.addMarker(new MarkerOptions().position(sydney)
//                .title("Marker in Sydney"));
//        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
//    }
}
