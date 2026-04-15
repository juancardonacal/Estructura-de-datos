import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PuertoDataBay {
    
    // Estructuras principales a implementar
    private Contenedor[] manifiesto = new Contenedor[10];
    private Contenedor[][] patio = new Contenedor[5][5];
    private Queue<Contenedor> inspeccion = new LinkedList<>();
    private Stack<Contenedor> buque = new Stack<>();

    // Módulo 1: Registro de Manifiesto
    public void registrarManifiesto(Contenedor[] llegadas) {
        double pesoTotal = 0;
        for (int i = 0; i < llegadas.length && i < manifiesto.length; i++) {
            manifiesto[i] = llegadas[i];
            pesoTotal += llegadas[i].getPeso();
        }
        System.out.println("Resumen: Peso total de carga entrante = " + pesoTotal);
    }

    // Módulo 2: El Patio de Almacenamiento
    public void ubicarEnPatio(Contenedor c) {
        boolean ubicado = false;
        // Recorrido por filas y columnas
        for (int i = 0; i < patio.length; i++) {
            for (int j = 0; j < patio[i].length; j++) {
                if (patio[i][j] == null) {
                    patio[i][j] = c;
                    ubicado = true;
                    System.out.println("Contenedor " + c.getId() + " ubicado en [" + i + "][" + j + "]");
                    return; // Salimos apenas lo ubicamos
                }
            }
        }
        // Si recorre todo y no hay espacio
        if (!ubicado) {
            System.out.println("Alerta: Puerto Saturado");
        }
    }

    // Módulo 3: La Bahía de Inspección (Cola)
    public void enviarAInspeccion(Contenedor c) {
        // Asumiendo que 1 es "Alta Prioridad"
        if (c.getPrioridad() == 1) {
            inspeccion.add(c); 
            System.out.println("Contenedor " + c.getId() + " en fila de rayos X.");
        }
    }

    public Contenedor procesarInspeccion() {
        return inspeccion.poll(); // Extrae el que más tiempo lleva
    }

    // Módulo 4: Estiba en el Buque (Pila) + Reto de Ingeniería
    public void estibarEnBuque(Contenedor c) {
        if (buque.isEmpty()) {
            buque.push(c);
        } else {
            // Reto Bono: Solo acepta si el peso es menor o igual al del tope
            Contenedor top = buque.peek();
            if (c.getPeso() <= top.getPeso()) {
                buque.push(c);
            } else {
                System.out.println("Error de centro de gravedad. No se puede apilar " + c.getId());
            }
        }
    }

    // Módulo 4: Operación Crítica
    public void removerContenedorDanadoFondo() {
        if (buque.isEmpty()) return;

        Stack<Contenedor> pilaAuxiliar = new Stack<>();
        
        // Desapilamos todo hacia la pila auxiliar
        while (!buque.isEmpty()) {
            pilaAuxiliar.push(buque.pop());
        }
        
        // El contenedor dañado quedó en el tope de la auxiliar (era el fondo del buque)
        Contenedor dañado = pilaAuxiliar.pop();
        System.out.println("Retirando contenedor dañado del fondo: " + dañado.getId());
        
        // Re-apilamos manteniendo el orden original
        while (!pilaAuxiliar.isEmpty()) {
            buque.push(pilaAuxiliar.pop());
        }
    }
}