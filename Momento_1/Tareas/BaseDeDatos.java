public class BaseDeDatos {

    public static void main(String[] args) {

        Curso[] cursos = new Curso[5];



        // Creacion de los objetos de tipo curso y almacenados en cada posicion del arreglo.
        cursos[0] = new Curso(1, "Programacion", "Juan Perez", 30);
        cursos[1] = new Curso(2, "Matematicas", "Maria Gomez", 25);
        cursos[2] = new Curso(3, "Fisica", "Carlos Rodriguez", 20);
        cursos[3] = new Curso(4, "Quimica", "Ana Martinez", 15);
        cursos[4] = new Curso(5, "Biologia", "Luis Fernandez", 10);

        // Obtener la sumatoria de la cantidad de estudiantes de los cursos del array.
        int sumaEstudiantes = 0;
        for (int i = 0; i < cursos.length; i++) {
            sumaEstudiantes += cursos[i].getCantidadEstudiantes();
        }
        System.out.println("La sumatoria de la cantidad de estudiantes de los cursos es: " + sumaEstudiantes);

    }
    
}
