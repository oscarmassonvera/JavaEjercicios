package org.ejercicios.basico.Interface.Tres;

import java.util.Collection;

public class PruebaPila implements PilaI {

    public PruebaPila() {
    }

    @Override
    public Collection<Integer> rellenar(Collection<Integer> numeros) {
        return numeros;
    }

    @Override
    public void imprimirYVaciar(Collection<Integer> x) {

        for (int i = 1 ; i < 10; i++)
        {
            x.remove(i);
            System.out.println(x.toString());
        }
    }
}
