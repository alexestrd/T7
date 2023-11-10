package com.example.demo.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "entrada")
public class entradaModel {

    @Getter @Id @Setter @Column(name = "id") @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "id_sitio") @Setter @Getter
    private int id_sitio;

    @Column(name = "sitio") @Setter @Getter
    private String sitio;

    @Column(name = "id_frecuencia") @Setter @Getter
    private int id_frecuencia;

    @Column(name = "frecuencia") @Setter @Getter
    private String frecuencia;

    @Column(name = "id_servicio") @Setter @Getter
    private String id_servicio;

    @Column(name = "ruta") @Setter @Getter
    private String ruta;
}
