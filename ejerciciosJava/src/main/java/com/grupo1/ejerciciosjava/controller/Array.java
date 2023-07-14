package com.grupo1.ejerciciosjava.controller;

import com.grupo1.ejerciciosjava.models.Modelo2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.grupo1.ejerciciosjava.services.Ejercicios;

@RestController
@RequestMapping("/ejercicios")
public class Array {
    private final Ejercicios ejercicios;
    private int[] lista = {1, 3, 3, 6, 7, 7, 10, 9, 8, 9};
    @Autowired
    public Array(Ejercicios ejercicios){
        this.ejercicios=ejercicios;
    }
    @GetMapping("/punto1")
    public ResponseEntity<int[]> modelo1 (){
        return new ResponseEntity<> (ejercicios.arrayOrdenado(lista), HttpStatus.OK);
    }
    @GetMapping("/punto2")
    public  Modelo2 getModelo2(){
        return ejercicios.getModelo2(lista);
    }
}

