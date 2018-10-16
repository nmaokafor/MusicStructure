package com.boss.nmaokafor.musicstructureapp;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);
        // Options for textViews
        TextView addNewPlaylist = (TextView) findViewById(R.id.addNewPlaylist);
        TextView mostPlayed = (TextView) findViewById(R.id.mostPlayed);
        TextView recentlyAdded = (TextView) findViewById(R.id.recentlyAdded);
        TextView favoriteTracks = (TextView) findViewById(R.id.favoriteTracks);


//        Menu Buttons
        // THIS IS WHERE THE CLICKS ON MENU BUTTONS ARE EFFECTED
        Button albumsMenuButton = (Button) findViewById(R.id.menuAlbums);
        albumsMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AlbumsIntent = new Intent(PlaylistsActivity.this, AlbumsActivity.class);
                startActivity(AlbumsIntent);
            }
        });

        Button artistsMenuButton = (Button) findViewById(R.id.menuArtists);
        artistsMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ArtistsIntent = new Intent(PlaylistsActivity.this, ArtistsActivity.class);
                startActivity(ArtistsIntent);
            }
        });

        Button songsMenuButton = (Button) findViewById(R.id.menuSongs);
        songsMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SongIntent = new Intent(PlaylistsActivity.this, SongsActivity.class);
                startActivity(SongIntent);
            }
        });

        Button nowPlayingButton = (Button) findViewById(R.id.menuNowPlaying);
        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(PlaylistsActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });


        addNewPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Function not implemented. Missing Intent for adding new playlist", Toast.LENGTH_SHORT).show();
            }
        });

        mostPlayed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Function not implemented. Missing xml file for list of most played songs", Toast.LENGTH_SHORT).show();
            }
        });

        recentlyAdded.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Function not implemented. Missing xml file for list of recently added songs", Toast.LENGTH_SHORT).show();
            }
        });

        favoriteTracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Function not implemented. Missing xml file for list of favorite tracks", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onBackPressed () {
        Intent intent = new Intent(PlaylistsActivity.this, MainActivity.class);
        startActivity(intent);
        super.onBackPressed();
    }
}
