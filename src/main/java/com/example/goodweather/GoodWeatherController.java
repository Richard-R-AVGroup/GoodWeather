package com.example.goodweather;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class GoodWeatherController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}