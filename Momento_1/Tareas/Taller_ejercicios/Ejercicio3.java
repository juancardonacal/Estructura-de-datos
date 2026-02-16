import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6};

        int sumaPares = 0;
        int sumaImpares = 0;


        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                sumaPares += numeros[i];
            } else {
                sumaImpares += numeros[i];
            }
        }
        System.out.println("Suma de números pares: " + sumaPares);
        System.out.println("Suma de números impares: " + sumaImpares);
    }
}