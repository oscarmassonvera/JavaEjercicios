package org.ejercicios.basico.Generics.Tres;

public class Auto implements Identificable<String> {
    private String patente, modelo, color;

    public Auto(String patente, String modelo, String color) {
        this.patente = patente;
        this.modelo = modelo;
        this.color = color;
    }


    @Override
    public String getId() {
        return patente;
    }

    @Override
    public void setId(String x) {
        this.patente  = x;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "patente='" + patente + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
