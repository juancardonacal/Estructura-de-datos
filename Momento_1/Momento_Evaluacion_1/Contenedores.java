public class Contenedores {
    int id;
    double peso;
    String origen;

    public Contenedores(int id, double peso, String origen) {
        this.id = id;
        this.peso = peso;
        this.origen = origen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return "Contenedores [id=" + id + ", peso=" + peso + ", origen=" + origen + "]";
    }

    
}