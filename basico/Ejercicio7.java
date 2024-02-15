package org.ejercicios.basico;
import java.util.Scanner;
public class Ejercicio7 {
    /* Escribe un programa que calcule el total de una factura
       a partir de la base imponible(precio sin IVA). */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        escogerProducto();
    }
    public static void escogerProducto()
    {
       double resultado = 0;
       while ( true ){
           System.out.println("" +
                   "Escribe el numero del producto " +
                   "que deseas escoger: \n" +
                   "1.\t Pan \t 0.10 \n" +
                   "2.\t Pollo libra \t 3.10 \n"+
                   "0.\t salir ");
           int productoEscogido = entrada.nextInt();
           entrada.nextLine();
           if (productoEscogido == 0 ){ break; }
           System.out.println("Cantidad del producto.");
           int cantidad = entrada.nextInt();
           entrada.nextLine();
           if (productoEscogido == 1){ resultado =  0.10 * cantidad + resultado ;}
           else if (productoEscogido == 2){ resultado = 3.10 * cantidad + resultado ;}
           System.out.println("Total a pagar hasta haora : \t " + resultado );
       }
    }


}
