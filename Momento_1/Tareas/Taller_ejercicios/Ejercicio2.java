import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] a = {2000000, 2000000, 2000000, 2000000, 2000000, 2000000 };
        int[] b = {500000, 200000, 100000, 300000, 200000, 400000 };
        int[] c = {100000, 100000, 100000, 100000, 120000, 120000 };

        int[] t = new int[6]; 
        //Reserva en memoria un arreglo de tamaño 5 para almacenar
        // la operacion del cálculo de cada trabajador
        
        for(int i = 0; i < a.length; i++){
            t[i] = a[i] + b[i] - c[i]; 
            //Almacena en el arreglo t la operación establecida en el pdf
        }

        
        

        for(int i = 0; i < a.length; i++){
            //El format hace que el numero tenga comas cada 3 dígitos para una mejor lectura
            String formato = String.format("%,d", t[i]);
            System.out.println("t[" + i + "]=" + formato + " | ");
            //Muestra la información que se almacenó en el arreglo t
        }
        
    }
}