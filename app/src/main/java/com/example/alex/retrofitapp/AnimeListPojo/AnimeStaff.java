
package com.example.alex.retrofitapp.AnimeListPojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AnimeStaff {

    @SerializedName("links")
    @Expose
    private Links____________ links;

    public Links____________ getLinks() {
        return links;
    }

    public void setLinks(Links____________ links) {
        this.links = links;
    }

}
