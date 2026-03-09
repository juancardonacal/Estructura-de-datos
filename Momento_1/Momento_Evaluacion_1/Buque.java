public class Buque {

    String nombre;
    Contenedores[] contenedores;

    /*
     * Un buque pequeño puede tener una cantidad gigantesta de
     * contenedores (1000 Aprox.), pero para efectos de este ejercicio, se limitará
     * a 15 contenedores por buque.
     */
    public Buque(String nombre, Contenedores[] contenedores) {
        this.nombre = nombre;
        this.contenedores = contenedores;
    }

    public Contenedores descargarUnContenedor() {
        for (int i = 0; i < contenedores.length; i++) {
            if (contenedores[i] != null) {
                Contenedores c = contenedores[i];
                contenedores[i] = null; // Lo sacamos del barco
                return c; // Lo entregamos
            }
        }
        return null; // Retorna null si el barco ya está vacío
    }

    public int contarContenedoresBordo() {
        int contador = 0;
        for (int i = 0; i < contenedores.length; i++) {
            if (contenedores[i] != null)
                contador++;
        }
        return contador;
    }
}
