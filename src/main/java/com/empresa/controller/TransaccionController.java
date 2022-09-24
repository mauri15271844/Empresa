package com.empresa.controller;


import com.empresa.entity.Empresa;
import com.empresa.entity.Transacciones;
import com.empresa.service.TransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransaccionController {

    @Autowired
    TransaccionService transaccionService;

    //-------------------post---------------------------------

    @PostMapping("/millon")
    private void crearYActualizarTransaccion(@RequestBody Transacciones transaccion) {
        transaccionService.crearYActualizarTransaccion(transaccion);
    }

    //-----------------------get---------------------------------

    @GetMapping("/millon")
    private List<Transacciones> mostrarTransaccion() {
        return transaccionService.verTransacciones();
    }

    //--------------------------delete--------------------------

    @DeleteMapping("millon/{id}")
    private void borrarTransaccion(@PathVariable("id") Long id) {
        transaccionService.borrarTransaccion(id);
    }

    //--------------------------put----------------------------------

    @PutMapping("/millon")
    private void atualizarTransaccion(@RequestBody Transacciones transaccion) {
        transaccionService.crearYActualizarTransaccion(transaccion);
    }
}
