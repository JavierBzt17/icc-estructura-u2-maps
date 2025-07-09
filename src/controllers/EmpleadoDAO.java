package controllers;

import models.Empleado;

public interface EmpleadoDAO {

    void agregar(Empleado empleado);

    void eliminar(int id);

    void listar();


}
