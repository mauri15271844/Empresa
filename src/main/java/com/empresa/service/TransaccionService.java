package com.empresa.service;


import com.empresa.entity.Empresa;
import com.empresa.entity.Transacciones;
import com.empresa.repository.TransaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TransaccionService {

    @Autowired
    TransaccionRepository transaccionRepository;

    //------------------crear y actualizar-------------------

    public void crearYActualizarTransaccion(Transacciones transaccion){
        transaccionRepository.save(transaccion);
    }

    //----------------ver----------------------

    public List<Transacciones> verTransacciones(){
        return transaccionRepository.findAll();

    }

    //----------------borrar---------------------

    public void borrarTransaccion(Long id){
        transaccionRepository.deleteAllById(Collections.singleton(id));
    }

    //-------------------actuaizar-----------------
}
