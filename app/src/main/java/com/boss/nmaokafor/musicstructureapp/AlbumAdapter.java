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

public class AlbumAdapter extends ArrayAdapter<TrackDetail> {
    /* Context of the app */
    private Context mContext;

    public AlbumAdapter(@NonNull Context context, @NonNull List<TrackDetail> objects) {
        super(context, 0, objects);
        mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View gridItemView = convertView;
        if(gridItemView == null){
            gridItemView = LayoutInflater.from(mContext)
                    .inflate(R.layout.album_grid_item, parent, false);
        }

        TrackDetail currentItem = getItem(position);

        // Find the imageView for album art in album_grid_item.xml and set the album art
        ImageView albumArt = gridItemView.findViewById(R.id.grid_album_cover);
        albumArt.setImageResource(currentItem.getAlbumArt());

        // Find the textView for album name in album_grid_item.xml and set the album name
        TextView albumName = gridItemView.findViewById(R.id.grid_album1);
        albumName.setText(currentItem.getAlbumName().toString());

        // Find the textView for album artist in album_grid_item.xml and set artist name
        TextView artistName = gridItemView.findViewById(R.id.grid_artist1);
        artistName.setText(currentItem.getArtistName().toString());

        return gridItemView;
    }
}
