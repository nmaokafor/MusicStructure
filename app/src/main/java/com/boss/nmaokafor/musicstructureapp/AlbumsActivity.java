package com.boss.nmaokafor.musicstructureapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        // Set the action bar elevation to 0dp
        getSupportActionBar().setElevation(0);

        // Create an arrayList of an object TrackDetail
        ArrayList<TrackDetail> trackDetails = new ArrayList<>();

        // Add details about songs in ArrayList
        trackDetails.add(new TrackDetail(getString(R.string.album_1)
                , getString(R.string.song_1)
                , getString(R.string.artist_1)
                , R.drawable.adekunle));
//
        trackDetails.add(new TrackDetail(getString(R.string.album_2)
                , getString(R.string.song_2)
                , getString(R.string.artist_2)
                , R.drawable.asa));
//
        trackDetails.add(new TrackDetail(getString(R.string.album_3)
                , getString(R.string.song_3)
                , getString(R.string.artist_2)
                , R.drawable.asa_bed));

        trackDetails.add(new TrackDetail(getString(R.string.album_4)
                , getString(R.string.song_4)
                , getString(R.string.artist_3)
                , R.drawable.falz));

////       /    CLICKS ON MENU BUTTONS:
        Button playlistsMenuButton = (Button) findViewById(R.id.menuPlaylist);
        playlistsMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistsIntent = new Intent(AlbumsActivity.this, PlaylistsActivity.class);
                startActivity(playlistsIntent);
            }
        });

        Button artistMenuButton = (Button) findViewById(R.id.menuArtists);
        artistMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistIntent = new Intent(AlbumsActivity.this, ArtistsActivity.class);
                startActivity(artistIntent);
            }
        });

        Button songMenuButton = (Button) findViewById(R.id.menuSongs);
        songMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songsIntent = new Intent(AlbumsActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        Button nowPlayingButton = (Button) findViewById(R.id.menuNowPlaying);
        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(AlbumsActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

    }
    @Override
    public void onBackPressed () {
        Intent intent = new Intent(AlbumsActivity.this, MainActivity.class);
        startActivity(intent);
        super.onBackPressed();
    }
}