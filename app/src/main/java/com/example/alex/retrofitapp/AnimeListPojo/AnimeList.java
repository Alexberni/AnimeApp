
package com.example.alex.retrofitapp.AnimeListPojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AnimeList {

    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("meta")
    @Expose
    private Meta_ meta;
    @SerializedName("links")
    @Expose
    private Links_____________ links;

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Meta_ getMeta() {
        return meta;
    }

    public void setMeta(Meta_ meta) {
        this.meta = meta;
    }

    public Links_____________ getLinks() {
        return links;
    }

    public void setLinks(Links_____________ links) {
        this.links = links;
    }

}
