package org.ejercicios.basico.Interface.Uno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Proceso implements ObjetosPrestadosAño{

    public Proceso() {
    }

    @Override
    public int cuentaPrestados(String[][] objetosPrestados) {
        int contador = 0;
        for (int i = 0; i < objetosPrestados.length; i++) {
            for (int j = 0; j < objetosPrestados[i].length; j++) {
                if (objetosPrestados[i][j] == "Prestado")
                {
                    contador++;
                }
            }
            System.out.println();
        }
        return contador;
    }

    @Override
    public int publicacionesAnterioresA(String[][] publicacionesYAño) {
        int contador = 0;
        for (int i = 0; i < publicacionesYAño.length; i++) {
            for (int j = 0; j < publicacionesYAño[i].length; j++) {
                if (publicacionesYAño[i][j] == "1990") { contador++; }
                else if (publicacionesYAño[i][j] == "1991") { contador++; }
                else if (publicacionesYAño[i][j] == "1992") { contador++; }
                else if (publicacionesYAño[i][j] == "1993") { contador++; }
                else if (publicacionesYAño[i][j] == "1994") { contador++; }
                else if (publicacionesYAño[i][j] == "1995") { contador++; }
                else if (publicacionesYAño[i][j] == "1996") { contador++; }
                else if (publicacionesYAño[i][j] == "1997") { contador++; }
                else if (publicacionesYAño[i][j] == "1998") { contador++; }
                else if (publicacionesYAño[i][j] == "1999") { contador++; }
                else if (publicacionesYAño[i][j] == "2000") { contador++; }
            }
            System.out.println();
        }
        return contador;
    }

}
