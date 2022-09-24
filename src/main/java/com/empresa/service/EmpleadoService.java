package com.empresa.service;

import com.empresa.entity.Empleado;
import com.empresa.entity.Empresa;
import com.empresa.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    //------------------crear y actualizar-------------------

    public void crearYActualizarEmpleado(Empleado empleado){
        empleadoRepository.save(empleado);
    }

    //----------------ver----------------------

    public List<Empleado> verEmpleados(){
        return empleadoRepository.findAll();

    }

    //----------------borrar---------------------

    public void borrarEmpleado(Long id){
        empleadoRepository.deleteAllById(Collections.singleton(id));
    }

    //-------------------actuaizar-----------------

}
