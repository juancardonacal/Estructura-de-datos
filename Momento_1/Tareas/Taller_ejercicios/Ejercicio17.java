import java.util.*;

public class Ejercicio17 {
    public static void main(String[] args) {
        int[][] M = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {1,1,1,1,1},
            {2,2,2,2,2},
            {3,3,3,3,3}
        };

        for (int i = 0; i < 5; i++) {
            int sumaF = 0;
            for (int j = 0; j < 5; j++) sumaF += M[i][j];
            System.out.println("Suma fila " + i + ": " + sumaF);
        }

        for (int j = 0; j < 5; j++) {
            int sumaC = 0;
            for (int i = 0; i < 5; i++) sumaC += M[i][j];
            System.out.println("Suma columna " + j + ": " + sumaC);
        }
    }
}