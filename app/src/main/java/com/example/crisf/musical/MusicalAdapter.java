package com.example.crisf.musical;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicalAdapter extends ArrayAdapter<Music> {

    public MusicalAdapter(@NonNull Context context, @NonNull ArrayList<Music> musics) {
        super(context, 0, musics);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.music_list_item, parent, false);
        }

        Music currentMusic = getItem(position);

        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        songTextView.setText(currentMusic.getSong());

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        artistTextView.setText(currentMusic.getArtist());

        ImageView playImageView = (ImageView) listItemView.findViewById(R.id.play_image_view);
        playImageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent= new Intent(getContext(), NowPlayingActivity.class);
                getContext().startActivity(intent);
            }
        });

        return listItemView;
    }
}