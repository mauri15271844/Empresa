package com.empresa.service;


import com.empresa.entity.Empresa;
import com.empresa.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {


    @Autowired
    EmpresaRepository empresaRepository;

    //------------------crear-------------------

    public void crearEmpresa(Empresa empresa){
        empresaRepository.save(empresa);
    }

    //----------------ver----------------------

    public List<Empresa> verEmpresas(){
        return empresaRepository.findAll();

    }

    //----------------borrar---------------------

    public void borrarEmpresa(Long id){

    }
}
