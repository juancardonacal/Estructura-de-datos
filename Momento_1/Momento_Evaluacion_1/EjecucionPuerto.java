import java.util.Random;
import java.util.Scanner;

public class EjecucionPuerto {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GestionPuerto gestion = new GestionPuerto();
        int opcion = 0;
        Random random = new Random();
        do {
            System.out.println("\n--- LOGISTICA JH ---");
            System.out.println("1. Registrar Buque\n2. Registrar Contenedor\n3. Peso Total\n4. Listar Origenes\n5. Salir");
            System.out.print("Seleccione: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del buque: ");
                    if (gestion.registrarBuque(input.next())) System.out.println("Buque registrado.");
                    else System.out.println("Muelle lleno.");
                    break;
                case 2:
                    gestion.mostrarEsquema();
                    System.out.print("Columna (0-9): ");
                    int col = input.nextInt();

                    // Generación aleatoria
                    int id = random.nextInt(100); // IDs entre 0 y 99
                    double peso = 30 + (50 - 30) * random.nextDouble(); // Peso entre 30 y 50
                    String[] origenes = { "Colombia", "China", "USA", "Brasil", "España" };
                    String origen = origenes[random.nextInt(origenes.length)];

                    Contenedores c = new Contenedores(id, peso, origen);

                    if (gestion.registrarContenedor(col, c))
                        System.out.println("Ubicado con éxito: " + c);
                    else
                        System.out.println("No hay espacio en esa columna.");
                    break;
                case 3:
                    System.out.println("Peso Total: " + gestion.calcularPesoTotal());
                    break;
                case 4:
                    System.out.println("--- Listado de Origenes ---");
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 10; j++) {
                            if (gestion.patio[i][j] != null)
                                System.out.println("Posicion ["+i+"]["+j+"] -> " + gestion.patio[i][j].origen);
                        }
                    }
                    break;
            }
        } while (opcion != 5);
    }
}