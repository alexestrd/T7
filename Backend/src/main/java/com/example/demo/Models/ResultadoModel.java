package com.example.demo.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class ResultadoModel {

    @Setter @Getter
    private int id_frecuencia;

    @Setter @Getter
    private String frecuencia;

    @Setter @Getter
    private List<entradaModel> origen;

    @Setter @Getter
    private List<entradaModel> destino;
}
