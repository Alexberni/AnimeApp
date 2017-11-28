
package com.example.alex.retrofitapp.MangaListPojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Titles {

    @SerializedName("en")
    @Expose
    private Object en;
    @SerializedName("en_jp")
    @Expose
    private String enJp;

    public Object getEn() {
        return en;
    }

    public void setEn(Object en) {
        this.en = en;
    }

    public String getEnJp() {
        return enJp;
    }

    public void setEnJp(String enJp) {
        this.enJp = enJp;
    }

}
