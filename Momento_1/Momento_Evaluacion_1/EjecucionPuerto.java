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
                    do {
                        System.out.println("\n--- MENÚ DE REGISTRO DE BUQUES ---\n-- ¿Que opcion desea realizar? --\n");
                        System.out.println("1. Registrar entrada de Buque\n2. Registrar salida de buque\n3. Listado de buques en el muelle\n4. Volver al menú principal");
                        System.out.print("Seleccione una opción: ");

                        if (input.hasNextInt()) {
                        int valido = input.nextInt(); // Consumimos el número

                        if (valido >= 1 && valido <= 3) {
                        opcion = valido; // El valor es totalmente válido
                        } else {
                        System.out.println("Error: El número está fuera de rango (1-3).");
                        opcion = 0; // Opcional: un valor que obligue a repetir
                        }
                        } else {
                            System.out.println("Error: ¡Debes ingresar un número entero!");
                        input.next(); // LIMPIEZA: Sacamos la basura (letras) del buffer
                        opcion = 0;
                        }
            

                        switch (opcion) {
                            case 1:
                                System.out.print("Nombre del buque: ");
                                input.nextLine(); // Consumimos el salto de línea pendiente
                                String nombreBuque = input.nextLine();
                                int cantidad = 0;

                                cantidad = gestion.validarCantidadContenedores(input); // Validamos la cantidad de contenedores a generar

                                gestion.generarCargaAutomatica(cantidad); // Generamos la carga automáticamente

                                Buque nuevobuque = new Buque(nombreBuque, gestion.contenedores); // Creamos el buque con el nombre y un número de contenedores inicial
                                if (gestion.registrarBuque(nuevobuque)) {
                                System.out.println("Buque registrado.");
                                } else {
                                    System.out.println("Muelle lleno.");
                                }
                                break;

                            case 2:
                                System.out.print("Nombre del buque a registrar salida: ");
                                input.nextLine(); // Consumimos el salto de línea pendiente
                                String nombreSalida = input.nextLine();
                                if (gestion.registrarSalidaBuque(nombreSalida)) {
                                    System.out.println("Buque registrado para salida.");
                                } else {
                                    System.out.println("Buque no encontrado.");
                                }
                                break;

                            case 3:
                                System.out.println("--- Listado de Buques en el Muelle ---");
                                for (int i = 0; i < 10; i++) {
                                    if (gestion.muelleBuques[i] != null)
                                        System.out.println("Posicion ["+i+"] -> " + gestion.muelleBuques[i].nombre);
                                }
                                break;

                            case 4:
                                System.out.println("Volviendo al menú principal...");
                                break;

                        } 
                    } while (opcion != 4);
                
                        

                case 2:
                    gestion.mostrarEsquema();
                    System.out.print("Columna (0-9): ");
                    int columna = input.nextInt();

                    if (!gestion.hayBuquesEnMuelle()) {
                        System.out.println("No hay buques en el muelle, no hay contenedores para registrar.");
                        break;
                    }
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
    

    
    input.close();

    }

}