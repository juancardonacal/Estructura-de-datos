import java.util.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Arreglo con los 30 numeros especificados
        int[] N = {15, 8, 25, 8, 25, 10, 3, 30, 15, 30, 4, 12, 18, 3, 22, 10, 5, 25, 30, 8, 14, 7, 3, 20, 11, 15, 2, 30, 2, 9};
        
        // Encontrar el mayor y el menor
        int mayor = N[0];
        int menor = N[0];

        for (int i = 1; i < N.length; i++) {
            if (N[i] > mayor) {
                mayor = N[i];
            }
            if (N[i] < menor) {
                menor = N[i];
            }
        }

        // Contar cuantas veces se repiten
        int contMayor = 0;
        int contMenor = 0;

        for (int i = 0; i < N.length; i++) {
            if (N[i] == mayor) {
                contMayor++;
            }
            if (N[i] == menor) {
                contMenor++;
            }
        }

        // Impresion de resultados simple
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero de veces que se repite el mayor es: " + contMayor);
        System.out.println("El numero menor es: " + menor);
        System.out.println("El numero de veces que se repite el menor es: " + contMenor);
    }
}