import java.util.*;

public class Ejercicio19 {
    public static void main(String[] args) {
        int[][] M = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) M[i][j] = 1;
                else M[i][j] = 0;
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }
}