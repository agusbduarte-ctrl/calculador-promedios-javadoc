package com.ejemplo.promedio.controller;

import com.ejemplo.promedio.modelo.Alumno;

import com.ejemplo.promedio.service.PromedioService;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtNota1;

    @FXML
    private TextField txtNota2;

    @FXML
    private TextField txtNota3;

    @FXML
    private Label lblResultado;

    @FXML
    private ListView<Alumno> listaHistorial;

    private final PromedioService promedioService = new PromedioService();

    @FXML
    private void calcular() {
        try {
            Alumno alumno = promedioService.calcularPromedio(
                    txtNombre.getText(),
                    txtNota1.getText(),
                    txtNota2.getText(),
                    txtNota3.getText()
            );

            lblResultado.setText(alumno.toString());
            actualizarHistorial();

        } catch (IllegalArgumentException e) {
            lblResultado.setText("Error: " + e.getMessage());
        }
    }

    @FXML
    private void limpiar() {
        txtNombre.clear();
        txtNota1.clear();
        txtNota2.clear();
        txtNota3.clear();
        lblResultado.setText("");
        txtNombre.requestFocus();
    }

    @FXML
    private void limpiarHistorial() {
        // Completar
    }

    private void actualizarHistorial() {
       //// Completar1
    }
}
