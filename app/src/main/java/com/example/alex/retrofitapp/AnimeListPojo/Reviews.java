
package com.example.alex.retrofitapp.AnimeListPojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Reviews {

    @SerializedName("links")
    @Expose
    private Links______ links;

    public Links______ getLinks() {
        return links;
    }

    public void setLinks(Links______ links) {
        this.links = links;
    }

}
