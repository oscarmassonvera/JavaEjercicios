package org.ejercicios.basico.Enum.Dos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Ejercicio: Crea una enumeración llamada "Estaciones" que
           tenga las cuatro estaciones del año como valores (Primavera,
           Verano, Otoño, Invierno). Luego, escriba un programa que
           permita al usuario ingresar una estación y muestre
           la estación siguiente en el ciclo de las estaciones.
           Por ejemplo, si el usuario ingresa "Verano",
           el programa debe mostrar "Otoño".*/
        System.out.println("Escribe una estacion: ");
        Scanner sc = new Scanner(System.in);
        String estacion = sc.next();

        Proceso uno = new Proceso( estacion.toUpperCase() );
        uno.mostrar();
    }
}
