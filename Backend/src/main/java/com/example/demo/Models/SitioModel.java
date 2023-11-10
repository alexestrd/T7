package com.example.demo.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "C00007")
public class SitioModel {

    @Getter @Id
    @Setter @Column(name = "id_sit") @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_sit;

    @Column(name = "id_sitio") @Setter
    @Getter
    private int id_sitio;

    @Column(name = "sitio") @Setter @Getter
    private String sitio;
}
