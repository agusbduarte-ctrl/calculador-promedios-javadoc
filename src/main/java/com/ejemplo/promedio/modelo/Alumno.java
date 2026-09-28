package com.ejemplo.promedio.modelo;

import java.text.DecimalFormat;

public class Alumno {

    private static final DecimalFormat FORMATO = new DecimalFormat("0.00");

    private final String nombre;
    private final double promedio;
    private final String estado;

    public Alumno(String nombre, double promedio, String estado) {
        this.nombre = nombre;
        this.promedio = promedio;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return nombre + " - Promedio: " + FORMATO.format(promedio) + " - " + estado;
    }
}
