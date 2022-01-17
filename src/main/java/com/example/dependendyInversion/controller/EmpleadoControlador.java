package com.example.dependendyInversion.controller;

import com.example.dependendyInversion.models.Empleado;
import com.example.dependendyInversion.serviceImpl.EmpleadoServicioImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/empleados")
public class EmpleadoControlador {
    EmpleadoServicioImpl empleadoServicioImpl;

    public EmpleadoControlador(EmpleadoServicioImpl empleadoServicioImpl) {
        this.empleadoServicioImpl = empleadoServicioImpl;
    }

    @PostMapping("")
    public Empleado registrar(@RequestBody Empleado empleado){
        return empleadoServicioImpl.registrarEmpleado(empleado);
    }

    @GetMapping("/{id}")
    public Empleado mostrarEmpleado(@PathVariable Long id){
        return empleadoServicioImpl.obtenerUnEmpleado(id);
    }

}
