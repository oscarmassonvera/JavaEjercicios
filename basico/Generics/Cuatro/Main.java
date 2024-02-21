package org.ejercicios.basico.Generics.Cuatro;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Dado un array de datos de tipo T, devuelve el primero que no es null.*/
        String[] datos = { null, "uno", "dos" };
        System.out.println(Proceso.primerNoNull(datos));
        /*Dado un dato de tipo T, crea una lista con dos elementos, que son dicho dato.*/
        List<String> bora_bora = Proceso.parejaDeDatos("bora");
        System.out.println( bora_bora );
    }
}
