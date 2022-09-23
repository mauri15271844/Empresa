package com.empresa.service;

import com.empresa.entity.Empleado;
import com.empresa.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    public void crearEmpleado(Empleado empleado){
        empleadoRepository.save(empleado);
    }
}
