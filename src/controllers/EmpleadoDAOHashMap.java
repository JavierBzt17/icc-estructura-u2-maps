package controllers;

import java.util.*;

import models.Empleado;

public class EmpleadoDAOHashMap implements EmpleadoDAO {
    private Map<Empleado, Empleado> empleados;

    public EmpleadoDAOHashMap() {
     empleados = new HashMap<>();
    }

     @Override
    public void agregar(Empleado empleado) {
        empleados.put(empleado, empleado);
    }

    @Override
    public void eliminar(int id) {
        empleados.remove(id);
    }

    @Override
    public void listar() {
        System.out.println("\nLista de empleados:" + empleados);
    
    }
}
