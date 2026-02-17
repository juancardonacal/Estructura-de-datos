import java.util.*;

public class Ejercicio24 {
    public static void main(String[] args) {
        double[] cosecha = {120, 150, 100, 200, 180, 90, 130, 140, 160, 110, 170, 105};
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        double suma = 0;
        for (double c : cosecha) suma += c;
        double promedio = suma / 12;

        int superior = 0, inferior = 0, mesMayor = 0;
        for (int i = 0; i < 12; i++) {
            if (cosecha[i] > promedio) superior++;
            if (cosecha[i] < promedio) inferior++;
            if (cosecha[i] > cosecha[mesMayor]) mesMayor = i;
        }

        System.out.println("Promedio anual: " + promedio);
        System.out.println("Meses superiores al promedio: " + superior);
        System.out.println("Meses inferiores al promedio: " + inferior);
        System.out.println("Mes con mayor produccion: " + meses[mesMayor]);
    }
}