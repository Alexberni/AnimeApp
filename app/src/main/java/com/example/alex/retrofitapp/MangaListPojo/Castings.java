
package com.example.alex.retrofitapp.MangaListPojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Castings {

    @SerializedName("links")
    @Expose
    private Links___ links;

    public Links___ getLinks() {
        return links;
    }

    public void setLinks(Links___ links) {
        this.links = links;
    }

}
