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
        music.add(new Music(getString(R.string.like_a_virgin),getString(R.string.madonna)));
        music.add(new Music(getString(R.string.la_isla_bonita),getString(R.string.madonna)));
        music.add(new Music(getString(R.string.rain),getString(R.string.madonna)));
        music.add(new Music(getString(R.string.like_a_prayer),getString(R.string.madonna)));
        music.add(new Music(getString(R.string.rescue_me),getString(R.string.madonna)));
        music.add(new Music(getString(R.string.fever),getString(R.string.madonna)));
        music.add(new Music(getString(R.string.hung_up),getString(R.string.madonna)));
        music.add(new Music(getString(R.string.crazy_for_you),getString(R.string.madonna)));

        MusicalAdapter adapter = new MusicalAdapter(this, music);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

}