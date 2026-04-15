public class EjecutarDataBay {

public static void main(String[] args) {
        PuertoDataBay puerto = new PuertoDataBay();

        System.out.println("--- Módulo 1: Manifiesto ---");
        // Simulamos la llegada de un camión con 3 contenedores
        Contenedor[] llegadas = {
            new Contenedor("Contenedor1", 5000.0, 2),
            new Contenedor("Contenedor2", 7500.5, 1), // Prioridad 1 (Peligroso)
            new Contenedor("Contenedor3", 3200.0, 3)
        };
        puerto.registrarManifiesto(llegadas);

        System.out.println("\n--- Módulo 2: Patio de Almacenamiento ---");
        // Mandamos los contenedores a buscar hueco en la matriz
        for (Contenedor c : llegadas) {
            puerto.ubicarEnPatio(c);
        }

        System.out.println("\n--- Módulo 3: Bahía de Inspección ---");
        // Filtramos para ver cuáles van a rayos X (Solo debería ir C-BRAVO)
        for (Contenedor c : llegadas) {
            puerto.enviarAInspeccion(c);
        }
        Contenedor revisado = puerto.procesarInspeccion();
        if (revisado != null) {
            System.out.println("Inspección completada y liberado: " + revisado.getId());
        }

        System.out.println("\n--- Módulo 4: Estiba en el Buque (y bono) ---");
        // Metemos uno pesado en el fondo
        puerto.estibarEnBuque(new Contenedor("BASE-01", 10000.0, 2));
        
        // Metemos uno más liviano encima (El bono debería dejarlo pasar)
        puerto.estibarEnBuque(new Contenedor("MID-02", 8000.0, 2));
        
        // Intentamos meter uno pesado sobre el liviano (El bono debería bloquearlo)
        puerto.estibarEnBuque(new Contenedor("FAIL-03", 9500.0, 2));

        System.out.println("\n--- Módulo 4: OPERACIÓN CRÍTICA ---");
        // Sacamos el dañado del fondo (Debería sacar BASE-01 y dejar MID-02)
        puerto.removerContenedorDanadoFondo();
    }
}