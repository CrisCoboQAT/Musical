package com.example.crisf.musical;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the Latest Hits 2018 category
        TextView textViewLatestHits = findViewById(R.id.category_latest_hits_2018);

        textViewLatestHits.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent latestHitsIntent = new Intent(MainActivity.this, LatestHits2018Activity.class);
                startActivity(latestHitsIntent);

            }
        });

        // Find the View that shows the The Best Of Madonna category
        TextView textViewBestMadonna = findViewById(R.id.category_best_madonna);

        textViewBestMadonna.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent bestMadonnaIntent = new Intent(MainActivity.this, TheBestOfMadonnaActivity.class);
                startActivity(bestMadonnaIntent);

            }
        });
    }
}