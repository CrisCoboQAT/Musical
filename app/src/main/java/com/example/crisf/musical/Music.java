package com.example.crisf.musical;

import java.util.ArrayList;
import java.util.List;

public class Music {

    private String song;

    private String artist;

    public Music() {}

    public Music(String song, String artist) {
        this.song = song;
        this.artist = artist;
    }

    public Music(String artist) {
        this.artist = artist;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}