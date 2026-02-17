import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args) {

        int[] edades1 = { 18, 19, 22, 20, 21};
        int[] edades2 = { 17, 20, 19, 18, 25};

        int mayor1 = definirMayor(edades1);
        int mayor2 = definirMayor(edades2);

        System.out.println("La mayor edad del primer arreglo es: " + mayor1);                                                                           
        System.out.println("La mayor edad del segundo arreglo es: " + mayor2);

    }

    public static int definirMayor(int[] array) {
            int mayor = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > mayor) {
                    mayor = array[i];
                }
            }
            return mayor;
    }

    
}