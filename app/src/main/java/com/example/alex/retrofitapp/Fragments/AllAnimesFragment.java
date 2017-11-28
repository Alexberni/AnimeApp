package com.example.alex.retrofitapp.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.alex.retrofitapp.Adapters.AnimeAdapter;
import com.example.alex.retrofitapp.AnimeListPojo.AnimeList;
import com.example.alex.retrofitapp.KitsuServices;
import com.example.alex.retrofitapp.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link AllAnimesFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link AllAnimesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AllAnimesFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private OnFragmentInteractionListener mListener;
    private RecyclerView animeList;
    private RecyclerView.Adapter animeListAdapter;
    private RecyclerView.LayoutManager animeListManager;

    public AllAnimesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AllAnimesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AllAnimesFragment newInstance(String param1, String param2) {
        AllAnimesFragment fragment = new AllAnimesFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_all_animes, container, false);
        // Inflate the layout for this fragment

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
        Call<AnimeList> call = request.getAnimeList();
        call.enqueue(new Callback<AnimeList>() {
            @Override
            public void onResponse(Call<AnimeList> call, Response<AnimeList> response) {
                AnimeList animeListPojo = response.body();

               animeList = (RecyclerView) getView().findViewById(R.id.animeList);

                // use this setting to improve performance if you know that changes
                // in content do not change the layout size of the RecyclerView
                animeList.setHasFixedSize(true);

                // use a linear layout manager
                animeListManager = new LinearLayoutManager(getActivity());
                animeList.setLayoutManager(animeListManager);

                // specify an adapter (see also next example)
                animeListAdapter = new AnimeAdapter(getContext(), animeListPojo);
                animeList.setAdapter(animeListAdapter);
            }

            @Override
            public void onFailure(Call<AnimeList> call, Throwable t) {
                Log.d("Error",t.getMessage());
            }
        });
    }
}
