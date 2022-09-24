package com.empresa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;

    private String nit;

    private String telefono;

    private String direccion;

    @OneToMany
    @JoinColumn(name= "empleado_id")
    Empleado empleados;

    @OneToMany
    @JoinColumn(name= "transacciones_id")
    Transacciones transacciones;

    private Date fechaCreacion;

    private Date fechaActualizacion;
}
