import java.util.Random;
import java.util.Scanner;

public class EjecucionPuerto {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GestionPuerto gestion = new GestionPuerto();
        int opcion = 0;
        Random random = new Random();
        do {
            System.out.println("\n--- BIENVENIDO AL PUESTO DE LOGISTICA ---\n-- ¿Que opcion desea realizar? --\n");
            System.out.println("1. Registrar Buque\n2. Registrar Contenedor\n3. Peso Total\n4. Listar Origenes\n5. Salir");
            System.out.print("Seleccione una opción: ");

            if (input.hasNextInt()) {
                int valido = input.nextInt(); // Consumimos el número

                if (valido >= 1 && valido <= 5) {
                    opcion = valido; // El valor es totalmente válido
                } else {
                    System.out.println("Error: El número está fuera de rango (1-5).");
                    opcion = 0; // Opcional: un valor que obligue a repetir
                }
            } else {
                System.out.println("Error: ¡Debes ingresar un número entero!");
                input.next(); // LIMPIEZA: Sacamos la basura (letras) del buffer
                opcion = 0;
            }
            

            switch (opcion) {
                case 1:
                    System.out.print("Datos del buque: ");
                    input.nextLine(); // Consumimos el salto de línea pendiente
                    String nombre = input.nextLine(); // Leemos el nombre completo del buque
                    int numeroContenedores = 1 + random.nextInt(15); // Cantidad aleatoria entre 1 y 15
                    Buque nuevoBuque = new Buque(nombre, numeroContenedores);
                    if (gestion.registrarBuque(nuevoBuque)) {
                        System.out.println("Buque registrado.");
                    } else {
                        System.out.println("Muelle lleno.");
                    }
                    break;
                case 2:
                    gestion.mostrarEsquema();
                    System.out.print("Columna (0-9): ");
                    int columna = input.nextInt();

                    // Generación aleatoria
                    int id = random.nextInt(100); // IDs entre 0 y 99
                    double peso = 20 + (30 - 20) * random.nextDouble(); // Peso entre 20 y 30 toneladas
                    String[] origenes = { "Colombia", "China", "USA", "Brasil", "España" };
                    String origen = origenes[random.nextInt(origenes.length)];

                    Contenedores contenedores = new Contenedores(id, peso, origen);

                    if (gestion.registrarContenedor(columna, contenedores)) {
                        System.out.println("Ubicado con éxito: " + contenedores);
                    }
                        
                    else {
                        System.out.println("No hay espacio en esa columna.");
                    }
                        
                    break;
                case 3:
                    System.out.println("Peso Total: " + gestion.calcularPesoTotal());
                    break;
                case 4:
                    System.out.println("--- Listado de Origenes ---");
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 10; j++) {
                            if (gestion.terminalContenedores[i][j] != null)
                                System.out.println("Posicion ["+i+"]["+j+"] -> " + gestion.terminalContenedores[i][j].origen);
                        }
                    }
                    break;
            }
        } while (opcion != 5);
    }
}