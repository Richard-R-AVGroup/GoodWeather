package com.example.goodweather;

import java.util.Locale;

public final class SessionInfo {

    private static String city;
    private static String country;

    private SessionInfo(){

    }

    public static String getCity()
    {
        if(city != null) {
            String adjusted = "";
            adjusted = city.replace(" ", "").toLowerCase(Locale.ROOT);
            return adjusted;
        }
        return null;
    }

    public static void setCity(String city)
    {
        SessionInfo.city = city.trim();
    }

    public static String getCountry()
    {
        if(country != null) {
            String adjusted = "";
            adjusted = country.replace(" ", "").toLowerCase(Locale.ROOT);
            return adjusted;
        }
        return null;
    }

    public static void setCountry(String country) {
        SessionInfo.country = country.trim();
    }
}
