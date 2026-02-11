import java.util.*;

public class Arreglo2 {
    public static void main(String[] args) throws Exception {
        // Creación de arreglo/array/vector
        int[] a = {2, 6, 8, 1, 20, 40, 7, 3, 5};
        
        System.out.println("tamaño del arreglo a: " + a.length);
        
        for(int i = 0; i < a.length; i++){
            System.out.println("a[" + i + "]=" + a[i]);
        }
        
        //Ejercicio sumar todos los números que contiene el arreglo
        int suma = 0;
        for(int i = 0; i < a.length; i++){
            suma += a[i];
        }
        System.out.println("La suma de todos los elementos del arreglo [a] es: " + suma);
        
    }
}
