import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        //Se realiza el arreglo A con 10 elementos
        int[] A = {12, 5, 8, 21, 4, 33, 7, 10, 2, 15};
        
        //Se realizan arreglos para guardar pares e impares
        int[] pares = new int[10];
        int[] impares = new int[10];
        
        //tambien los contadores para saber la posicion en cada arreglo
        int cP = 0;
        int cI = 0;

        //Se definen pares e impares con el modulo.
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                pares[cP] = A[i];
                cP++;
            } else {
                impares[cI] = A[i];
                cI++;
            }
        }

        //Imprimimos los numeros pares
        System.out.println("Los numeros pares son:");
        for (int i = 0; i < cP; i++) {
            System.out.println(pares[i]);
        }

        //Imprimimos los numeros impares
        System.out.println("Los numeros impares son:");
        for (int i = 0; i < cI; i++) {
            System.out.println(impares[i]);
        }
    }
}