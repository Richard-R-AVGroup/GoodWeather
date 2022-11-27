package com.example.goodweather;

public final class SessionInfo {

    private static String city;
    private static String country;

    private SessionInfo(){

    }

    public static String getCity() {
        return city;
    }

    public static void setCity(String city) {
        SessionInfo.city = city;
    }

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        SessionInfo.country = country;
    }
}
