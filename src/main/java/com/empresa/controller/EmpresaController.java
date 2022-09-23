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

    @PostMapping("/web")
    private void crearYActualizarEmpresa(@RequestBody Empresa empresa) {
        empresaService.crearYActualizarEmpresa(empresa);
    }

    //-----------------------get---------------------------------

    @GetMapping("/web")
    private List<Empresa> mostrarEmpresa() {
        return empresaService.verEmpresas();
    }

    //--------------------------delete--------------------------

    @DeleteMapping("web/{id}")
    private void borrarEmpresa(@PathVariable("id") Long id) {
        empresaService.borrarEmpresa(id);
    }

    //--------------------------put----------------------------------

    @PutMapping("/web")
    private void atualizarEmpresa(@RequestBody Empresa empresa) {
        empresaService.crearYActualizarEmpresa(empresa);
    }
}