package com.example.goodweather.views;

import com.example.goodweather.GoodWeatherApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.io.IOException;

public class SceneChanger{
    public static void changeScene(ActionEvent action, String viewName) throws IOException {
        FXMLLoader loader = new FXMLLoader(GoodWeatherApplication.class.getResource(viewName));
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage)((Node)action.getSource()).getScene().getWindow();
        stage.setTitle("Goodweather");
        stage.setScene(scene);
        stage.show();
    }

}
