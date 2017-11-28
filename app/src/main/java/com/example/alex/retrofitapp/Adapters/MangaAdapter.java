package com.example.alex.retrofitapp.Adapters;

import android.content.Context;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alex.retrofitapp.Fragments.AnimeDetailFragment;
import com.example.alex.retrofitapp.MangaListPojo.Datum;
import com.example.alex.retrofitapp.MangaListPojo.MangaList;
import com.example.alex.retrofitapp.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by alex on 28/11/17.
 */


public class MangaAdapter extends RecyclerView.Adapter<MangaAdapter.ViewHolder> {
    private ArrayList<String> itemsData = new ArrayList<>();
    private Context context;
    private ArrayList<String> imageUrl = new ArrayList<>();
    private ArrayList<String> status = new ArrayList<>();

    public MangaAdapter(Context context, MangaList mangaList) {
        for (Datum mangaData : mangaList.getData()
                ) {
            itemsData.add(mangaData.getAttributes().getCanonicalTitle());
            imageUrl.add(mangaData.getAttributes().getPosterImage().getMedium());
            status.add(mangaData.getAttributes().getStatus());
        }

        this.context = context;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MangaAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
        // create a new view
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.manga_recycle, null);

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
        Picasso.with(context).load(imageUrl.get(position)).into(viewHolder.mangaImage);
        viewHolder.statusTxt.setText(status.get(position));

    }

    // inner class to hold a reference to each item of RecyclerView
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtViewTitle;
        public ImageView mangaImage;
        public TextView statusTxt;
        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            txtViewTitle = (TextView) itemLayoutView.findViewById(R.id.mangaTitle);
            mangaImage = (ImageView) itemLayoutView.findViewById(R.id.mangaImage);
            statusTxt = (TextView) itemLayoutView.findViewById(R.id.ageRating);

            itemLayoutView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(), txtViewTitle.getText(), Toast.LENGTH_SHORT).show();
                    AppCompatActivity activity = (AppCompatActivity) view.getContext();
                    AnimeDetailFragment detail = new AnimeDetailFragment();
                    final FragmentTransaction transaction = activity.getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.dataFragment, detail);
                    transaction.addToBackStack(null);
                    transaction.commit();
                }
            });
        }
    }


    // Return the size of your itemsData (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return itemsData.size();
    }
}
