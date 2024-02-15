package org.ejercicios.basico;

public class Ejercicio5 {
    /* Escribe un programa en el que se declaren las variables enteras
       x y asignales los valores 144 y 999 , a continuacion muestra por
       pantalla el valor de cada variable, la suma, la resta, la division
       y la multiplicacion.
    * */

    static float x = 144;
    static float y = 999;
    public static void main(String[] args) {
        System.out.println(
                "Suma: \t "+(x+y) + "\n" +
                "Resta: \t "+(x-y) + "\n" +
                "Multiplicacion: \t "+(x*y) + "\n" +
                "Division: \t "+(x/y) + "\n"
        );
    }
}
