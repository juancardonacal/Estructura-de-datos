import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] a = {2, 5, 3, 6, 4, 7, 1};

        int suma = 0;

        for (int i = 0; i < a.length; i++) {
            //La suma de los todos los elementos del arreglo
            suma += a[i];
        }

        System.out.println("La suma de los elementos del arreglo es: " + suma);

    }

