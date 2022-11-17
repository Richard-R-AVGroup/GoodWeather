package com.example.goodweather;

import com.google.gson.annotations.SerializedName;

public class APIResponse {

    @SerializedName("response")
    private CurrentWeather[] currentWeather;

    public CurrentWeather getCurrentWeather() {
        return currentWeather[0];
    }
}
