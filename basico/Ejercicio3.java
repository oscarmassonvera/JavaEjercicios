package org.ejercicios.basico;

public class Ejercicio3 {
    /* Escribe un programa que muestre tu horario de clases
       y añadele colores, mostrando cada asignatura con un
       color diferente.
    * */
    public static void main(String[] args) {
        System.out.println(
            " \033[31m Python \t \033[33m Java \t \033[34m Ingles " +
            "\t \033[36m Algebra \t \033[35m DataScience"  + "\n" +
            "\033[37m 10--12  \t 13--14 \t 14--16 \t 16--18 \t 18--20"
        );
    }
}
