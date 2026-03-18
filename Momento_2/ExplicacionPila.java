import java.util.Stack;

public class ExplicacionPila {
    public static void main(String[] args) {
        Stack<String> objPila = new Stack<>();
        
        // Agregar elementos a la pila
        objPila.push("Sara");
        objPila.push("Hugo");
        objPila.push("Iris");
        objPila.push("Tomas");
        
        // Mostrar los elementos de la pila
        System.out.println(objPila); // Imprime la pila completa
        
        // Mostrar sin remover el tope de la pila
        System.out.println("Elemento en la cima: " + objPila.peek());
        
        // Validar si la pila está vacía
        System.out.println("¿La pila está vacía? " + objPila.isEmpty());

        // Remover elementos de la pila
        System.out.println("Elemento removido: " + objPila.pop()); // Remueve el elemento en la cima y lo muestra

        // Mostrar los elementos restantes en la pila
        System.out.println(objPila); // Imprime la pila después de remover un elemento

        // posiciones de los elementos con respecto al tope de la pila
        System.out.println("Posición de 'Sara' desde el tope: " + objPila.search("Sara"));
        System.out.println("Posición de 'Hugo' desde el tope: " + objPila.search("Hugo"));
        System.out.println("Posición de 'Iris' desde el tope: " + objPila.search("Iris"));
        System.out.println("Posición de 'Tomas' desde el tope: " + objPila.search("Tomas"));
    }

}