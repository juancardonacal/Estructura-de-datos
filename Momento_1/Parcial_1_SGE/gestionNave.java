import java.util.Random;

public class gestionNave {

    int[] energiaContenedores = new int[12];
    {

        for (int i = 0; i < energiaContenedores.length; i++) {
            Random random = new Random();
            energiaContenedores[i] = 50 + random.nextInt(101); // Genera un número aleatorio entre 50 y 150

        }

    }
    // Solo multiplos de 10
    int[] energiaMultiplosDe10 = new int[12];
    {
        for (int i = 0; i < energiaMultiplosDe10.length; i++) {
            if (energiaContenedores[i] % 10 == 0) {
                energiaMultiplosDe10[i] = energiaContenedores[i];
            }
        }
    }

    int[][] mapaCarga = new int[3][3];
    {
        int index = 0;
        for (int i = 0; i < mapaCarga.length; i++) {
            for (int j = 0; j < mapaCarga[i].length; j++) {
                mapaCarga[i][j] = energiaMultiplosDe10[index];
                index++;

            }
        }
        // Si mapaCarga tiene menos de 9 elementos, se llenan los espacios restantes con -1
        for (int i = 0; i < mapaCarga.length; i++) {
            for (int j = 0; j < mapaCarga[i].length; j++) {
                if (mapaCarga[i][j] == 0) {
                    mapaCarga[i][j] = -1; // Asignar -1 a los espacios vacíos
                }

            }
        }
    }
    /* Cree un arreglo de objetos Suministro[] manifiesto con capacidad para 9 elementos.
    Recorra la matriz mapaCarga y, por cada celda:
    1. Si el valor es diferente de -1, instancie un objeto Suministro.
    2. La prioridad será .ALTA"si la energía es > 100, de lo contrario .ESTÁNDAR".
    3. Si el valor de la celda es -1, la posición correspondiente en el arreglo de objetos debe
    ser null.*/
    Suministro[] manifiesto = new Suministro[9];
    {
        int index = 0;
        for (int i = 0; i < mapaCarga.length; i++) {
            for (int j = 0; j < mapaCarga[i].length; j++) {
                if (mapaCarga[i][j] != -1) {
                    String prioridad = (mapaCarga[i][j] > 100) ? "ALTA" : "ESTÁNDAR";
                    // El id está en el formato "C" seguido de fila y columna, por ejemplo, "C00" para la celda (0,0)
                    manifiesto[index] = new Suministro("C" + i + j, mapaCarga[i][j], prioridad);
                } else {
                    manifiesto[index] = null; // Asignar null a las posiciones correspondientes
                }
                index++;
            }
        }
    }

}
