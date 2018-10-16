package com.boss.nmaokafor.musicstructureapp;

import android.util.EventLogTags;

public class TrackDetail {
    /* Name of the song */
    private String mSongName;

    /* Artist of the song */
    private String mArtistName;

    /* Name of the Album */
    private String mAlbumName;

    /*Description of Artist Bio*/
    private String mArtistDescription;

    /* Album art for the song */
    private int mAlbumArt;

    /* Artist picture */
    private int mArtistPicture;


    /***
     *  Public constructor for detail of songs
     *
     * @param songName name of the song
     * @param artistName name of the artist
     * @param albumArt drawable resource id for album art
     */
    public TrackDetail(String songName, String artistName, int albumArt) {
        mSongName = songName;
        mArtistName = artistName;
        mAlbumArt = albumArt;
    }

    /***
     *  Public constructor for detail of album
     *
     * @param albumName name of the album
     * @param songName name of the song
     * @param artistName name of the artist
     * @param albumArt drawable resource id for album art
     */
    public TrackDetail(String albumName, String songName, String artistName, int albumArt) {
        mAlbumName = albumName;
        mSongName = songName;
        mArtistName = artistName;
        mAlbumArt = albumArt;
    }

        /***
         *  Public constructor for detail of artist
         *@param albumName name of the album
         * @param songName name of the song
         * @param artistName name of artist
         * @param artistDescription name of artist
         * @param artistPicture drawable resource id for photo of the artist
         */
        public TrackDetail(String albumName, String songName, String artistName, String artistDescription, int artistPicture) {
            mAlbumName = albumName;
            mSongName = songName;
            mArtistName = artistName;
            mArtistDescription = artistDescription;
            mArtistPicture = artistPicture;
        }

        /**
         * This method is called to get name of the album
         *
         * @return name of the album
         */
        public String getAlbumName() {
            return mAlbumName;
        }

        /**
         * This method is called to get name of the song
         *
         * @return name of song
         */
        public String getSongName() {
            return mSongName;
        }

        /**
         * This method is called to get description of artist bio
         *
         * @return description of artist
         */
        public String getArtistDescription() {
            return mArtistDescription;
        }


        /**
         * This method is called to get name of artist
         *
         * @return name of artist
         */
        public String getArtistName() {
            return mArtistName;
        }

        /**
         * This method is called to get resource id for drawable album art
         *
         * @return resource id of drawable album art
         */
        public int getAlbumArt() {
            return mAlbumArt;
        }

        /**
         * This method is called to get resource id for artist photo
         *
         * @return resource id for photo of the artist
         */
        public int getArtistPicture () {
            return mArtistPicture;
        }
    }
//}
//
//public class trackDetail {
//
//    /* Artist of the song */
//    private String trackArtistName;
//
//    /* Artist photo */
//    private int trackAristPicture;
//
//    /*Description for the Artist bio*/
//    private String trackArtistDescription;