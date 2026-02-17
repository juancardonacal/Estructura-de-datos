import java.util.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        int[] A = {8, 5, 3, 10, 2, 8, 1};
        int n = A.length;
        // El tamaño del arreglo resultante es la mitad redondeada hacia arriba
        int[] B = new int[(n + 1) / 2];

        for (int i = 0; i < B.length; i++) {
            if (i == n - 1 - i) {
                // Si es el elemento central (sin pareja)
                B[i] = A[i];
            } else {
                B[i] = A[i] + A[n - 1 - i];
            }
        }

        System.out.println("Arreglo resultante de sumas:");
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }
    }
}