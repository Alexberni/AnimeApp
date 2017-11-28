
package com.example.alex.retrofitapp.MangaPojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta_ {

    @SerializedName("dimensions")
    @Expose
    private Dimensions_ dimensions;

    public Dimensions_ getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions_ dimensions) {
        this.dimensions = dimensions;
    }

}
