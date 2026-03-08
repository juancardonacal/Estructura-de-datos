public class GestionPuerto {
    Contenedores[][] terminalContenedores = new Contenedores[10][10];
    Buque[] muelleBuques = new Buque[10];

    public void mostrarEsquema() {
        System.out.println("\n--- MAPA DE DISPONIBILIDAD (Fila 9 es el suelo) ---");
        for (int i = 0; i < 10; i++) {
            System.out.print("Fila " + i + ": ");
            for (int j = 0; j < 10; j++) {
                System.out.print(terminalContenedores[i][j] == null ? "[ ] " : "[X] ");
            }
            System.out.println();
        }
    }

    // Método de apilado: se llena de abajo hacia arriba
    public boolean registrarContenedor(int columna, Contenedores contenedores) {
        if (columna < 0 || columna > 9) return false;
        for (int i = 9; i >= 0; i--) { // De abajo hacia arriba
            if (terminalContenedores[i][columna] == null) {
                terminalContenedores[i][columna] = contenedores;
                return true;
            }
        }
        return false;
    }

    public boolean registrarBuque(Buque nuevoBuque) {
        for (int i = 0; i < muelleBuques.length; i++) {
            if (muelleBuques[i] == null) {
                muelleBuques[i] = nuevoBuque;
                return true;
            }
        }
        return false;
    }

    public double calcularPesoTotal() {
        double total = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (terminalContenedores[i][j] != null) total += terminalContenedores[i][j].peso;
            }
        }
        return total;
    }

    public boolean registrarSalidaContenedor(int columna) {
        if (columna < 0 || columna > 9) return false;
        for (int i = 0; i < 10; i++) { // De arriba hacia abajo
            if (terminalContenedores[i][columna] != null) {
                terminalContenedores[i][columna] = null; // Liberamos el espacio
                return true;
            }
        }
        return false; // No se encontró contenedor en esa columna
    }

    public boolean registrarSalidaBuque(String nombre) {
        for (int i = 0; i < 10; i++) {
            if (muelleBuques[i] != null && muelleBuques[i].nombre.equals(nombre)) {
                muelleBuques[i] = null; // Liberamos el espacio
                return true;
            }
        }
        return false; // No se encontró el buque
    }
}