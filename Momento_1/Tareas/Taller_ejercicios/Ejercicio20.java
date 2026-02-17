import java.util.*;

public class Ejercicio20 {
    public static void main(String[] args) {
        int[][] M = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) M[i][j] = 0;
                else M[i][j] = 1; // Relleno con 1 lo demas para visualizar
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }
}