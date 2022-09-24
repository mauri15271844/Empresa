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

    @PostMapping("/empleado")
    private void crearYActualizarEmpleado(@RequestBody Empleado empleado) {
        empleadoService.crearYActualizarEmpleado(empleado);
    }

    //-----------------------get---------------------------------

    @GetMapping("/empleado")
    private List<Empleado> mostrarEmpleado() {
        return empleadoService.verEmpleados();
    }

    //--------------------------delete--------------------------

    @DeleteMapping("empleado/{id}")
    private void borrarEmpleado(@PathVariable("id") Long id) {
        empleadoService.borrarEmpleado(id);
    }

    //--------------------------put----------------------------------

    @PutMapping("/empleado")
    private void atualizarEmpleado(@RequestBody Empleado empleado) {
        empleadoService.crearYActualizarEmpleado(empleado);
    }


}
