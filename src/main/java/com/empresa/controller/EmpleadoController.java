package com.empresa.controller;


import com.empresa.entity.Empleado;
import com.empresa.entity.Empresa;
import com.empresa.service.EmpleadoService;
import com.empresa.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    //-------------------post---------------------------------

    @PostMapping("/o")
    private void crearYActualizarEmpleado(@RequestBody Empleado empleado) {
        empleadoService.crearYActualizarEmpleado(empleado);
    }

    //-----------------------get---------------------------------

    @GetMapping("/o")
    private List<Empleado> mostrarEmpleado() {
        return empleadoService.verEmpleados();
    }

    //--------------------------delete--------------------------

    @DeleteMapping("o/{id}")
    private void borrarEmpleado(@PathVariable("id") Long id) {
        empleadoService.borrarEmpleado(id);
    }

    //--------------------------put----------------------------------

    @PutMapping("/o")
    private void atualizarEmpleado(@RequestBody Empleado empleado) {
        empleadoService.crearYActualizarEmpleado(empleado);
    }


}
