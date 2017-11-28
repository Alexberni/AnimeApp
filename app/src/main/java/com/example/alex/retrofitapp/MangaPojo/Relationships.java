
package com.example.alex.retrofitapp.MangaPojo;

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
    @SerializedName("chapters")
    @Expose
    private Chapters chapters;
    @SerializedName("mangaCharacters")
    @Expose
    private MangaCharacters mangaCharacters;
    @SerializedName("mangaStaff")
    @Expose
    private MangaStaff mangaStaff;

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

    public Chapters getChapters() {
        return chapters;
    }

    public void setChapters(Chapters chapters) {
        this.chapters = chapters;
    }

    public MangaCharacters getMangaCharacters() {
        return mangaCharacters;
    }

    public void setMangaCharacters(MangaCharacters mangaCharacters) {
        this.mangaCharacters = mangaCharacters;
    }

    public MangaStaff getMangaStaff() {
        return mangaStaff;
    }

    public void setMangaStaff(MangaStaff mangaStaff) {
        this.mangaStaff = mangaStaff;
    }

}
