package org.ejercicios.basico.Enum.Dos;

public class Proceso {
    private Estaciones estacion;

    public Proceso(String estacion) {
        this.estacion = Estaciones.valueOf(estacion);
    }

    public void setEstacion(Estaciones estacion) {
        this.estacion = estacion;
    }

    public void mostrar()
    {
        switch (estacion)
        {
            case PRIMAVERA:
                System.out.println(Estaciones.VERANO);
                break;
            case VERANO:
                System.out.println(Estaciones.OTONO);
                break;
            case OTONO:
                System.out.println(Estaciones.INVIERNO);
                break;
            case INVIERNO:
                System.out.println(Estaciones.PRIMAVERA);
                break;
            default:
                throw new IllegalStateException("Valor desconocido: " + estacion);
        }
    }
}
