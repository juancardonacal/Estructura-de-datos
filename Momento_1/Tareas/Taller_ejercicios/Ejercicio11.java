import java.util.*;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[] A = {-5, 0, 12, -2, 0};
        int[] neg = new int[5];
        int[] ceros = new int[5];
        int[] pos = new int[5];
        
        int cn = 0, cc = 0, cp = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                neg[cn] = A[i];
                cn++;
            } else if (A[i] == 0) {
                ceros[cc] = A[i];
                cc++;
            } else {
                pos[cp] = A[i];
                cp++;
            }
        }

        System.out.println("Elementos negativos:");
        for (int i = 0; i < cn; i++) System.out.println(neg[i]);
        
        System.out.println("Elementos cero:");
        for (int i = 0; i < cc; i++) System.out.println(ceros[i]);
        
        System.out.println("Elementos positivos:");
        for (int i = 0; i < cp; i++) System.out.println(pos[i]);
    }
}