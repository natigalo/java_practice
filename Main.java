import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int cuentaIntercambios=0;
        int[] lista = {1, 3, 4, 6, 7, 2, 10, 9, 8, 9};
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
            }    cuentaIntercambios = 0;
        }
        System.out.println(Arrays.toString(lista));
        double totalSuma= totalSuma(lista);
        System.out.println("la suma de todos los valores del arreglo es: "+ totalSuma);
        double media = media(lista);
        System.out.println("la media es: " + media);
        double mediana = mediana(lista);
        System.out.println("la mediana es: "+ mediana);
        double moda = moda(lista);
        System.out.println("la moda es: "+ moda);
    }
    public static double totalSuma(int[] arreglo){
        int counter=0;
        for (int i=0; i<arreglo.length; i++){
            counter+=arreglo[i];
        }
        return (double) counter;
    }
    public static double media(int[] arreglo){
       int counter=0;
       for (int i=0; i<arreglo.length; i++){
           counter+=arreglo[i];
       }
       return (double) counter/arreglo.length;
    }
    public static double mediana(int[] arreglo){
        if (arreglo.length%2 !=0){
            return arreglo[arreglo.length/2];
        }else{
            return (double) (arreglo[arreglo.length/2-1]+arreglo[arreglo.length/2])/2;
        }

    }
    public static double moda(int[] arreglo) {
        int contador1 = 0;
        int contador2 = 0;
int moda=0;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[i] == arreglo[j] && i != j) contador1++;
            }
            if (contador1 > contador2) {
                contador2 = contador1;
                moda = arreglo[i];
            }
            contador1 = 0;
        } return moda;
    }
}
    


