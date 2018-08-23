package com.example.crisf.musical;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class TheBestOfMadonnaActivity extends AppCompatActivity {

    /**
     * Loads the list of the best of Madonna
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.musical_list);

        ArrayList<Music> music = new ArrayList();
        music.add(new Music("Like a Virgin","Madonna"));
        music.add(new Music("La Isla Bonita","Madonna"));
        music.add(new Music("Rain","Madonna"));
        music.add(new Music("Like a Prayer","Madonna"));
        music.add(new Music("Rescue Me","Madonna"));
        music.add(new Music("Fever","Madonna"));
        music.add(new Music("Hung Up","Madonna"));
        music.add(new Music("Crazy for You","Madonna"));

        MusicalAdapter adapter = new MusicalAdapter(this, music);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

}