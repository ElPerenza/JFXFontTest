module com.example.fonttest {

    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.fonttest to javafx.fxml;
    exports com.example.fonttest;
}