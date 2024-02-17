package org.ejercicios.basico.Enum.Uno;

public class Proceso {
    private String dia;
    public Proceso(String dia) {
        this.dia = dia;
    }
    public void diaSig()
    {
        if (dia == "Lunes"){
            System.out.println("Es Martes");
        }
        else if (dia == "Martes")
        {
            System.out.println("Es Miercoles");
        }
        else if (dia == "Miercoles")
        {
            System.out.println("Es Jueves");
        }
        else if (dia == "Jueves")
        {
            System.out.println("Es Viernes");
        }
        else if (dia == "Viernes")
        {
            System.out.println("Es Sabado");
        }
        else if (dia == "Sabado")
        {
            System.out.println("Es Domingo");
        }
        else if (dia == "Domingo")
        {
            System.out.println("Es Lunes");
        }
        else
        {
            System.out.println("\033[35m -- Error --");
        }
    }
}
