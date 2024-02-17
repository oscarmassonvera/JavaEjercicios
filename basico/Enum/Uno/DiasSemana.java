package org.ejercicios.basico.Enum.Uno;

public enum DiasSemana {
    LUNES("Lunes"),
    MARTES("Martes"),
    MIERCOLES("Miercoles"),
    JUEVES("Jueves"),
    VIERNES("Viernes"),
    SABADO("Sabado"),
    DOMINGO("Domingo");
    public final String dias;
    DiasSemana(String dias) {
        this.dias = dias;
    }

    public String getDias() {
        return dias;
    }
}
