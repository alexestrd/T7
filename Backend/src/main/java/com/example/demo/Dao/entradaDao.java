package com.example.demo.Dao;

import com.example.demo.Models.entradaModel;

import java.util.List;

public interface entradaDao {
    void postDatos(entradaModel datos);
    List<entradaModel> getDato(int id);

    List<entradaModel> getDatos();
}
