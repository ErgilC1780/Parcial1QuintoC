import java.util.PriorityQueue;
import java.util.Comparator;

// Clase para representar una solicitud
class Solicitud {
    int id;
    String descripcion;
    int prioridad; // La prioridad más baja significa más urgente

    public Solicitud(int id, String descripcion, int prioridad) {
        this.id = id;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", prioridad=" + prioridad +
                '}';
    }
}

// Comparador para determinar la prioridad de las solicitudes
class SolicitudComparator implements Comparator<Solicitud> {
    @Override
    public int compare(Solicitud s1, Solicitud s2) {
        return s1.prioridad - s2.prioridad;
    }
}

public class GestorSolicitudes {
    public static void main(String[] args) {
        // Crear una cola de prioridad con el comparador personalizado
        PriorityQueue<Solicitud> colaSolicitudes = new PriorityQueue<>(new SolicitudComparator());

        // Añadir solicitudes a la cola
        colaSolicitudes.add(new Solicitud(1, "Arreglar el bug de los arboles", 2));
        colaSolicitudes.add(new Solicitud(2, "Crear nuevas texturas", 3));
        colaSolicitudes.add(new Solicitud(3, "mejorar la optimizacion", 1));

        // Procesar las solicitudes en orden de prioridad
        while (!colaSolicitudes.isEmpty()) {
            Solicitud solicitud = colaSolicitudes.poll(); // Obtiene y remueve la solicitud con mayor prioridad
            System.out.println("Procesando: " + solicitud);
            // Aquí se podría añadir la lógica para asignar la solicitud a un técnico
        }
    }
}