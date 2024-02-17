package org.ejercicios.basico.Enum.Uno;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /* Ejercicio: Crear una enumeración llamada "Día de la semana"
           que almacene los 7 días de la semana. Luego, escribir una
           función en Java que reciba como argumento un día de la
           semana y devuelva el día siguiente */

        Proceso p = new Proceso(DiasSemana.MARTES);
        p.diaSig();
    }
}
