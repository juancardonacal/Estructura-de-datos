import java.util.*;

public class Ejercicio21 {
    public static void main(String[] args) {
        int[][] M = {
            {2,3,4,5,6}, // Suma pares: 12
            {1,1,1,1,1}, // Suma pares: 0
            {8,2,2,1,1}, // Suma pares: 12
            {10,5,3,2,1},// Suma pares: 12
            {4,4,4,4,4}  // Suma pares: 20
        };
        int[] B = new int[5];

        for (int i = 0; i < 5; i++) {
            int sumaP = 0;
            for (int j = 0; j < 5; j++) {
                if (M[i][j] % 2 == 0) sumaP += M[i][j];
            }
            B[i] = sumaP;
            System.out.println("Suma pares fila " + i + ": " + B[i]);
        }
    }
}