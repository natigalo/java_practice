package com.grupo1.ejerciciosjava.models;

public class Modelo2 {
    private double sumaTotal;
    private double media;
    private double mediana;
    private double moda;

    public Modelo2(double sumaTotal, double media, double mediana, double moda){
        this.sumaTotal = sumaTotal;
        this.media = media;
        this.mediana = mediana;
        this.moda = moda;
    }

    public double getSumaTotal() {
        return sumaTotal;
    }

    public void setSumaTotal(double sumaTotal) {
        this.sumaTotal = sumaTotal;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getMediana() {
        return mediana;
    }

    public void setMediana(double mediana) {
        this.mediana = mediana;
    }

    public double getModa() {
        return moda;
    }

    public void setModa(double moda) {
        this.moda = moda;
    }
}
