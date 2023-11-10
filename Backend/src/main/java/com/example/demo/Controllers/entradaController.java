package com.example.demo.Controllers;

import com.example.demo.Dao.entradaDao;
import com.example.demo.Models.entradaModel;
import com.example.demo.Models.ResultadoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class entradaController {

    @Autowired
    private entradaDao EntradaDao;

    @RequestMapping(value = "api/entrada", method = RequestMethod.POST)
    public  void postEntrada(@RequestBody List<entradaModel> datos){
        for (entradaModel entrada:datos){
            EntradaDao.postDatos(entrada);
        }
    }

    @RequestMapping(value = "api/entrada", method = RequestMethod.GET)
    public List<entradaModel> getDatos(){
        return  EntradaDao.getDatos();
    }

    @RequestMapping(value = "/api/transform", method = RequestMethod.GET)
    public ResponseEntity<List<ResultadoModel>> transformar(){
        List<entradaModel> entradaData = EntradaDao.getDatos();

        Map<Integer, ResultadoModel> resultMap = new HashMap<>();
        for (entradaModel entrada: entradaData){
            int idFrecuencia = entrada.getId_frecuencia();
            ResultadoModel resultado = resultMap.get(idFrecuencia);
            if(resultado == null){
                resultado = new ResultadoModel();
                resultado.setId_frecuencia(idFrecuencia);
                resultado.setFrecuencia(entrada.getFrecuencia());
                resultado.setOrigen(new ArrayList<>());
                resultado.setDestino(new ArrayList<>());
                resultMap.put(idFrecuencia, resultado);
            }
            if ("ORIGEN".equals(entrada.getRuta())) {
                resultado.getOrigen().add(entrada);
            } else if ("DESTINO".equals(entrada.getRuta())) {
                resultado.getDestino().add(entrada);
            }
        }

        List<ResultadoModel> resultList = new ArrayList<>(resultMap.values());

        return new ResponseEntity<>(resultList, HttpStatus.OK);
        }
    }

