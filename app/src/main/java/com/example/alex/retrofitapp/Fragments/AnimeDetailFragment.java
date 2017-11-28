package com.example.alex.retrofitapp.Fragments;

import android.content.Context;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alex.retrofitapp.AnimePojo.Anime;
import com.example.alex.retrofitapp.KitsuServices;
import com.example.alex.retrofitapp.R;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link AnimeDetailFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link AnimeDetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AnimeDetailFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
    private ImageView image;
    private TextView sinopsis;


    public AnimeDetailFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AnimeDetailFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AnimeDetailFragment newInstance(String param1, String param2) {
        AnimeDetailFragment fragment = new AnimeDetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_anime_detail, container, false);
        loadJSON();
        return rootView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    private void loadJSON(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://kitsu.io/api/edge/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        KitsuServices request = retrofit.create(KitsuServices.class);
        Call<Anime> call = request.getAnime();
        call.enqueue(new Callback<Anime>() {
            @Override
            public void onResponse(Call<Anime> call, Response<Anime> response) {
                Anime animePojo = response.body();
                if(animePojo!= null) {
                    image =  (ImageView)getActivity().findViewById(R.id.detailImage);
                    Picasso.with(getContext()).load(animePojo.getData().getAttributes().getPosterImage().getLarge()).into(image);
                    sinopsis =  (TextView) getActivity().findViewById(R.id.sinposis);
                    sinopsis.setText(animePojo.getData().getAttributes().getSynopsis());
                }
                else
                    Toast.makeText(getContext(), "Error on getting Anime", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<Anime> call, Throwable t) {
                Log.d("Error",t.getMessage());
            }
        });
    }
}
