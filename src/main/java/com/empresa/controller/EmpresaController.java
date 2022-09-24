package com.empresa.controller;

import com.empresa.entity.Empresa;
import com.empresa.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    //-------------------post---------------------------------

    @PostMapping("/empresa")
    private void crearYActualizarEmpresa(@RequestBody Empresa empresa) {
        empresaService.crearYActualizarEmpresa(empresa);
    }

    //-----------------------get---------------------------------

    @GetMapping("/empresa")
    private List<Empresa> mostrarEmpresa() {
        return empresaService.verEmpresas();
    }

    //--------------------------delete--------------------------

    @DeleteMapping("empresa/{id}")
    private void borrarEmpresa(@PathVariable("id") Long id) {
        empresaService.borrarEmpresa(id);
    }

    //--------------------------put----------------------------------

    @PutMapping("/empresa")
    private void atualizarEmpresa(@RequestBody Empresa empresa) {
        empresaService.crearYActualizarEmpresa(empresa);
    }
}