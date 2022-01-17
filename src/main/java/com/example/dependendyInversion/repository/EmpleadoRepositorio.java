package com.example.dependendyInversion.repository;

import com.example.dependendyInversion.models.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepositorio
        extends JpaRepository<Empleado,Long> {
//metodos jpaRepositorio



}
