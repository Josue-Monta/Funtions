module com.example.funciones_y_switch {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.funciones_y_switch to javafx.fxml;
    exports com.example.funciones_y_switch;
}