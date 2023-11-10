package com.example.demo.Dao;

import com.example.demo.Models.entradaModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class entradaDaoImp implements entradaDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void postDatos(entradaModel datos) {
        entityManager.persist(datos);
    }

    @Override
    public List<entradaModel> getDato(int id) {
        return null;
    }

    @Override
    public List<entradaModel> getDatos() {
        String query = "FROM entradaModel";
        return entityManager.createQuery(query).getResultList();
    }
}
