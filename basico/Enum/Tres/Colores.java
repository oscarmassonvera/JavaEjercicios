package org.ejercicios.basico.Enum.Tres;

public enum Colores {
    ROJO("Rojo(Red)"),
    AZUL("Azul(Blue)"),
    VERDE("Verde(Green)");

    public final String color;

    Colores(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
