package com.empresa.enums;


import javax.persistence.Enumerated;
import javax.persistence.Table;

@Table(name = "rol")
public enum RolEnum {

    Aministrador,
    Operario
}
