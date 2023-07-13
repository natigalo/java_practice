package models;

public class Ejercicios {
    private int[] arrayOrdenado;
    private double sumaNumeros;

public Ejercicios (int[] arrayOrdenado, double sumaNumeros){
    this.arrayOrdenado= arrayOrdenado;
    this.sumaNumeros= sumaNumeros;
}
public int[] getArrayOrdenado(){
    return arrayOrdenado;
}

    public double getSumaNumeros() {
        return sumaNumeros;
    }
}
