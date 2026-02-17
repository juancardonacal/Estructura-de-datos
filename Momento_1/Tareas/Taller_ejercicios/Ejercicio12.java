import java.util.*;

public class Ejercicio12 {
    public static void main(String[] args) {
        int[] A = {4, 6, 8, 2, 6, 9, 6, 1};
        int x = 6;
        int[] B = new int[8];
        int contB = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == x) {
                B[contB] = i + 1; // Guardamos la posicion
                contB++;
            }
        }

        System.out.println("Las posiciones del numero " + x + " son:");
        for (int i = 0; i < contB; i++) {
            System.out.println(B[i]);
        }
    }
}