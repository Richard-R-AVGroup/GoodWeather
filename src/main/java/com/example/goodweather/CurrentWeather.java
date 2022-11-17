package com.example.goodweather;

import com.google.gson.annotations.SerializedName;

public class CurrentWeather {

    //Location
    @SerializedName("loc")
    Location location;
    @SerializedName("name")
    String station;
    @SerializedName("city")
    String nearestCity;
    @SerializedName("state")
    String stateOrProvince;
    @SerializedName("country")
    String country;

    //Weather
    @SerializedName("tempC")
    int tempC;
    @SerializedName("feelslikeC")
    int feelsLike;

    public String getStation() {
        return station;
    }

    public String getNearestCity() {
        return nearestCity;
    }

    public String getStateOrProvince() {
        return stateOrProvince;
    }

    public String getCountry() {
        return country;
    }

    public int getTempC() {
        return tempC;
    }

    public int getFeelsLike() {
        return feelsLike;
    }

    @Override
    public String toString()
    {
      return location.toString();
//                "CurrentWeather:\n" +
//                "station = " + station + '\n' +
//                "nearestCity = " + nearestCity + '\n' +
//                "stateOrProvince = " + stateOrProvince + '\n' +
//                "country = " + country + '\n' +
//                "tempC = " + tempC + '\n' +
//                "feelsLike = " + feelsLike;
    }
}
