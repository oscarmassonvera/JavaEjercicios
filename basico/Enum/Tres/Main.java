package org.ejercicios.basico.Enum.Tres;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Ejercicio: Crea una enumeración llamada "Colores" que
        tenga los colores básicos como valores (Rojo, Azul,
        Verde). Luego, escriba un programa que permita al
        usuario seleccionar un color y muestre su nombre
        en inglés y en español. Por ejemplo, si el usuario
        selecciona "Rojo", el programa debe mostrar "Red
        (Rojo)". */

        System.out.println("Elige una opcion: \n"+
                           "1. \t Azul  \n" +
                           "2. \t Rojo  \n" +
                           "3. \t Verde \n");
        Scanner cs = new Scanner(System.in);
         int color = Integer.parseInt(Integer.toString(cs.nextInt()));

        Proceso color1 = new Proceso(color);
        color1.mostrar();
    }
}
