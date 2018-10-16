package com.boss.nmaokafor.musicstructureapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ArtistAdapter extends ArrayAdapter<TrackDetail> {
//    * Context of the app */
    private Context mContext;

    public ArtistAdapter(@NonNull Context context, @NonNull List<TrackDetail> objects) {
        super(context, 0, objects);
        mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(mContext)
                    .inflate(R.layout.artist_list_item, parent, false);
        }

        TrackDetail currentItem = getItem(position);

        // Find the imageView for album art in album_grid_item.xml and set the album art
        ImageView albumArt = listItemView.findViewById(R.id.artist_list_picture);
        albumArt.setImageResource(currentItem.getArtistPicture());

        // Find the textView for album name in album_grid_item.xml and set the album name
        TextView albumName = listItemView.findViewById(R.id.artist_list_detail);
        albumName.setText(currentItem.getArtistName().toString());

        // Find the textView for album artist in album_grid_item.xml and set artist name
        TextView artistName = listItemView.findViewById(R.id.artist_list_description);
        artistName.setText(currentItem.getArtistDescription().toString());

        return listItemView;
    }
}