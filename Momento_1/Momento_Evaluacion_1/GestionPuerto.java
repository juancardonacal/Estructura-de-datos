public class GestionPuerto {
    Contenedores[][] patio = new Contenedores[10][10];
    String[] muelleBuques = new String[10];

    public void mostrarEsquema() {
        System.out.println("\n--- MAPA DE DISPONIBILIDAD (Fila 9 es el suelo) ---");
        for (int i = 0; i < 10; i++) {
            System.out.print("Fila " + i + ": ");
            for (int j = 0; j < 10; j++) {
                System.out.print(patio[i][j] == null ? "[ ] " : "[X] ");
            }
            System.out.println();
        }
    }

    // Método de apilado: se llena de abajo hacia arriba
    public boolean registrarContenedor(int col, Contenedores c) {
        if (col < 0 || col > 9) return false;
        for (int i = 9; i >= 0; i--) { // De abajo hacia arriba
            if (patio[i][col] == null) {
                patio[i][col] = c;
                return true;
            }
        }
        return false;
    }

    public boolean registrarBuque(String nombre) {
        for (int i = 0; i < 10; i++) {
            if (muelleBuques[i] == null) {
                muelleBuques[i] = nombre;
                return true;
            }
        }
        return false;
    }

    public double calcularPesoTotal() {
        double total = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (patio[i][j] != null) total += patio[i][j].peso;
            }
        }
        return total;
    }
}