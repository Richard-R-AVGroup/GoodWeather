package com.example.goodweather.weatherclass;

import com.google.gson.annotations.SerializedName;

public class Error {
    @SerializedName("code")
    private String code;
    @SerializedName("description")
    private String description;
}
