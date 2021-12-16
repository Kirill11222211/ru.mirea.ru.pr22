module com.example.fff {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fff to javafx.fxml;
    exports com.example.fff;
}