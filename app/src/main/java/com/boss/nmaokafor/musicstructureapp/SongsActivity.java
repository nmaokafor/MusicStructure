package com.boss.nmaokafor.musicstructureapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {
    private static final int IDENTIFIER = 1;
    private ArrayList<TrackDetail> trackDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

//        /    CLICKS ON MENU BUTTONS:
        Button playlistsMenuButton = (Button) findViewById(R.id.menuPlaylist);
        playlistsMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistsIntent = new Intent(SongsActivity.this, PlaylistsActivity.class);
                startActivity(playlistsIntent);
            }
        });

        Button albumMenuButton = (Button) findViewById(R.id.menuAlbums);
        albumMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumIntent = new Intent(SongsActivity.this, AlbumsActivity.class);
                startActivity(albumIntent);
            }
        });

        Button artistMenuButton = (Button) findViewById(R.id.menuArtists);
        artistMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistsIntent = new Intent(SongsActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        Button nowPlayingButton = (Button) findViewById(R.id.menuNowPlaying);
        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        // Create an arrayList of an object TrackDetail
        trackDetail = new ArrayList<>();
        // Add details about songs in ArrayList
        trackDetail.add(new TrackDetail(getString(R.string.song_1)
                , getString(R.string.artist_1)
                , R.drawable.song1));
        trackDetail.add(new TrackDetail(getString(R.string.song_2)
                , getString(R.string.artist_2)
                , R.drawable.song2));
        trackDetail.add(new TrackDetail(getString(R.string.song_3)
                , getString(R.string.artist_2)
                , R.drawable.song3));
        trackDetail.add(new TrackDetail(getString(R.string.song_4)
                , getString(R.string.artist_1)
                , R.drawable.song4));
        trackDetail.add(new TrackDetail(getString(R.string.song_5)
                , getString(R.string.artist_1)
                , R.drawable.song5));
        trackDetail.add(new TrackDetail(getString(R.string.song_6)
                , getString(R.string.artist_1)
                , R.drawable.song6));
        trackDetail.add(new TrackDetail(getString(R.string.song_7)
                , getString(R.string.artist_3)
                , R.drawable.song7));
        trackDetail.add(new TrackDetail(getString(R.string.song_8)
                , getString(R.string.artist_1)
                , R.drawable.song8));
        trackDetail.add(new TrackDetail(getString(R.string.song_9)
                , getString(R.string.artist_3)
                , R.drawable.song9));

        ListView listView = findViewById(R.id.songs_list);
//        // Attach a header to ListView
//        listView.addHeaderView(header);
        TrackAdapter trackAdapter = new TrackAdapter(this, trackDetail, IDENTIFIER);
        listView.setAdapter(trackAdapter);

        // Attach listener on list item view to play a song when clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Create a new Intent to {@link NowPlayingActivity}
                Intent intent = new Intent(SongsActivity.this, NowPlayingActivity.class);

                // Get the detail of song at which user has clicked
                TrackDetail track = trackDetail.get(position - 1);

                /**
                 * Create a Bundle and put all the track related data
                 * into Bundle in (key, value) pair
                 * */
                Bundle bundle = new Bundle();
                bundle.putString("song_name", track.getSongName());
                bundle.putString("artist_name", track.getArtistName());
                bundle.putInt("album_cover", track.getAlbumArt());

                // Send bundle through Intent
                intent.putExtras(bundle);
                // Start activity
                startActivity(intent);
            }
        });
    }
        /***
         * Implement functionality of starting a new intent for going back to
         * {@link MainActivity} when user clicks the back button in action bar
         */
        @Override
        public void onBackPressed () {
            Intent intent = new Intent(SongsActivity.this, MainActivity.class);
            startActivity(intent);
            super.onBackPressed();
        }
    }
//
//     ImageButton playSong2 = (ImageButton) findViewById(R.id.playSong2);
//        ImageButton playSong3 = (ImageButton) findViewById(R.id.playSong3);
//        ImageButton playSong4 = (ImageButton) findViewById(R.id.playSong4);
//        ImageButton playSong5 = (ImageButton) findViewById(R.id.playSong5);
//        ImageButton playSong6 = (ImageButton) findViewById(R.id.playSong6);
//        ImageButton playSong7 = (ImageButton) findViewById(R.id.playSong7);
//        ImageButton playSong8 = (ImageButton) findViewById(R.id.playSong8);
//        ImageButton playSong9 = (ImageButton) findViewById(R.id.playSong9);
//
//    // Play button
//        ImageButton playSong = (ImageButton) findViewById(R.id.playSong);
//        playSong.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent NowPlayingIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);
//                startActivity(NowPlayingIntent);
//            }
//        });

////        THIS IS WHERE CHANGES ON PLAY BUTTONS ARE EFFECTED
//        playSong2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent NowPlayingIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);
//                startActivity(NowPlayingIntent);
//            }
//        });
//
//        playSong3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent NowPlayingIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);
//                startActivity(NowPlayingIntent);
//            }
//        });
//
//        playSong4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent NowPlayingIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);
//                startActivity(NowPlayingIntent);
//            }
//        });
//
//        playSong5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent NowPlayingIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);
//                startActivity(NowPlayingIntent);
//            }
//        });
//
//        playSong6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent NowPlayingIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);
//                startActivity(NowPlayingIntent);
//            }
//        });
//
//        playSong7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent NowPlayingIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);
//                startActivity(NowPlayingIntent);
//            }
//        });
//
//        playSong8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent NowPlayingIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);
//                startActivity(NowPlayingIntent);
//            }
//        });
//
//        playSong9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent NowPlayingIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);
//                startActivity(NowPlayingIntent);
//            }
//        });
//    }
//}

