package com.example.dependendyInversion.service;

import com.example.dependendyInversion.models.Empleado;

public interface EmpleadoServicio {

    Empleado registrarEmpleado(Empleado empleado);
    Empleado obtenerUnEmpleado(Long id);

}
