package com.example.goodweather;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WeatherAPIUtility {


    // TODO: 2022-11-23 switch to the current conditions call. Need to update classes
    public static void getLocalWeatherFromAPI(String town, String country) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://aerisweather1.p.rapidapi.com/observations/" + town + "," + country))
                .header("X-RapidAPI-Key", "e30f3125f8msh2e5985897865c95p1df032jsnba1fe8c4625d")
                .header("X-RapidAPI-Host", "aerisweather1.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<Path> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofFile(Paths.get("currentWeather.json")));
        System.out.println(response.body());
    }

    public static APIResponse readLocalWeatherFromFile()
    {
        Gson gson = new Gson();
        APIResponse apiResponse = null;

        try (
                FileReader fileReader = new FileReader("currentWeather.json");
                JsonReader jsonReader = new JsonReader(fileReader);
                )
        {
            apiResponse = gson.fromJson(jsonReader, APIResponse.class);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return apiResponse;
    }

    public static boolean checkForSaveFile() throws IOException {

        File fileLocation = new File("currentWeather.json").getAbsoluteFile();
        System.out.println(fileLocation);
        if(fileLocation.isFile())
            return true;
        else
            return false;
    }
}
