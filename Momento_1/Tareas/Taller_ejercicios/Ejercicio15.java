import java.util.*;

public class Ejercicio15 {
    public static void main(String[] args) {
        String[] N = {"Ana", "Luis", "Jose", "Sara", "Betto"};
        double[] S = {1200, 1500, 1200, 1800, 1300};
        double suma = 0;

        for (int i = 0; i < S.length; i++) {
            suma += S[i];
        }
        double promedio = suma / S.length;

        int cantidad = 0;
        System.out.println("Trabajadores con sueldo promedio (" + promedio + "):");
        for (int i = 0; i < S.length; i++) {
            if (S[i] == promedio) {
                System.out.println(N[i]);
                cantidad++;
            }
        }
        System.out.println("Cantidad de trabajadores con sueldo promedio: " + cantidad);
    }
}