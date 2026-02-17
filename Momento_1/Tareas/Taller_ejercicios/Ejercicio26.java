import java.util.*;

public class Ejercicio26 {
    public static void main(String[] args) {
        double[][] ventas = new double[8][30]; // 8 modelos, 30 dias
        // Llenado ficticio
        for(int i=0; i<8; i++) for(int j=0; j<30; j++) ventas[i][j] = 100;

        double[] totalModelo = new double[8];
        int modeloMas = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 30; j++) totalModelo[i] += ventas[i][j];
            System.out.println("Total modelo " + i + ": " + totalModelo[i]);
            if (totalModelo[i] > totalModelo[modeloMas]) modeloMas = i;
        }

        for (int j = 0; j < 30; j++) {
            double totalDia = 0;
            for (int i = 0; i < 8; i++) totalDia += ventas[i][j];
            System.out.println("Total recaudado dia " + (j + 1) + ": " + totalDia);
        }

        System.out.println("Modelo que mas dinero produjo: " + modeloMas);
    }
}