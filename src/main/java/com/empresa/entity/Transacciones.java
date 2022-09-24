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
    @JoinColumn(name= "empresa_id")
    private Empresa empresa;

    @ManyToOne
    @JoinColumn(name= "empleado_id")
    private Empleado empleado;


}
