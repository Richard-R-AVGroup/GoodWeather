package com.example.goodweather;

import com.google.gson.annotations.SerializedName;

public class APIResponse {

    @SerializedName("response")
    private CurrentWeather currentWeather;
//    @SerializedName("error")
//    private Error error;

    public CurrentWeather getCurrentWeather() {
        return currentWeather;
    }

}
