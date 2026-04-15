public class Contenedor {
    // Atributos encapsulados
    private String id;
    private double peso;
    private int prioridad;

    // Constructor base
    public Contenedor(String id, double peso, int prioridad) {
        this.id = id;
        this.peso = peso;
        this.prioridad = prioridad;
    }

    // Getters
    public String getId() { return id; }
    public double getPeso() { return peso; }
    public int getPrioridad() { return prioridad; }
}