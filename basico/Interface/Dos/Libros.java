package org.ejercicios.basico.Interface.Dos;

public class Libros extends Publicación implements Prestable{
    private boolean prestado;
    public Libros(String codigo, String titulo, String anoPublicacion,boolean prestado) {
        super(codigo, titulo, anoPublicacion);
        this.prestado = prestado;
    }

    public boolean getPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public void prestar() {
        prestado = true;
    }

    @Override
    public void devolver() {
        prestado = false;
    }

    @Override
    public boolean prestado() {
        return prestado;
    }

    @Override
    public String toString() {

        String cadena =  super.toString() + "Esta prestado ? "+ prestado;
        return cadena;
    }
}
