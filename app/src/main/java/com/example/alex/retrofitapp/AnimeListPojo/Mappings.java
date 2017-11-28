
package com.example.alex.retrofitapp.AnimeListPojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Mappings {

    @SerializedName("links")
    @Expose
    private Links_____ links;

    public Links_____ getLinks() {
        return links;
    }

    public void setLinks(Links_____ links) {
        this.links = links;
    }

}
