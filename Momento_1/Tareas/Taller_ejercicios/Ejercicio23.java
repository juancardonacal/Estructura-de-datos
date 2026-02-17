import java.util.*;

public class Ejercicio23 {
    public static void main(String[] args) {
        int[][] M = {
            {4,-6,8,2,0},
            {10,2,-15,3,0},
            {1,1,1,1,0},
            {-20,5,2,4,0},
            {3,9,4,2,0}
        };

        for (int i = 0; i < 5; i++) {
            int mayorAbs = Math.abs(M[i][0]);
            for (int j = 1; j < 4; j++) {
                if (Math.abs(M[i][j]) > mayorAbs) mayorAbs = Math.abs(M[i][j]);
            }
            M[i][4] = mayorAbs;
            System.out.println("Mayor absoluto fila " + i + ": " + M[i][4]);
        }
    }
}