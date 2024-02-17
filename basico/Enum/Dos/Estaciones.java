package org.ejercicios.basico.Enum.Dos;

public enum Estaciones {
    PRIMAVERA("Primavera"),
    VERANO("Verano"),
    OTONO("Otono"),
    INVIERNO("Invierno");
    public final String estacion;

    Estaciones(String estacion) {
        this.estacion = estacion;
    }

    public String getEstacion() {
        return estacion;
    }
}
