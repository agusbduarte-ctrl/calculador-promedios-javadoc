package com.ejemplo.promedio;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                App.class.getResource("/com/ejemplo/promedios/primary.fxml")
        );
        Scene scene = new Scene(fxmlLoader.load(), 600, 550);
        stage.setTitle("Calculador de Promedios");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
