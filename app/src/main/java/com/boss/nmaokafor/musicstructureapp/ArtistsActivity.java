package com.boss.nmaokafor.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {
    /* Identifier for TrackAdapter to accurately display artist list item */
//    private static final int IDENTIFIER = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        // Create an arrayList of an object TrackDetail
        ArrayList<TrackDetail> trackDetails = new ArrayList<>();
        // Add details about artist in ArrayList
        trackDetails.add(new TrackDetail(getString(R.string.album_1)
                ,getString(R.string.song_1)
                ,getString(R.string.artist_1)
                , getString(R.string.about_adekunle)
                , R.drawable.adekunle_artist));

        trackDetails.add(new TrackDetail(getString(R.string.album_2)
                ,getString(R.string.song_2)
                ,getString(R.string.artist_2)
                , getString(R.string.about_asa)
                , R.drawable.asa_artist));

        trackDetails.add(new TrackDetail(getString(R.string.album_3)
                ,getString(R.string.song_2)
                ,getString(R.string.artist_2)
                , getString(R.string.about_falz)
                , R.drawable.falz_artist));

//              /    CLICKS ON MENU BUTTONS:
        Button playlistsMenuButton = (Button) findViewById(R.id.menuPlaylist);
        playlistsMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistsIntent = new Intent(ArtistsActivity.this, PlaylistsActivity.class);
                startActivity(playlistsIntent);
            }
        });

        Button albumMenuButton = (Button) findViewById(R.id.menuAlbums);
        albumMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumIntent = new Intent(ArtistsActivity.this, AlbumsActivity.class);
                startActivity(albumIntent);
            }
        });

        Button songMenuButton = (Button) findViewById(R.id.menuSongs);
        songMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songsIntent = new Intent(ArtistsActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        Button nowPlayingButton = (Button) findViewById(R.id.menuNowPlaying);
        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(ArtistsActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

//        // For 'readmore' buttons on the screen
//        Button readMore = (Button) findViewById(R.id.readMoreButton);
//        readMore.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "Function not implemented. Missing Intent for opening browser", Toast.LENGTH_SHORT).show();
//            }
//        });

        ListView listView = findViewById(R.id.artists_list);
        ArtistAdapter artistAdapter = new ArtistAdapter(this, trackDetails);
        listView.setAdapter(artistAdapter);
    }

    @Override
    public void onBackPressed () {
        Intent intent = new Intent(ArtistsActivity.this, MainActivity.class);
        startActivity(intent);
        super.onBackPressed();
    }
}

//        Button readMore2 = (Button) findViewById(R.id.readMoreButton2);
//        Button readMore3 = (Button) findViewById(R.id.readMoreButton3);

//        Button playlistsMenuButton = (Button) findViewById(R.id.menuPlaylist);
//        Button albumsMenuButton = (Button) findViewById(R.id.menuAlbums);
//        Button songsMenuButton = (Button) findViewById(R.id.menuSongs);
//        Button nowPlayingButton = (Button) findViewById(R.id.menuNowPlaying);

//
//        readMore2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "Function not implemented. Missing Intent for opening browser", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        readMore3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "Function not implemented. Missing Intent for opening browser", Toast.LENGTH_SHORT).show();
//            }
//        });
