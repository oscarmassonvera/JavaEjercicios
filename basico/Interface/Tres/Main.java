package org.ejercicios.basico.Interface.Tres;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        /*Escribe una clase, de nombre PruebaPila, en la que se implementen dos métodos:
          rellenar(): recibe por parámetro un objeto de tipo ColeccionInterfaz, y añade
          los números del 1 al 10.
          imprimirYVaciar(): recibe por parámetro un objeto de tipo ColeccionInterfaz y
          va extrayendo e imprimiendo los datos de la colección hasta que se quede vacía.
          Crea el objeto de tipo Pila.*/

        Collection<Integer> x = new ArrayList<>(10);
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        x.add(5);
        x.add(6);
        x.add(7);
        x.add(8);
        x.add(9);
        x.add(10);
        PruebaPila pila = new PruebaPila();
        System.out.println(pila.rellenar(x));
        pila.imprimirYVaciar(x);
    }
}
