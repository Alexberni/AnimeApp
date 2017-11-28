
package com.example.alex.retrofitapp.AnimePojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Relationships {

    @SerializedName("genres")
    @Expose
    private Genres genres;
    @SerializedName("categories")
    @Expose
    private Categories categories;
    @SerializedName("castings")
    @Expose
    private Castings castings;
    @SerializedName("installments")
    @Expose
    private Installments installments;
    @SerializedName("mappings")
    @Expose
    private Mappings mappings;
    @SerializedName("reviews")
    @Expose
    private Reviews reviews;
    @SerializedName("mediaRelationships")
    @Expose
    private MediaRelationships mediaRelationships;
    @SerializedName("episodes")
    @Expose
    private Episodes episodes;
    @SerializedName("streamingLinks")
    @Expose
    private StreamingLinks streamingLinks;
    @SerializedName("animeProductions")
    @Expose
    private AnimeProductions animeProductions;
    @SerializedName("animeCharacters")
    @Expose
    private AnimeCharacters animeCharacters;
    @SerializedName("animeStaff")
    @Expose
    private AnimeStaff animeStaff;

    public Genres getGenres() {
        return genres;
    }

    public void setGenres(Genres genres) {
        this.genres = genres;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public Castings getCastings() {
        return castings;
    }

    public void setCastings(Castings castings) {
        this.castings = castings;
    }

    public Installments getInstallments() {
        return installments;
    }

    public void setInstallments(Installments installments) {
        this.installments = installments;
    }

    public Mappings getMappings() {
        return mappings;
    }

    public void setMappings(Mappings mappings) {
        this.mappings = mappings;
    }

    public Reviews getReviews() {
        return reviews;
    }

    public void setReviews(Reviews reviews) {
        this.reviews = reviews;
    }

    public MediaRelationships getMediaRelationships() {
        return mediaRelationships;
    }

    public void setMediaRelationships(MediaRelationships mediaRelationships) {
        this.mediaRelationships = mediaRelationships;
    }

    public Episodes getEpisodes() {
        return episodes;
    }

    public void setEpisodes(Episodes episodes) {
        this.episodes = episodes;
    }

    public StreamingLinks getStreamingLinks() {
        return streamingLinks;
    }

    public void setStreamingLinks(StreamingLinks streamingLinks) {
        this.streamingLinks = streamingLinks;
    }

    public AnimeProductions getAnimeProductions() {
        return animeProductions;
    }

    public void setAnimeProductions(AnimeProductions animeProductions) {
        this.animeProductions = animeProductions;
    }

    public AnimeCharacters getAnimeCharacters() {
        return animeCharacters;
    }

    public void setAnimeCharacters(AnimeCharacters animeCharacters) {
        this.animeCharacters = animeCharacters;
    }

    public AnimeStaff getAnimeStaff() {
        return animeStaff;
    }

    public void setAnimeStaff(AnimeStaff animeStaff) {
        this.animeStaff = animeStaff;
    }

}
