import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] PU = {100000, 500000, 700000, 200000, 250000, 400000 };
        int[] CC = {3, 5, 4, 7, 2, 4 };
        String[] D = {"audifonos", "microfono", "planta", "cable", "linea", "parlante"};

        int[] TG = new int[6];
    

        for(int i = 0; i < PU.length; i++){
            TG[i] = PU[i] * CC[i];
        }

        int totalGeneral = 0;

        for(int i = 0; i < TG.length; i++){
            totalGeneral += TG[i];
        }

        int mayorTG = TG[0];
        String mayorD = D[0];

        for (int i = 1; i < TG.length; i++) {
            if (TG[i] > mayorTG) {
                mayorTG = TG[i];
                mayorD = D[i]; 
            } 
            }

        System.out.println("El producto que obtuvo mayor gasto fue: " + mayorD + " con un gasto de: " + mayorTG);
        System.out.println("El gasto total de la compra fue: " + totalGeneral);

        for(int i = 0; i < D.length; i++){
            System.out.println("El gasto del producto " + D[i] + " fue: " + TG[i]);
        }
    }
   
}



            
        