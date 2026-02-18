import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        // se realizan arreglos de tamaño 5 para todos.
        double[] A = {1200000, 850000, 2300000, 950000, 1600000};
        double[] P = {10, 12, 8, 15, 10}; 
        double[] G = new double[5];

        //Se realiza el calculo de las ganancias
        for (int i = 0; i < A.length; i++) {
            G[i] = A[i] * (P[i] / 100);
        }

        // Impresion de resultados simple
        for (int i = 0; i < G.length; i++) {
            System.out.println("La ganancia de la vivienda " + (i + 1) + " es: " + G[i]);
        }
    }
}