
package com.example.alex.retrofitapp.MangaPojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MangaStaff {

    @SerializedName("links")
    @Expose
    private Links__________ links;

    public Links__________ getLinks() {
        return links;
    }

    public void setLinks(Links__________ links) {
        this.links = links;
    }

}
