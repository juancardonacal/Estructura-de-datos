import java.util.*;

public class Ejercicio25 {
    public static void main(String[] args) {
        int[][] P = new int[20][7]; // 20 plantas, 7 dias
        // Llenado ficticio
        for(int i=0; i<20; i++) for(int j=0; j<7; j++) P[i][j] = (i+j+10);

        int plantaMayorSemanal = 0, mayorSuma = 0;
        for (int i = 0; i < 20; i++) {
            int sumaF = 0;
            for (int j = 0; j < 7; j++) sumaF += P[i][j];
            if (sumaF > mayorSuma) { mayorSuma = sumaF; plantaMayorSemanal = i; }
        }

        int diaUsuario = 3; // Ejemplo: Miercoles
        int plantaMayorDia = 0, mayorDia = P[0][diaUsuario];
        for (int i = 1; i < 20; i++) {
            if (P[i][diaUsuario] > mayorDia) {
                mayorDia = P[i][diaUsuario];
                plantaMayorDia = i;
            }
        }

        System.out.println("Planta con mayor produccion semanal: " + (plantaMayorSemanal + 1));
        System.out.println("Planta con mayor produccion el dia " + diaUsuario + ": " + (plantaMayorDia + 1) + " con " + mayorDia);
    }
}