package com.example.alex.retrofitapp;

/**
 * Created by alex on 27/11/17.
 */
import com.example.alex.retrofitapp.AnimeListPojo.AnimeList;
import com.example.alex.retrofitapp.AnimePojo.Anime;
import com.example.alex.retrofitapp.MangaListPojo.MangaList;
import com.example.alex.retrofitapp.MangaPojo.Manga;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface KitsuServices {
    @GET("anime/{id}")
    Call<Anime> getAnime(@Path("id") String id);

    @GET("anime?page[limit]=20&page[offset]=0")
    Call<AnimeList> getAnimeList();

    @GET("manga?page[limit]=20&page[offset]=0")
    Call<MangaList> getMangaList();

    @GET("manga/{id}")
    Call<Manga> getManga(@Path("id") String id);

}
