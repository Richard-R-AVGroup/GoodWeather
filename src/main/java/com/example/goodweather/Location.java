package com.example.goodweather;

import com.google.gson.annotations.SerializedName;

public class Location {

    @SerializedName("long")
    float longitude;
    @SerializedName("lat")
    float latitude;

    @Override
    public String toString() {
        return "Location{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}
