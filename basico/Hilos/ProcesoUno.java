package org.ejercicios.basico.Hilos;

public class ProcesoUno extends Thread {
    @Override
    public void run() {
        for (int i = 0; i<=5;i++)
        {
            System.out.println("Proceso UNo");
        }
    }
}
