package org.ejercicios.basico.ClasesAsbtractas;

import java.util.ArrayList;
import java.util.List;

public class Persona extends Cafe {
    private String nombre,edad,cedula;
    private List<String> tiposCafe = new ArrayList<>();
    public Persona() {
    }
    public Persona(String nombre, String edad, String cedula,ArrayList<String> tipoCafe) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.tiposCafe = tipoCafe;
    }
    public Persona addTipoCafe(String tpC)
    {
        tiposCafe.add(tpC);
        return this;
    }

    @Override
    public String tomar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre)
                .append("\n").append("Edad: ").append(edad)
                .append("\n").append("Cedula: ").append(cedula)
                .append("\n").append("Se esta TOMANDO un cafecito bien cargado.");
        for(String tpc: tiposCafe)
        {
            sb.append("-  ").append(tpc).append("\n");
        }
        return sb.toString();
    }
    @Override
    public String holer() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre)
                .append("\n").append("Edad: ").append(edad)
                .append("\n").append("Cedula: ").append(cedula)
                .append("\n").append("Esta HOLIENDO un cafecito bien cargado.");
        for(String tpc: tiposCafe)
        {
            sb.append("-  ").append(tpc).append("\n");
        }
        return sb.toString();
    }
}
