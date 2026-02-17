import java.util.*;

public class Ejercicio22 {
    public static void main(String[] args) {
        int[][] M = {{5,12,8,2,3},{7,1,9,4,6},{11,15,20,13,14},{10,22,5,3,8},{0,4,7,12,3}};
        int mayor = M[0][0], menor = M[0][0];
        int fMa = 0, cMa = 0, fMe = 0, cMe = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (M[i][j] > mayor) { mayor = M[i][j]; fMa = i; cMa = j; }
                if (M[i][j] < menor) { menor = M[i][j]; fMe = i; cMe = j; }
            }
        }
        System.out.println("El mayor es " + mayor + " en posicion: " + fMa + "," + cMa);
        System.out.println("El menor es " + menor + " en posicion: " + fMe + "," + cMe);
    }
}