package com.empresa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Transacciones {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String concepto;

    private float cantidad;

    private Date fechaCreacion;

    private Date fechaActualizacion;

    //----------------relaciones uml------------------

    @ManyToOne
    private Empleado empleado;

    @ManyToOne
    private Empresa empresa;




}
