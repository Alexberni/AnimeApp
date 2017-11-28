package com.example.alex.retrofitapp;

/**
 * Created by alex on 27/11/17.
 */
import com.example.alex.retrofitapp.AnimeListPojo.AnimeList;
import com.example.alex.retrofitapp.AnimePojo.Anime;

import retrofit2.Call;
import retrofit2.http.GET;

public interface KitsuServices {
    @GET("anime/7036")
    Call<Anime> getAnime();

    @GET("anime?page[limit]=20&page[offset]=0?filter[genres]=adventure")
    Call<AnimeList> getAnimeList();
}
