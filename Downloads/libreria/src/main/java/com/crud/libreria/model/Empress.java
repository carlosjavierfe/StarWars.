package com.crud.libreria.model;

import com.crud.libreria.enums.Enum_Empleado;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Empress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String date;
    private String telephone;
    private String ident_emp;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
    private Enum_Empleado tipo;

    //@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "empleado_id")

    @OneToMany//(mappedBy = "empleado")
    @JoinColumn(name = "empleado_id")
    //private Empleado empleado;
    private List<Empleado> empleado;
}
