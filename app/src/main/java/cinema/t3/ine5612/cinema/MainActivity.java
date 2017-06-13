package cinema.t3.ine5612.cinema;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import cinema.t3.ine5612.cinema.DB.DB;
import cinema.t3.ine5612.cinema.model.entity.Cinema;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.lista_cinemas);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                abrirCinema(position);
            }
        });

        ArrayAdapter<Cinema> adapter = new ArrayAdapter<Cinema>(this, android.R.layout.simple_list_item_1, DB.getInstance().getCinemas());
        listView.setAdapter(adapter);
    }

    public void abrirCinema(int id) {
        Bundle b = new Bundle();
        b.putInt("ID_CINEMA", id);
        Intent i = new Intent(getApplicationContext(), InfoCinemaActivity.class);
        i.putExtras(b);
        startActivity(i);
    }
}
