package com.example.goodweather.views;

import com.example.goodweather.APIResponse;
import com.example.goodweather.SessionInfo;
import com.example.goodweather.WeatherAPIUtility;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.SceneAntialiasing;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class GoodWeatherSearchController implements Initializable {

    boolean loaded;

    @FXML
    private Button backButton;

    @FXML
    private TextField cityInput;

    @FXML
    private TextField countryInput;

    @FXML
    private Label locationLabel;

    @FXML
    private Button refreshButton;

    @FXML
    private Button searchButton;

    @FXML
    private Label tempLabel;

    @FXML
    private ImageView weatherImage;

    @FXML
    private TextArea weatherTextArea;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loaded = false;
        try {

            if(WeatherAPIUtility.checkForSaveFile())
            {
                refreshInfo();

            }
            else
            {
                return;
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * If there is a valid location entered(not empty), we will read from the file and set the label
     * The information will be saved to a singleton if needed in the future
     */
    @FXML
    public void getWeather()
    {
        try {
            if (cityInput.getText() != "" && countryInput.getText() != "") {

                //Read the json object from the file
                APIResponse apiResponse = new APIResponse();

                WeatherAPIUtility.getLocalWeatherFromAPI(cityInput.getText(), countryInput.getText());
                apiResponse = WeatherAPIUtility.readLocalWeatherFromFile();

                if(apiResponse == null)
                {
                    weatherTextArea.setText("Not a Valid Location, Please Try Again.");
                }

                SessionInfo.setCity(cityInput.getText());
                SessionInfo.setCountry(countryInput.getText());

                //Update the location label
                locationLabel.textProperty().setValue(apiResponse.getCurrentWeather().getPlace().getName() + ", " +
                        apiResponse.getCurrentWeather().getPlace().getState().toUpperCase() + ", " +
                        apiResponse.getCurrentWeather().getPlace().getCountry().toUpperCase());

                //update the temp label
                tempLabel.textProperty().setValue(apiResponse.getCurrentWeather().getInfo().getTempC() + "\u00B0");

                //update the weather information text area
                weatherTextArea.setText(apiResponse.getCurrentWeather().getInfo().toString());

            }
            else
            {
                weatherTextArea.setText("Invalid Input, Please Try Again.");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * If there has been a searched location then call the api again and update the information
     * @throws IOException
     * @throws InterruptedException
     */
    @FXML
    public void refreshInfo() throws IOException, InterruptedException {
        if(WeatherAPIUtility.checkForSaveFile()) {
            //get the information from the API, store, and read the file
            APIResponse apiResponse;
            if(SessionInfo.getCountry() != null || SessionInfo.getCity() != null)
            {
                WeatherAPIUtility.getLocalWeatherFromAPI(SessionInfo.getCity()
                        , SessionInfo.getCountry());
            }
            apiResponse = WeatherAPIUtility.readLocalWeatherFromFile();

            if(apiResponse != null) {

                //set the temp label to the temp
                tempLabel.textProperty().setValue(apiResponse.getCurrentWeather().getInfo().getTempC() + "\u00B0");

                //display weather information
                weatherTextArea.setText(apiResponse.getCurrentWeather().getInfo().toString());

                locationLabel.setText(apiResponse.getCurrentWeather().getPlace().getName() + ", " +
                        apiResponse.getCurrentWeather().getPlace().getState().toUpperCase() + ", " +
                        apiResponse.getCurrentWeather().getPlace().getCountry().toUpperCase());
            }
        }
    }

    private String scrub(String phrase)
    {
        String temp = "";
        temp = phrase.trim().toLowerCase(Locale.ROOT).replace(" ", "");
        return temp;
    }

    @FXML
    public void mainView(ActionEvent event) throws IOException {
        SceneChanger.changeScene(event, "home-view.fxml");
    }
}
