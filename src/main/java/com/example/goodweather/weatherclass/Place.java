package com.example.goodweather.weatherclass;

public class Place {

    private String name;
    private String city;
    private String state;
    private String country;

    public String getName() {

        String firstLetter = name;
        String temp = "";

        temp = firstLetter.substring(0,1).toUpperCase() + name.substring(1,name.length());

        return temp;
    }

    public String getCity() {
        String firstLetter = city;
        String temp = "";

        temp = firstLetter.substring(0,1).toUpperCase() + name.substring(1,name.length());

        return temp;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return  "   name=" + name + '\n' +
                "   city=" + city + '\n' +
                "   state=" + state + '\n' +
                "   country=" + country + '\n';
    }
}
