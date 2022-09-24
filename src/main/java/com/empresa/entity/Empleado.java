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

    private Date fechaCreacionEmpleado;

    private Date fechaActualizacionEmpleado;

   //-------------------relaciones uml-----------------

    @OneToMany(mappedBy = "empleado", fetch = FetchType.LAZY)
    private List<Transacciones> transacciones;

    @ManyToOne
    @JoinColumn(name= "empresa_id")
    private Empresa empresa;

    //-----------------------enums-------------------------

    @Enumerated(value=EnumType.STRING)
    private RolEnum funcion;
}
