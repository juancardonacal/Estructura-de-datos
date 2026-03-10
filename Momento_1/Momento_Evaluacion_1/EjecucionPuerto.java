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
            System.out.println("1. Acceder al menú de Registro de Buques.\n2. Acceder al menú de Registro de contenedores.\n3. Peso Total\n4. Listar Origenes\n5. Salir");
            System.out.print("Seleccione una opción: ");

            /* Validamos la entrada del usuario mediante condicionales,
            de esta manera el codigo queda mas robusto*/
            if (input.hasNextInt()) {
                int valido = input.nextInt();//Pedimos el número al usuario.

                if (valido >= 1 && valido <= 5) {
                    opcion = valido; 
                } else {
                    System.out.println("Error: El número está fuera de rango (1-5).");
                    opcion = 0;// Y si se equivoca, le damos un valor que obligue a repetir el ciclo.
                }
            } else {
                System.out.println("Error: ¡Debes ingresar un número entero!");
                input.next();//Ademas de limpiar el buffer (memoria temporal de entrada)
                opcion = 0;
                // A partir de aquí, todos los menús tendrán este tipo de validación.
            }
            

            switch (opcion) {
                case 1:
                    do {
                        System.out.println("\n--- MENÚ DE REGISTRO DE BUQUES ---\n-- ¿Que opcion desea realizar? --\n");
                        System.out.println("1. Registrar entrada de Buque\n2. Registrar salida de buque\n3. Listado de buques en el muelle\n4. Volver al menú principal");
                        System.out.print("Seleccione una opción: ");

                        if (input.hasNextInt()) {
                        int valido = input.nextInt();

                        if (valido >= 1 && valido <= 4) {
                        opcion = valido;  
                        } else {
                        System.out.println("Error: El número está fuera de rango (1-4).");
                        opcion = 0; 
                        }
                        } else {
                            System.out.println("Error: ¡Debes ingresar un número entero!");
                        input.next();
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
                                /* Esta es la operacion inversa al registro de entrada solo
                                que menos sofisticada, de manera que resive el nombre del buque
                                y lo registra para salida (Libera su espacio en el array) */
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
                    break;
                
                        

                case 2:
                    do {
                        System.out.println("\n--- MENÚ DE REGISTRO DE CONTENEDORES ---\n-- ¿Que opcion desea realizar? --\n");
                        System.out.println("1. Registrar entrada de Contenedor\n2. Registrar salida de contenedor\n3. Mostrar Esquema de la terminal\n4. Volver al menú principal");
                        System.out.print("Seleccione una opción: ");

                        if (input.hasNextInt()) {
                        int valido = input.nextInt(); // Consumimos el número

                        if (valido >= 1 && valido <= 4) {
                        opcion = valido; // El valor es totalmente válido
                        } else {
                        System.out.println("Error: El número está fuera de rango (1-4).");
                        opcion = 0; // Opcional: un valor que obligue a repetir
                        }
                        } else {
                            System.out.println("Error: ¡Debes ingresar un número entero!");
                        input.next(); // LIMPIEZA: Sacamos la basura (letras) del buffer
                        opcion = 0;
                        }
            

                        switch (opcion) {
                            case 1:
                                /*Con este menú interactuamos de manera directa con el buque, evidenciando
                                el correcto modelado de los objetos mediante una abstraccion mas precisa
                                de la realidad y un manejo de los datos eficiente (En mi opinion)*/

                                // Validamos que exista un buque
                                if (!gestion.hayBuquesEnMuelle()) {
                                System.out.println("Error: No hay buques registrados para descargar.");
                                break;
                                }
                                // mostramos una lista de los buques para elegir
                                System.out.println("--- Buques disponibles en el muelle ---");
                                for (int i = 0; i < 10; i++) {
                                    if (gestion.muelleBuques[i] != null)
                                        System.out.println("Posicion ["+i+"] -> " + gestion.muelleBuques[i].nombre);
                                }
                                // Pedimos al usuario que elija un buque por su posición
                                System.out.print("Ingrese la posición del buque a descargar (0-9): ");
                                int posicionBuque = input.nextInt();
                                if (posicionBuque < 0 || posicionBuque > 9 || gestion.muelleBuques[posicionBuque] == null) {
                                    System.out.println("Posición inválida o no hay buque en esa posición.");
                                    break;
                                }
                                // Obtenemos el buque seleccionado
                                Buque buqueGestion = gestion.muelleBuques[posicionBuque];

                                // disponibles define la cantidad de contenedores disponibles para descargar
                                int disponibles = buqueGestion.contarContenedoresBordo();

                                if (disponibles == 0) {
                                    System.out.println("El buque ya está completamente vacío.");
                                    break;
                                }

                                // 2. Elegir cantidad a descargar
                                System.out.println("El buque tiene " + disponibles + " contenedores.");
                                System.out.print("¿Cuántos desea descargar?: ");
                                int cantidadDescargar = input.nextInt(); // Aquí puedes usar la validación que hicimos antes

                                if (cantidadDescargar > disponibles) {
                                    System.out.println("No hay suficientes contenedores para descargar.");
                                    System.out.println("Se descargarán los " + disponibles + " contenedores disponibles.");
                                    cantidadDescargar = disponibles; // Ajustamos si pide más de los que hay
                                }


                                // Ciclo de descarga uno por uno en el esquema de la terminal
                                for (int i = 0; i < cantidadDescargar; i++) {
                                    System.out.println("\nDescargando contenedor " + (i + 1) + " de " + cantidadDescargar);

                                    // Sacamos el contenedor del barco
                                    Contenedores contenedorExtraido = buqueGestion.descargarUnContenedor();

                                    boolean ubicado = false;
                                    while (!ubicado) {
                                        gestion.mostrarEsquema(); // Mostramos la terminal para que el usuario vea dónde puede colocar el contenedor
                                        System.out.print("Ingrese la columna de destino (0-9): ");
                                        int columnaDestino = input.nextInt();

                                        if (columnaDestino >= 0 && columnaDestino <= 9) {
                                            // Aplicamos la lógica de registro en la terminal
                                            if (gestion.registrarContenedor(columnaDestino, contenedorExtraido)) {
                                                System.out.println("Contenedor ubicado en la columna " + columnaDestino);
                                                ubicado = true; // Rompe el while y pasa al siguiente contenedor
                                            } else {
                                                System.out.println(
                                                        "Error: La columna " + columnaDestino + " está llena. Elija otra.");
                                            }
                                        } else {
                                            System.out.println("Columna inválida. Intente de nuevo.");
                                        }
                                    }
                                }
                                System.out.println("Operación de descarga finalizada.");
                                break;

                            case 2:
                                /* Lo mismo que con el otro, libera un espacio en la matriz,
                                con la diferencia de que ha este le aplica la logica organizacional
                                de la terminal de contenedores. */
                                System.out.print("Ingrese la columna del contenedor a registrar salida (0-9): ");
                                int columnaSalida = input.nextInt();

                                if (columnaSalida >= 0 && columnaSalida <= 9) {
                                    if (gestion.registrarSalidaContenedor(columnaSalida)) {
                                        System.out.println("Contenedor registrado para salida.");
                                    } else {
                                        System.out.println("No hay contenedores en esa columna.");
                                    }
                                } else {
                                    System.out.println("Columna inválida. Intente de nuevo.");
                                }
                                break;
                            case 3:
                                System.out.println("--- Esquema de la Terminal ---");
                                gestion.mostrarEsquema();
                                break;

                            case 4:
                                System.out.println("Volviendo al menú principal...");
                                break;

                        } 
                    } while (opcion != 4);
                    break;
                    
                    

                case 3:
                    /* no hay mucho que explicar, es la sumatoria del atributo peso de cada
                    contenedor que se encuentra en la terminal */
                    System.out.println("Peso Total: " + gestion.calcularPesoTotal());
                    break;

                case 4:
                    // Listado sencillo que recorre la terminal de contenedores.
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