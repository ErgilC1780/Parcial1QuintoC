import java.util.PriorityQueue;
import java.util.Comparator;


class Solicitud {
    int id;
    String descripcion;
    int prioridad;

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


class SolicitudComparator implements Comparator<Solicitud> {
    @Override
    public int compare(Solicitud s1, Solicitud s2) {
        return s1.prioridad - s2.prioridad;
    }
}

public class GestorSolicitudes {
    public static void main(String[] args) {

        PriorityQueue<Solicitud> colaSolicitudes = new PriorityQueue<>(new SolicitudComparator());


        colaSolicitudes.add(new Solicitud(1, "Arreglar el bug de los arboles", 2));
        colaSolicitudes.add(new Solicitud(2, "Crear nuevas texturas", 3));
        colaSolicitudes.add(new Solicitud(3, "mejorar la optimizacion", 1));


        while (!colaSolicitudes.isEmpty()) {
            Solicitud solicitud = colaSolicitudes.poll();
            System.out.println("Procesando: " + solicitud);

        }
    }
}