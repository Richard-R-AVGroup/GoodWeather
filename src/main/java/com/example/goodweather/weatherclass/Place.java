package com.example.goodweather.weatherclass;

public class Place {

    private String name;
    private String city;
    private String state;
    private String country;

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
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
