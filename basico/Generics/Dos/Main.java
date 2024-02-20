package org.ejercicios.basico.Generics.Dos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> listPersons = new ArrayList<>();
        listPersons.add(new Persona("Oscar","Masson"));
        listPersons.add(new Persona("Angi","X"));
        listPersons.add(new Persona("Eli","d"));
        listPersons.add(new Persona("Baso","Caja"));
        listPersons.add(new Persona("Luis","Perez"));

        for (Persona x : listPersons ) {
            System.out.println(x);
        }

    }
}
