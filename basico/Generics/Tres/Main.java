package org.ejercicios.basico.Generics.Tres;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("NS051","Nisssa","Black");
        Persona persona1 = new Persona("Oscar","Masson","054482141");

        System.out.println("Propietario:\t" + persona1.getId() +"\t"+ "auto\t"+ auto1.getId() );

    }
}
