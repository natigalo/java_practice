package models;

public class ModeloPunto1 {
    private int[] arrayOrdenado;
    private double sumaNumeros;

public ModeloPunto1 (int[] arrayOrdenado, double sumaNumeros){
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
