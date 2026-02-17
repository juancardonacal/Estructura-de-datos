import java.util.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        // Arreglo de 5 enteros y numero a buscar
        int[] A = {10, 25, 10, 40, 10};
        int numeroBuscar = 10;
        
        int contador = 0;

        // Proceso para contar las repeticiones
        for (int i = 0; i < A.length; i++) {
            if (A[i] == numeroBuscar) {
                contador++;
            }
        }

        // Impresion de resultados
        System.out.println("El numero a buscar es: " + numeroBuscar);
        System.out.println("La cantidad de veces que se encuentra el numero es: " + contador);
    }
}