import java.util.*;

public class Ejercicio13 {
    public static void main(String[] args) {
        int[] A = {10, 20, 30, 40, 50};
        double suma = 0;
        
        for (int i = 0; i < A.length; i++) {
            suma += A[i];
        }
        
        double media = suma / A.length;
        
        int[] mayores = new int[5];
        int[] menores = new int[5];
        int cMa = 0, cMe = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > media) {
                mayores[cMa] = A[i];
                cMa++;
            } else if (A[i] < media) {
                menores[cMe] = A[i];
                cMe++;
            }
        }

        System.out.println("La media es: " + media);
        System.out.println("Elementos mayores que la media:");
        for (int i = 0; i < cMa; i++) System.out.println(mayores[i]);
        
        System.out.println("Elementos menores que la media:");
        for (int i = 0; i < cMe; i++) System.out.println(menores[i]);
    }
}