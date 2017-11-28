
package com.example.alex.retrofitapp.MangaListPojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MediaRelationships {

    @SerializedName("links")
    @Expose
    private Links_______ links;

    public Links_______ getLinks() {
        return links;
    }

    public void setLinks(Links_______ links) {
        this.links = links;
    }

}
