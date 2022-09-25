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
@Table(name = "empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="nit")
    private String nit;

    @Column(name="telefono")
    private String telefono;

    //@Column(name="direccion")
    private String direccion;

    @Column(name="fecha_creacion_de_empresa")
    private Date fechaCreacion;

    @Column(name="fecha_de_actualizaciones")
    private Date fechaActualizacion;

    //---------------------relaciones uml----------

    @OneToMany
    private List<Empleado> empleados;

    @OneToMany
    private List<Empresa> empresas;
}
