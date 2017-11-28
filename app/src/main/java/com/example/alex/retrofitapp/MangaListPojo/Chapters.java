
package com.example.alex.retrofitapp.MangaListPojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Chapters {

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
