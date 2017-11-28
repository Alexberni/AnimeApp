package com.example.alex.retrofitapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by alex on 27/11/17.
 */

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.ViewHolder> {
    private List<String> itemsData;
    private Context context;
    private ImageView animeImage;
    private List<String> imageUrl;

    public AnimeAdapter(Context context, List<String> itemsData, List<String> imageUrl) {

        this.itemsData = itemsData;
        this.context = context;
        this.imageUrl = imageUrl;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public AnimeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
        // create a new view
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.anime_recycle, null);

        // create ViewHolder

        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

        // - get data from your itemsData at this position
        // - replace the contents of the view with that itemsData

        viewHolder.txtViewTitle.setText(itemsData.get(position));
        Picasso.with(context).load(imageUrl.get(position)).into(animeImage);

    }

    // inner class to hold a reference to each item of RecyclerView
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtViewTitle;
        public ImageView animeImage;
        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            txtViewTitle = (TextView) itemLayoutView.findViewById(R.id.animeTitle);
            animeImage = (ImageView) itemLayoutView.findViewById(R.id.animeImage);
        }
    }


    // Return the size of your itemsData (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return itemsData.size();
    }
}
