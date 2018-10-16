package com.boss.nmaokafor.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // THIS IS WHERE THE CLICKS ON MENU BUTTONS ARE EFFECTED
        Button menuAlbums = (Button) findViewById(R.id.menuAlbums);
        menuAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AlbumsIntent = new Intent(NowPlayingActivity.this, AlbumsActivity.class);
                startActivity(AlbumsIntent);
            }
        });

        Button menuArtists = (Button) findViewById(R.id.menuArtists);
        menuArtists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ArtistIntent = new Intent(NowPlayingActivity.this, ArtistsActivity.class);
                startActivity(ArtistIntent);
            }
        });

        Button menuSongs = (Button) findViewById(R.id.menuSongs);
        menuSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SongsIntent = new Intent(NowPlayingActivity.this, SongsActivity.class);
                startActivity(SongsIntent);
            }
        });

        Button menuPlaylist = (Button) findViewById(R.id.menuPlaylist);
        menuPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SettingsIntent = new Intent(NowPlayingActivity.this, PlaylistsActivity.class);
                startActivity(SettingsIntent);
            }
        });

        // All buttons on the screen
        ImageButton rewindButton = (ImageButton) findViewById(R.id.rewindButton);
        rewindButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Previous song", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton playButton = (ImageButton) findViewById(R.id.playButton);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Song playing", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton ffButton = (ImageButton) findViewById(R.id.ffButton);
        ffButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Next song", Toast.LENGTH_SHORT).show();
            }
        });


    // Receive the intent send by {@link SongsActivity}
    Intent intent = getIntent();
    // Get name of the song with key "song_name"
    String songName = intent.getStringExtra("song_name");
    // Get the name of artist with key "artist_name"
    String artistName = intent.getStringExtra("artist_name");
    // Get the resource id of album cover with key "album_cover"
    int albumCover = intent.getIntExtra("album_cover", R.drawable.asa_bed);

        // Find the TextView with ID playing_song_name and set text with name of the song
        TextView songNameTextView = findViewById(R.id.playing_song);
        songNameTextView.setText(songName);

        // Find the TextView with ID playing_song_artist_name and set text with name of the artist
        // for that song
        TextView artistNameTextView = findViewById(R.id.playing_artist);
        artistNameTextView.setText(artistName);

        // Find the ImageView with ID playing_song_album_cover and set the album cover for that song
        ImageView albumCoverImageView = findViewById(R.id.asa_bed);
        albumCoverImageView.setImageResource(albumCover);
}

    @Override
    public void onBackPressed () {
        Intent intent = new Intent(NowPlayingActivity.this, MainActivity.class);
        startActivity(intent);
        super.onBackPressed();
    }
}