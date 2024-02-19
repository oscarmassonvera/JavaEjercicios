package org.ejercicios.basico.Interface.Dos;

public class Main {
    public static void main(String[] args) {
    /*Escribe un programa para una biblioteca que contenga libros y revistas.
    Las características comunes que se almacenan tanto para las revistas como para los
    libros son el código, el título, y el año de publicación. Estas tres características
    se pasan por parámetro en el momento de crear los objetos. Los libros tienen además
    un atributo prestado.
    -- Los libros, cuando se crean, no están prestados.
    -- Las revistas tienen un número. En el momento de crear las revistas se pasa el número por parámetro.
    -- Tanto las revistas como los libros deben tener (aparte de los constructores) un método toString()
       que devuelve el valor de todos los atributos en una cadena de caracteres.
       También tienen un método que devuelve el año de publicación, y otro el código.
    Para prevenir posibles cambios en el programa se tiene que implementar una interfaz Prestable con
    los métodos prestar(), devolver() y prestado. La clase Libro implementa esta interfaz*/

        Libros libro1 = new Libros("011111","Blanca neves","1960",false);
        libro1.prestar();
        System.out.println( libro1.prestado() );
        libro1.devolver();
        System.out.println( libro1.prestado() );
        System.out.println( libro1.toString().toString() );
        Revistas revista1 = new Revistas("2222111","Moda", "2000",2001);
        System.out.println( revista1.toString() );
    }
}
