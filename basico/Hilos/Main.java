package org.ejercicios.basico.Hilos;

public class Main {
    public static void main(String[] args) {
        ProcesoUno hilo1 = new ProcesoUno();
        Thread hilo2 = new Thread(new PocesoDos());

        hilo1.start();
        hilo2.start();
    }
}
