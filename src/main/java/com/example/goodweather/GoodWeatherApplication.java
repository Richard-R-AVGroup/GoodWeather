package com.example.goodweather;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GoodWeatherApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GoodWeatherApplication.class.getResource("home-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Good Weather!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {



//        APIResponse apiResponse = WeatherAPIUtility.readLocalWeatherFromFile();
//
//        CurrentWeather weather = apiResponse.getCurrentWeather();
//        System.out.println(apiResponse.getCurrentWeather());

//        try {
//            WeatherAPIUtility.getLocalWeatherFromAPI();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        launch();
    }
}