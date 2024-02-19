package org.ejercicios.basico.Interface.Dos;

public class Revistas extends Publicación {
    private int numero;

    public Revistas(String codigo, String titulo, String anoPublicacion, int numero) {
        super(codigo, titulo, anoPublicacion);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
