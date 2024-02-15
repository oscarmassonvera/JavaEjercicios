package org.ejercicios.basico;

public class Ejercicio1 {
    /*Escribe tu nombre por pantalla, tu direccion y numero de telefono.
    * los datos se deben mostrar en lineas separadas. */

    private static String nombre = "oscar";
    private static String direccion = "xxxx 1000 etapa";
    private static String NTelefono = "0954545423";

    public static void main(String[] args) {
        System.out.println(
                "Nombre: " + nombre + "\n"+
                "Direccion: " + direccion + "\n" +
                "Telefono: " + NTelefono
        );
    }
}
