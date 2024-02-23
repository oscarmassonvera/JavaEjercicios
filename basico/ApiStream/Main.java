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
        Stream<Usuario> nombre8 = Stream
                .of("Pato Gomez", "Paco Guitierrez","Pepa Mendez","Pepe Mena")
                .map( a-> new Usuario(a.split(" ")[0],a.split(" ")[1]))
                .map(usuario -> {
                    String nombre = usuario.getNombre().toUpperCase();
                    String apellido = usuario.getApellido().toUpperCase();
                    usuario.setNombre(nombre);
                    usuario.setApellido(apellido);
                    return usuario;
                });
        List<Usuario> list4 = nombre8.collect(Collectors.toList());
        list4.forEach(u -> System.out.print(u.getNombre()+""+u.getApellido()));
        //
        System.out.println("");
        //
        Stream<Usuario> nombre9 = Stream
                .of("Pato Gomez", "Paco Guitierrez","Pepa Mendez","Pepe Mena")
                .map( a-> new Usuario(a.split(" ")[0],a.split(" ")[1]))
                .filter( u -> u.getNombre().equals("Pepe"));
        List<Usuario> list5 = nombre9.collect(Collectors.toList());
        list5.forEach(u -> System.out.print(u.getNombre()+""+u.getApellido()));
        //
        System.out.println("");
        //
        Stream<Usuario> nombre10 = Stream
                .of("Pepe Pepin","Pepe Arevalo","Pato Gomez", "Paco Guitierrez","Pepa Mendez","Pepe Mena")
                .map( a-> new Usuario(a.split(" ")[0],a.split(" ")[1]))
                .filter( u -> u.getNombre().equals("Pepe"));
        Optional<Usuario> usuraio = nombre10.findFirst();
        System.out.println(usuraio.get().getNombre()+"\t"+
                usuraio.get().getApellido());
        //
        System.out.println("");
        //

    }
}
