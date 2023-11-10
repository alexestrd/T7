package com.example.demo.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "FRET_00037")
public class frecuenciaModel {

    @Getter
    @Id
    @Setter
    @Column(name = "id_frec") @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_frec;

    @Column(name = "id_frecuencia") @Setter
    @Getter
    private int id_frecuencia;

    @Column(name = "frecuencia") @Setter @Getter
    private String frecuencia;
}
