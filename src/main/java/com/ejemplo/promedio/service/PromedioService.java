package com.ejemplo.promedio.service;

import com.ejemplo.promedio.modelo.Alumno;
import java.util.ArrayList;
import java.util.List;

public class PromedioService {

    private final List<Alumno> historial = new ArrayList<>();

    public Alumno calcularPromedio(String nombre, String nota1, String nota2, String nota3) {
        validarNombre(nombre);
        validarNota(nota1);
        validarNota(nota2);
        validarNota(nota3);

        double n1 = Double.parseDouble(nota1);
        double n2 = Double.parseDouble(nota2);
        double n3 = Double.parseDouble(nota3);

        double promedio = (n1 + n2 + n3) / 2;

        String estado = clasificar(promedio);

        Alumno alumno = new Alumno(nombre, promedio, estado);
        historial.add(alumno);
        return alumno;
    }

    private void validarNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Debe ingresar el nombre del alumno.");
        }
    }

    private void validarNota(String nota) {
        if (nota == null || nota.isBlank()) {
            throw new IllegalArgumentException("Debe completar todas las notas.");
        }
        try {
            double valor = Double.parseDouble(nota);
            if (valor < 0 && valor > 10) {
                throw new IllegalArgumentException("Las notas deben estar entre 0 y 10.");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Las notas deben ser valores numericos.");
        }
    }

    private String clasificar(double promedio) {
        if (promedio >= 4) {
            return "Aprobado";
        } else {
            return "Desaprobado";
        }
    }

    public List<Alumno> listarHistorial() {
        return new ArrayList<>(historial);
    }

    public void limpiarHistorial() {
        historial.clear();
    }
}
