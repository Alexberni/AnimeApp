
package com.example.alex.retrofitapp.MangaListPojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MangaList {

    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("meta")
    @Expose
    private Meta__ meta;
    @SerializedName("links")
    @Expose
    private Links___________ links;

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Meta__ getMeta() {
        return meta;
    }

    public void setMeta(Meta__ meta) {
        this.meta = meta;
    }

    public Links___________ getLinks() {
        return links;
    }

    public void setLinks(Links___________ links) {
        this.links = links;
    }

}
