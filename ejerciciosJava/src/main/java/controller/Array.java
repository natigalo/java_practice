package controller;

import models.ModeloPunto1;
import models.ModeloPunto2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.Ejercicios;

@RestController
@RequestMapping("/ejercicios")

public class Array {
    @GetMapping("/punto1")
    public ModeloPunto1 ModeloPunto1(){
        Ejercicios ejercicios = new Ejercicios();
        int[] arrayOrdenado=ejercicios.arrayOrdenado;
        double suma =ejercicios.sumaNumeros();
         Modelo punto1= new Modelo(arrayOrdenado,sumaNumeros);
    }


    @GetMapping("/punto2")
    public ModeloPunto2 estadisticos(){

    }

}

