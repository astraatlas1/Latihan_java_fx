module com.example.latihan4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.latihan4 to javafx.fxml;
    exports com.example.latihan4;
}