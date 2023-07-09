package com.example.Javaendpoint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/array")
public class Array {


    private int[] getPunto1() {
        int cuentaIntercambios = 0;
        int[] lista = {1, 3, 3, 6, 7, 7, 10, 9, 8, 9};
        for (boolean ordenado = false; !ordenado; ) {
            for (int i = 0; i < lista.length - 1; i++) {
                if (lista[i] > lista[i + 1]) {
                    int variableauxiliar = lista[i];
                    lista[i] = lista[i + 1];
                    lista[i + 1] = variableauxiliar;
                    cuentaIntercambios++;
                }
            }
            if (cuentaIntercambios == 0) {
                ordenado = true;
            }
            cuentaIntercambios = 0;
        }
        return lista;
    }


    private double getPunto2() {
        int[] lista = {1, 3, 4, 6, 7, 2, 10, 9, 8, 9};
        double totalSuma = 0;
        for (int i = 0; i < lista.length; i++) {
            totalSuma += lista[i];
        }
        return totalSuma;
    }

    @GetMapping("/punto1")
    public String Punto1() {
string lista=getPunto1();
string totalSuma=getPunto2();
        return lista + totalSuma;
    }

    @GetMapping("/punto3")
    public double getPunto3() {
        int[] lista = {1, 3, 4, 6, 7, 2, 10, 9, 8, 9};
        Arrays.sort(lista);
        if (lista.length % 2 != 0) {
            return lista[lista.length / 2];
        } else {
            return (double) (lista[lista.length / 2 - 1] + lista[lista.length / 2]) / 2;
        }
    }

    @GetMapping("/punto4")
    public double getPunto4() {
        int[] lista = {1, 3, 4, 6, 7, 2, 10, 9, 8, 9};
        int contador1 = 0;
        int contador2 = 0;
        int moda = 0;
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                if (lista[i] == lista[j] && i != j) {
                    contador1++;
                }
            }
            if (contador1 > contador2) {
                contador2 = contador1;
                moda = lista[i];
            }
            contador1 = 0;
        }
        return moda;
    }
}