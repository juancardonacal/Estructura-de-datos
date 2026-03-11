public class EjecutarNave {
    
    public static void main(String[] args) {
        gestionNave nave = new gestionNave();

        // Imprimir el manifiesto de suministros
        System.out.println("Manifiesto de Suministros:");
        for (Suministro suministro : nave.manifiesto) {
            if (suministro != null) {
                System.out.println("ID: " + suministro.getId() + ", Nivel de Energía: " + suministro.getNivelEnergia() + ", Prioridad: " + suministro.getPrioridad());
            } else {
                System.out.println("Posición vacía en el manifiesto.");
            }
        }
    }
}
