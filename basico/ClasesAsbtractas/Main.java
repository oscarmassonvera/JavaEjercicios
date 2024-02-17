package org.ejercicios.basico.ClasesAsbtractas;

import org.example.Estudiantes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    Estudiantes estudiantes;

    public static void main(String[] args)
    {
        List<String> cafes = new ArrayList<>();
        cafes.add("Colombiano");
        cafes.add("Panameños");
        cafes.add("Zarumeños");

        Persona persona1 = new Persona("Oscar","22","0923356", (ArrayList<String>) cafes);
        System.out.println(persona1.tomar());
        System.out.println(persona1.holer());
    }
}