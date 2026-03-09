public class Buque {
    
    String nombre;
    Contenedores[] contenedores;

    /*Un buque pequeño puede tener una cantidad gigantesta de
    contenedores (1000 Aprox.), pero para efectos de este ejercicio, se limitará
    a 15 contenedores por buque.
    */ 
    public Buque(String nombre, Contenedores[] contenedores) {
        this.nombre = nombre;
        this.contenedores = contenedores; // Cada buque puede llevar 1-15 contenedores
    }
}
