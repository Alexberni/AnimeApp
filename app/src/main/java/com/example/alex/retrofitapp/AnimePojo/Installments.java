
package com.example.alex.retrofitapp.AnimePojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Installments {

    @SerializedName("links")
    @Expose
    private Links____ links;

    public Links____ getLinks() {
        return links;
    }

    public void setLinks(Links____ links) {
        this.links = links;
    }

}
