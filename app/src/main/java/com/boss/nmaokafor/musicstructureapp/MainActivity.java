package com.boss.nmaokafor.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find TextView with id albums
        LinearLayout albumsTextView = findViewById(R.id.albums);
        // Attach a listener to  textView to listen to any touch event
        albumsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 * When user clicks the Songs, then start a new intent to navigate
                 * to {@link SongsActivity}
                 */
                Intent intent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(intent);
            }
        });

        // Find TestView with id playlists
        LinearLayout playlistsTextView = findViewById(R.id.playlists);
        // Attach a listener to  textView to listen to any touch event
        playlistsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 * When user clicks the Playlist, then start a new intent to navigate
                 * to {@link PlaylistsActivity}
                 */
                Intent intent = new Intent(MainActivity.this, PlaylistsActivity.class);
                startActivity(intent);
            }
        });

        // Find TextView with id artist
        LinearLayout artistsTextView = findViewById(R.id.artists);
        // Attach a listener to  textView to listen to any touch event
        artistsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 * When user clicks the Playlist, then start a new intent to navigate
                 * to {@link ArtistsActivity}
                 */
                Intent intent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(intent);
            }
        });

        // Find TextView with id songs
        LinearLayout songsTextView = findViewById(R.id.songs);
        // Attach a listener to  textView to listen to any touch event
        songsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 * When user clicks the Artist, then start a new intent to navigate
                 * to {@link SongsActivity}
                 */
                Intent intent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(intent);
            }
        });

        // Find TextView with id songs
        LinearLayout nowPlayingTextView = findViewById(R.id.nowPlaying);
        // Attach a listener to  textView to listen to any touch event
        nowPlayingTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 * When user clicks the Artist, then start a new intent to navigate
                 * to {@link NowPlayingActivity}
                 */
                Intent intent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(intent);
            }
        });
    }
}