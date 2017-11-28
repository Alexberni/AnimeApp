
package com.example.alex.retrofitapp.AnimeListPojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AnimeCharacters {

    @SerializedName("links")
    @Expose
    private Links___________ links;

    public Links___________ getLinks() {
        return links;
    }

    public void setLinks(Links___________ links) {
        this.links = links;
    }

}
