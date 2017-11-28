package com.example.alex.retrofitapp;

/**
 * Created by alex on 27/11/17.
 */
import com.example.alex.retrofitapp.AnimeListPojo.AnimeList;
import com.example.alex.retrofitapp.AnimePojo.Anime;
import com.example.alex.retrofitapp.MangaListPojo.MangaList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface KitsuServices {
    @GET("anime/12")
    Call<Anime> getAnime();

    @GET("anime?page[limit]=20&page[offset]=0")
    Call<AnimeList> getAnimeList();

    @GET("manga?page[limit]=20&page[offset]=0")
    Call<MangaList> getMangaList();

}
