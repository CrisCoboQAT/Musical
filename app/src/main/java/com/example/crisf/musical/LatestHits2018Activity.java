package com.example.crisf.musical;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class LatestHits2018Activity extends AppCompatActivity {

    /**
     * Loads the list of the latest hits of 2018
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.musical_list);

        ArrayList<Music> music = new ArrayList();
        music.add(new Music("Havana","Camila Cabello"));
        music.add(new Music("Perfect","Ed Sheeran"));
        music.add(new Music("Shape of You","Ed Sheeran"));
        music.add(new Music("One Kiss","Calvin Harris"));
        music.add(new Music("New Rules","Dua Lipa"));
        music.add(new Music("Despacito","Luis Fonsi"));
        music.add(new Music("What Lovers Do","Maroon 5"));
        music.add(new Music("No Tears Left to Cry","Ariana Grande"));

        MusicalAdapter adapter = new MusicalAdapter(this, music);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}