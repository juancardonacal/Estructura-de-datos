import java.util.*;

public class Ejercicio16 {
    public static void main(String[] args) {
        String[] nombres = {"Marta", "Pedro", "Lucia", "Juan", "Elena"};
        int[] edades = {45, 28, 52, 35, 40};
        char[] sexo = {'F', 'M', 'F', 'M', 'F'};

        double sumaE = 0;
        for (int e : edades) sumaE += e;
        double promedio = sumaE / edades.length;

        int joven = 0, viejo = 0;
        for (int i = 1; i < edades.length; i++) {
            if (edades[i] < edades[joven]) joven = i;
            if (edades[i] > edades[viejo]) viejo = i;
        }

        int mujeresMayor = 0, hombresMenor = 0;
        for (int i = 0; i < edades.length; i++) {
            if (sexo[i] == 'F' && edades[i] > promedio) mujeresMayor++;
            if (sexo[i] == 'M' && edades[i] < promedio) hombresMenor++;
        }

        System.out.println("Edad promedio: " + promedio);
        System.out.println("Profesor mas joven: " + nombres[joven]);
        System.out.println("Profesor con mayor edad: " + nombres[viejo]);
        System.out.println("Profesoras con edad mayor al promedio: " + mujeresMayor);
        System.out.println("Profesores con edad menor al promedio: " + hombresMenor);
    }
}