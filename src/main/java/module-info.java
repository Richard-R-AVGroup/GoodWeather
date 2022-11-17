module com.example.goodweather {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.goodweather to javafx.fxml;
    exports com.example.goodweather;
}