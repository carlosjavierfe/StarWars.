package com.crud.libreria.model;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString


public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nombre;
    private String mail;
    private String Rol;
    private int ident;

    @ManyToOne// (mappedBy = "empleado")
    @JoinColumn(name = "empress")
    private Empress empress;

}
