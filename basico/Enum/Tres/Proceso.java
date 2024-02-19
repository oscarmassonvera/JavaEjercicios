package org.ejercicios.basico.Enum.Tres;

public class Proceso {
    private int select;
    private Colores color;

    public Proceso(int select)
    {
        this.select = select;
        convertir(select);
    }
    public void setSelect(Colores color) {
        this.color = color;
    }

    private Colores convertir(int select)
    {
        switch (select)
        {
            case 1 : setSelect(Colores.AZUL);
                break;
            case 2 : setSelect(Colores.ROJO);
                break;
            case 3 : setSelect(Colores.VERDE);
                break;
            default: break;
        }
        return color;
    }

    public void mostrar()
    {
        switch (color){
            case ROJO:
                System.out.println(color.getColor());
                break;
            case AZUL:
                System.out.println(color.getColor());
                break;
            case VERDE:
                System.out.println(color.getColor());
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
}
