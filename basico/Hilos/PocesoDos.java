package org.ejercicios.basico.Hilos;

public class PocesoDos implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i<=5;i++)
        {
            System.out.println("Proceso DOS");
        }
    }
}
