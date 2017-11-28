
package com.example.alex.retrofitapp.AnimeListPojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Episodes {

    @SerializedName("links")
    @Expose
    private Links________ links;

    public Links________ getLinks() {
        return links;
    }

    public void setLinks(Links________ links) {
        this.links = links;
    }

}
