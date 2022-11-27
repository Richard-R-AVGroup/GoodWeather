package com.example.goodweather;

import com.example.goodweather.weatherclass.Info;
import com.example.goodweather.weatherclass.Location;
import com.example.goodweather.weatherclass.Place;
import com.google.gson.annotations.SerializedName;

public class CurrentWeather {

    //Location
    @SerializedName("loc")
    private Location location;
    @SerializedName("place")
    private Place place;

    //Weather
    @SerializedName("ob")
    private Info info;

    public Location getLocation() {
        return location;
    }

    public Place getPlace() {
        return place;
    }

    public Info getInfo() {
        return info;
    }

    @Override
    public String toString()
    {
      return "CurrentWeather:\n" +
                "Location = " + location.toString() + "\n" +
                "Place: \n" + place.toString() + "\n" +
                "Info: \n" + info.toString();
    }
}
