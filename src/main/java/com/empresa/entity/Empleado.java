package com.empresa.entity;


import com.empresa.enums.RolEnum;
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
@Table(name ="empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "correo")
    private String correo;

    @Column(name = "rol")
    private String rol;

    @Column(name = "fecha_de_ingreso_de_empleado")
    private Date fechaCreacionEmpleado;

    @Column(name = "fecha_de_actualizaciones")
    private Date fechaActualizacionEmpleado;

    //-----------------------enums-------------------------

    @Enumerated(value=EnumType.STRING)
    private RolEnum funcion;

    //-------------------relaciones uml-----------------

    @ManyToOne
    private Empresa empresa;

    @OneToMany
    private List<Transacciones> transacciones;
}
