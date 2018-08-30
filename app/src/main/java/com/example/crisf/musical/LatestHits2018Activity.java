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
        music.add(new Music(getString(R.string.havana),getString(R.string.camila_cabello)));
        music.add(new Music(getString(R.string.perfect),getString(R.string.ed_sheeran)));
        music.add(new Music(getString(R.string.shape_of_you),getString(R.string.ed_sheeran)));
        music.add(new Music(getString(R.string.one_kiss),getString(R.string.calvin_harris)));
        music.add(new Music(getString(R.string.new_rules),getString(R.string.dua_lipa)));
        music.add(new Music(getString(R.string.despacito),getString(R.string.luis_fonsi)));
        music.add(new Music(getString(R.string.what_lovers_do),getString(R.string.maroon_5)));
        music.add(new Music(getString(R.string.no_tears_left_to_cry),getString(R.string.ariana_grande)));

        MusicalAdapter adapter = new MusicalAdapter(this, music);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}