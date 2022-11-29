package com.example.goodweather.views;

import com.example.goodweather.APIResponse;
import com.example.goodweather.SessionInfo;
import com.example.goodweather.WeatherAPIUtility;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GoodWeatherHomeController implements Initializable {

    @FXML
    private Button exitButton;

    @FXML
    private Label locationLabel;

    @FXML
    private Button searchButton;

    @FXML
    private Button settingsButton;

    @FXML
    private Label tempLabel;

    @FXML
    private ImageView weatherImage;

    @FXML
    public void searchScene(ActionEvent event) throws IOException
    {
        SceneChanger.changeScene(event, "good-weather-view.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        try {
            if(WeatherAPIUtility.checkForSaveFile())
            {
                APIResponse apiResponse;
                apiResponse = WeatherAPIUtility.readLocalWeatherFromFile();

                locationLabel.textProperty().setValue(apiResponse.getCurrentWeather().getPlace().getName() + ", " +
                        apiResponse.getCurrentWeather().getPlace().getState().toUpperCase() + ", " +
                        apiResponse.getCurrentWeather().getPlace().getCountry().toUpperCase());

                tempLabel.textProperty().setValue(apiResponse.getCurrentWeather().getInfo().getTempC() + "\u00B0");
            }
            else
            {
                return;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exitProgram()
    {
        System.exit(0);
    }
}