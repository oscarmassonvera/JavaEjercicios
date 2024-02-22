package org.ejercicios.basico.Lambda;

import org.ejercicios.basico.Interface.Dos.Prestable;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        /*Permite pasar por argumento un solo parametro del tipo del generico */
        Consumer<String> consumidor =  saludo ->
        {
            System.out.println(saludo);
        };
        consumidor.accept("Hola mundo.");
        /*Permite pasar dos parametros del tipo generico */
        BiConsumer<String,Integer> consumidorBi = (nombre,edad) ->
        {
            System.out.println("Nombre: \t"+nombre+"\t Edad:\t"+edad);
        };
        consumidorBi.accept("Oscar",22);
        Consumer<String> consumidorx = System.out::println;
        consumidorx.accept("xd");
        // REFERENCIA DE METODO
        Usuario usuario1 = new Usuario();
        BiConsumer<Usuario,String> asignarNombre = (persona,nombre) ->
        {
            persona.setNombre(nombre);
        };
        asignarNombre.accept(usuario1,"Oscar");
        System.out.println("Nombre del usuario = \t" + usuario1.getNombre());
        //
        Usuario usuario2 = new Usuario();
        BiConsumer<Usuario,String> asignarNombre2 = Usuario::setNombre;
        asignarNombre2.accept(usuario2,"Angie");
        System.out.println("Nombre del usuario 2 = \t" + usuario2.getNombre());
        //
        Supplier<String> proveedor = ()->{
            return "Hola mundo...";
        };
        System.out.println(proveedor.get());
        //
        Function<String,String> f1 = param ->
        {
          return  "Hola \t"+param;
        };
        String resultado = f1.apply("Luna");
        System.out.println(resultado);
        //
        Function<String,String> f2 = String::toUpperCase;
        System.out.println(f2.apply("luna"));
        //
        BiFunction<String,String,String> f3 =
                (a,b) -> a.toUpperCase().concat(b.toUpperCase());
        String r2 = f3.apply("Luna ","Angie");
        System.out.println(r2);
        // Evalua expresiones bool
        Predicate<Integer> test = num ->  num > 10;
        boolean c = test.test(11);
        System.out.println(c);
        //
        BiPredicate<String,String> t3 = String::equals;
        System.out.println(t3.test("oscar","angie"));
    }
}
