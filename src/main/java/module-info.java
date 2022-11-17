module com.example.goodweather {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;


    opens com.example.goodweather to javafx.fxml, com.google.gson;
    exports com.example.goodweather;
}