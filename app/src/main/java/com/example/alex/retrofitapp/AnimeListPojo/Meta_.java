
package com.example.alex.retrofitapp.AnimeListPojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta_ {

    @SerializedName("count")
    @Expose
    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}
