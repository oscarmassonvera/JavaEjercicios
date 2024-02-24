package org.ejercicios.basico.ApiStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //
        Stream<String> nombres = Stream.of("Pato","Paco"
        ,"Pepa","Pepe");
        nombres.forEach(System.out::print);
        //
        System.out.println("");
        //
        String[] arr = {"Pato","Paco"
                ,"Pepa","Pepe"};
        Stream<String> nombres2 = Arrays.stream(arr);
        nombres2.forEach(System.out::print);
        //
        System.out.println("");
        //
        Stream<String> nombres3 = Stream.<String>builder()
                .add("Pato").add("Pepa").add("Pepe").build();
        nombres3.forEach(System.out::print);
        //
        System.out.println("");
        //
        List<String> list = new ArrayList<>();
        list.add("Pato");
        list.add("Pepa");
        list.add("Pepe");
        Stream<String> nombres4 = list.stream();
        nombres4.forEach(System.out::print);
        //
        System.out.println("");
        //
        Stream<String> nombres5 = Stream
                .of("Pato", "Paco","Pepa","Pepe")
                .map( String::toUpperCase);
        nombres5.forEach(System.out::print);
        //
        System.out.println("");
        //
        Stream<String> nombres6 = Stream
                .of("Pato", "Paco","Pepa","Pepe")
                .map( String::toLowerCase);
        nombres6.forEach(System.out::print);
        //
        System.out.println("");
        //
        Stream<String> nombres7 = Stream
                .of("Pato", "Paco","Pepa","Pepe")
                .map( String::toLowerCase);
        List<String> list2 = nombres7
                .collect(Collectors.toList());
        list2.forEach(System.out::print);
        //
        System.out.println("");
        //
        boolean existe = Stream
                .of("Pepe Pepin","Pepe Arevalo","Pato Gomez", "Paco Guitierrez","Pepa Mendez","Pepe Mena")
                .map( a-> new Usuario(a.split(" ")[0],a.split(" ")[1]))
                .anyMatch(u->u.getApellido().equals("Gomez")); // Retorna boolean
        System.out.println(existe);
        //
        System.out.println(" ");
        //
             Optional<Usuario> existe2 = Stream
                .of("Pepe Pepin","Pepe Arevalo","Pato Gomez", "Paco Guitierrez","Pepa Mendez","Pepe Mena")
                .map( a-> new Usuario(a.split(" ")[0],a.split(" ")[1]))
                .filter( u -> u.getNombre().equals("Pepe") && u.getApellido().equals("Arevalo") ).findAny();
             if (existe2.isPresent()){
                 System.out.println("Usuario = " + existe2);
             }else{
                 System.out.println("Usuario no existe.");
             }
        //
        System.out.println(" ");
        //
        Long cantidad = Stream
                .of("Pepe Pepin","Pepe Arevalo","Pato Gomez", "Paco Guitierrez","Pepa Mendez","Pepe Mena")
                .map( a-> new Usuario(a.split(" ")[0],a.split(" ")[1]))
                .filter( u -> u.getNombre().equals("Pepe"))
                .count();
        System.out.println("cantidad = " + cantidad);
        //
        System.out.println(" ");
        //
                Stream<String> xd = Stream
                .of("Pepe Pepin","Pepe Arevalo","Pato Gomez", "Paco Guitierrez","Pepa Mendez","Pepe Mena","Pepe Mena")
                .distinct();
                String reduce =  xd.reduce("",(a,b) -> a+ ", " + b );
                System.out.println("reduce = " + reduce);
        //
        System.out.println(" ");
        //
        
    }
}
