public class Jugador {
    private String nombre;
    private int puntuacion;

    //Constructor
    public Jugador(String nombre, int puntuacion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    //Metodo funcional
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre); 
        System.out.println("Puntuación: " + puntuacion); 
    }

    public static void main(String[] args) {
        // Crear un objeto Jugador
        Jugador jugador = new Jugador("Duppy", 50);

        // Llamar al método mostrar detalles referenciando a clase jguador que es el objeto recién creado
        jugador.mostrarDetalles();
    }
}
