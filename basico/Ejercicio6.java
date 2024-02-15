package org.ejercicios.basico;

import java.util.Scanner;

public class Ejercicio6 {
    /* Realiza un conversor de euros a dolares. */

    static Scanner entrada = new Scanner(System.in);
    public static final String DOLARES = "dolares";
    public static void main(String[] args) {
        double euros = introducirEuros();
        double cambio = cambioMoneda(euros);
        System.out.println("El resultado de la conversión es "
                + String.format("%.2f", cambio));
    }
    public static double introducirEuros() {
        System.out.print("Introduce una cantidad de euros: ");
        double euros = entrada.nextDouble();
        entrada.nextLine();
        return euros;
    }
    public static double cambioMoneda(double euros)
    {
        double cambio = euros * 2.11;
        return cambio;
    }
}
