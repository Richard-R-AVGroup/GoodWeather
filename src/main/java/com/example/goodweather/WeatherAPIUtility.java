package com.example.goodweather;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WeatherAPIUtility {

    public static void getLocalWeatherFromAPI() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://aerisweather1.p.rapidapi.com/forecasts/cairo,eg"))
                .header("X-RapidAPI-Key", "e30f3125f8msh2e5985897865c95p1df032jsnba1fe8c4625d")
                .header("X-RapidAPI-Host", "aerisweather1.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<Path> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofFile(Paths.get("currentWeather.json")));
        System.out.println(response.body());
    }

    public static void readLocalWeatherFromFile()
    {
        Gson gson = new Gson();
    }
}
