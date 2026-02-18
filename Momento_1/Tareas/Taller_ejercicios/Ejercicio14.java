import java.util.*;

public class Ejercicio14 {
    public static void main(String[] args) {
        int[] A = {4, 6, 8, 2, 6, 9, 5, 1};
        int[] B = new int[A.length - 1];

        for (int i = 0; i < A.length - 1; i++) {
            B[i] = A[i] - A[i + 1];
        }

        System.out.println("Arreglo de diferencias sucesivas:");
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }
    }
}