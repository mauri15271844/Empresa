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

    private Date fechaCreacion;

    private Date fechaActualizacion;

    //---------------------relaciones uml----------

    @OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
    private List<Transacciones> transacciones;

    @OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
    private List<Empleado> empleados;
}
