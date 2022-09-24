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
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    private String nombre;

    private String correo;

    private String rol;

    @OneToMany
    @JoinColumn(name= "transacciones_id")

    Transacciones transaccinesEmpleado;

    private Date fechaCreacionEmpleado;

    private Date fechaActualizacionEmpleado;

    //-----------------------enums-------------------------

    @Enumerated(EnumType.STRING)
    private RolEnum fucion;
}
