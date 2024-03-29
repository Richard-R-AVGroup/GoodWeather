package com.example.goodweather.weatherclass;

import com.google.gson.annotations.SerializedName;

public class Info {

    @SerializedName("tempC")
    private int tempC;
    private int windSpeedKPH;
    private int humidity;
    private String weather;
    @SerializedName("feelslikeC")
    private float feelsLike;

    public String getTempC() {
        return String.valueOf(tempC);
    }

    public int getWindKPH() {
        return windSpeedKPH;
    }

    public int getHumidity() {
        return humidity;
    }

    public String getWeather() {
        return weather;
    }

    public float getFeelsLike() {
        return feelsLike;
    }

    @Override
    public String toString() {
        return  "   tempC=" + tempC + "\n" +
                "   windKPH=" + windSpeedKPH + "\n" +
                "   humidity=" + humidity + "\n" +
                "   weather=" + weather + "\n" +
                "   feelsLike=" + feelsLike;
    }
}
