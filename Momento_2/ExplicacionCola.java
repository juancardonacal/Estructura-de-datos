import java.util.LinkedList;
import java.util.Queue;

public class ExplicacionCola {
    public static void main(String[] args) {

        // Crear una cola utilizando LinkedList
        Queue<Integer> objCola = new LinkedList<>();

        //Agregar elementos a la cola
        objCola.add(10);
        objCola.add(20);
        objCola.add(30);
        objCola.add(40);

        // Mostrar los elementos de la cola
        System.out.println(objCola); // Imprime la cola completa

        // mostrar la cabeza de la cola (element(), peek())
        System.out.println("Cabeza de la cola: " + objCola.element());
        System.out.println("Cabeza de la cola: " + objCola.peek());

        //Eliminar de la cabeza de la cola (poll(), remove())
        System.out.println("Elemento eliminado de la cabeza de la cola (poll()): " + objCola.poll());
        System.out.println("Elemento eliminado de la cabeza de la cola (remove()): " + objCola.remove());

        // Mostrar los elementos restantes en la cola
        System.out.println("Elementos restantes en la cola: " + objCola);

        // Mostrar el tamaño de la cola
        System.out.println("Tamaño de la cola: " + objCola.size());

    }
}