package com.example.goodweather;

import com.example.goodweather.weatherclass.Location;
import com.example.goodweather.weatherclass.Place;
import com.google.gson.annotations.SerializedName;

public class CurrentWeather {

    //Location
    @SerializedName("loc")
    Location location;
    @SerializedName("place")
    Place place;

    //Weather
    @SerializedName("tempC")
    int tempC;
    @SerializedName("feelslikeC")
    int feelsLike;


    public int getTempC() {
        return tempC;
    }

    public int getFeelsLike() {
        return feelsLike;
    }

    @Override
    public String toString()
    {
      return "CurrentWeather:\n\n" +
                "Location = " + location.toString() + "\n" +
                "Place: \n" + place.toString();
//
//                "station = " + station + '\n' +
//                "nearestCity = " + nearestCity + '\n' +
//                "stateOrProvince = " + stateOrProvince + '\n' +
//                "country = " + country + '\n' +
//                "tempC = " + tempC + '\n' +
//                "feelsLike = " + feelsLike;
    }
}
