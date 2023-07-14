package com.grupo1.ejerciciosjava.services;


import com.grupo1.ejerciciosjava.models.Modelo2;
import org.springframework.stereotype.Service;

@Service
public class Ejercicios {
    public int[] arrayOrdenado(int[] arreglo) {
        int cuentaIntercambios = 0;

        for (boolean ordenado = false; !ordenado; ) {
            for (int i = 0; i < arreglo.length - 1; i++) {
                if (arreglo[i] > arreglo[i + 1]) {
                    int variableauxiliar = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = variableauxiliar;
                    cuentaIntercambios++;
                }
            }
            if (cuentaIntercambios == 0) {
                ordenado = true;
            }
            cuentaIntercambios = 0;
        }
        return arreglo;
    }
    public Modelo2 getModelo2(int[] lista){
         int[] ordenar = arrayOrdenado(lista);
         double sumaTotal = sumaNumeros(ordenar);
         double media = media(ordenar);
         double mediana = mediana(ordenar);
         double moda = moda(ordenar);
         Modelo2 statistics= new Modelo2(sumaTotal, media, mediana, moda);
         statistics.setSumaTotal(sumaTotal);
         statistics.setMedia(media);
         statistics.setMediana(mediana);
         statistics.setModa(moda);
         return statistics;
    }

    public double sumaNumeros(int[] lista) {
        double totalSuma = 0;
        for (int i = 0; i < lista.length; i++) {
            totalSuma += lista[i];
        }
        return totalSuma;
    }

    public double media(int[] lista) {

        double totalSuma = 0;
        for (int i = 0; i < lista.length; i++) {
            totalSuma += lista[i];
        }
        return totalSuma/lista.length;
    }




    public double mediana(int[] lista) {

        if (lista.length % 2 != 0) {
            return lista[lista.length / 2];
        } else {
            return (double) (lista[lista.length / 2 - 1] + lista[lista.length / 2]) / 2;
        }
    }


    public double moda(int[] lista) {
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
