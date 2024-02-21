package org.ejercicios.basico.Generics.Cuatro;

import java.util.ArrayList;
import java.util.List;

public class Proceso {
    public static <T> T primerNoNull(T[] datos)
    {
        for (T t: datos)
            if (t != null)
                return t;
        return null;
    }
    public static <T> List<String> parejaDeDatos(T t) {
        List<T> resultado = new ArrayList<T>();
        resultado.add(t);
        resultado.add(t);
        return (List<String>) resultado;
    }
}
