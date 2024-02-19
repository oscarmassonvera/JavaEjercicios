package org.ejercicios.basico.Interface.Uno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Escribe una aplicación en la que se implementen dos métodos:
          -- cuentaPrestados(): recibe por parámetro una matriz de objetos,
          y devuelve cuántos de ellos están prestados.
          -- publicacionesAnterioresA(): recibe por parámetro una matriz de
          Publicaciones y un año, y devuelve cuántas publicaciones
          tienen fecha anterior al año recibido por parámetro.
          -- En el método main(), crear un array de Publicaciones,
          con 2 libros y 2 revistas, prestar uno de los libros,
          mostrar por pantalla los datos almacenados en el
          array y mostrar por pantalla cuántas hay
          prestadas y cuantas hay posteriores a 1990.*/

        String[][] objetos = new String[2][4];
        objetos[0][0] = "Revista de cocina";
        objetos[0][1] = "1994";
        objetos[0][2] = "Prestado";
        objetos[0][3] = "Publicado";

        objetos[1][0] = "comic";
        objetos[1][1] = "1970";
        objetos[1][2] = "No prestado";
        objetos[0][3] = "Publicado";

        objetos[1][0] = "Moda";
        objetos[1][1] = "1999";
        objetos[1][2] = "No prestado";
        objetos[0][3] = "Publicado";

        /*System.out.println(objetos[0][0]+"\t"+objetos[0][1]+"\t"+objetos[0][2]+"\n"+
                objetos[1][0]+"\t"+objetos[1][1]+"\t"+objetos[1][2]+"\n" );*/

        Proceso ver = new Proceso();
        System.out.println("La cantidad de objetos prestados son: \t   "+ver.cuentaPrestados(objetos));
        System.out.println("La cantidad de publicaciones posteriores a 1990 son: \t   "+ver.publicacionesAnterioresA(objetos));

    }
}
