package com.example.goodweather;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherAPIUtility {

    public static void getLocalWeatherFromAPI() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://aerisweather1.p.rapidapi.com/forecasts/cairo,eg"))
                .header("X-RapidAPI-Key", "e30f3125f8msh2e5985897865c95p1df032jsnba1fe8c4625d")
                .header("X-RapidAPI-Host", "aerisweather1.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
