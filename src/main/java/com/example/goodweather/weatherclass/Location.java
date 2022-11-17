package com.example.goodweather.weatherclass;

import com.google.gson.annotations.SerializedName;

public class Location {

    @SerializedName("long")
    private float longitude;
    @SerializedName("lat")
    private float latitude;

    public float getLongitude() {
        return longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    @Override
    public String toString() {
        return  "longitude=" + longitude +
                ", latitude=" + latitude
                ;
    }
}
