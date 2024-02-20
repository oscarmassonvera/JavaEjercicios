package org.ejercicios.basico.Generics.Uno;

public class Generico<T> {
    private final T tipo;

    public Generico(T tipo) {
        this.tipo = tipo;
    }
    public void mostrar()
    {
        System.out.println("Tipo de dato del generico =\t " + tipo.getClass().getName());
    }
}
