module com.example.goodweather {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;


    opens com.example.goodweather to javafx.fxml, com.google.gson;
    exports com.example.goodweather;
    exports com.example.goodweather.weatherclass;
    opens com.example.goodweather.weatherclass to com.google.gson, javafx.fxml;
    exports com.example.goodweather.views;
    opens com.example.goodweather.views to com.google.gson, javafx.fxml;
}