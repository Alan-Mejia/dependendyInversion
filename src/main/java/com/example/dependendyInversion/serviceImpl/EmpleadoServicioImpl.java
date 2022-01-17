package com.example.dependendyInversion.serviceImpl;

import com.example.dependendyInversion.models.Empleado;
import com.example.dependendyInversion.repository.EmpleadoRepositorio;
import com.example.dependendyInversion.service.EmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpleadoServicioImpl implements EmpleadoServicio{

    EmpleadoRepositorio empleadoRepositorio;

    public EmpleadoServicioImpl(EmpleadoRepositorio empleadoRepositorio) {
        this.empleadoRepositorio = empleadoRepositorio;
    }

    @Override
    public Empleado registrarEmpleado(Empleado empleado) {
        return empleadoRepositorio.save(empleado);
    }

    @Override
    public Empleado obtenerUnEmpleado(Long id) {
        Optional<Empleado> empleadoEncontrado = empleadoRepositorio.findById(id);
        return empleadoEncontrado.orElseThrow(null);
    }
}
