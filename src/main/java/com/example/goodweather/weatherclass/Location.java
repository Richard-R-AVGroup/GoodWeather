package com.example.goodweather.weatherclass;

import com.google.gson.annotations.SerializedName;

public class Location {

    @SerializedName("long")
    float longitude;
    @SerializedName("lat")
    float latitude;

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
