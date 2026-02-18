public class Curso {

    private int id;
    private String curso;
    private String profesor;
    private int cantidadEstudiantes;

    public Curso(int id, String curso, String profesor, int cantidadEstudiantes) {
        this.id = id;
        this.curso = curso;
        this.profesor = profesor;
        this.cantidadEstudiantes = cantidadEstudiantes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }

    public void setCantidadEstudiantes(int cantidadEstudiantes) {
        this.cantidadEstudiantes = cantidadEstudiantes;
    }

    @Override
    public String toString() {
        return "Curso [id=" + id + ", curso=" + curso + ", profesor=" + profesor + ", cantidadEstudiantes="
                + cantidadEstudiantes + "]";
    }

    
    
}
