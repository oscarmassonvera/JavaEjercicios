package org.ejercicios.basico.Enum.Uno;

public class Proceso {
    private DiasSemana diaa;
    public Proceso(DiasSemana dia) {
        this.diaa = dia;
    }

    public void diaSig()
    {
        switch (diaa){
            case LUNES:
                System.out.println(DiasSemana.MARTES);
                break;
            case MARTES:
                System.out.println(DiasSemana.MIERCOLES);
                break;
            case MIERCOLES:
                System.out.println(DiasSemana.JUEVES);
                break;
            case JUEVES:
                System.out.println(DiasSemana.VIERNES);
                break;
            case VIERNES:
                System.out.println(DiasSemana.SABADO);
                break;
            case SABADO:
                System.out.println(DiasSemana.DOMINGO);
                break;
            case DOMINGO:
                System.out.println(DiasSemana.LUNES);
                break;
            default:
                throw new IllegalStateException("Valor desconocido: " + diaa);
        }
    }
}
