module com.ejemplo.promedio {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ejemplo.promedios to javafx.fxml;
    opens com.ejemplo.promedio.controller to javafx.fxml;
    opens com.ejemplo.promedio.modelo to javafx.fxml;
    
    exports com.ejemplo.promedio;
}
