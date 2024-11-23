public class Jugador {
    private String nombre;
    private int puntuacion;

    //Constructor
    public Jugador(String nombre, int puntuacion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    //Metodo estatico que intenta usar `this` (producirá un error)
    public void mostrarDetallesEstatico() {
        //Error: No se puede usar `this` en un contexto estatico
        System.out.println("Nombre: " + nombre); 
        System.out.println("Puntuación: " + puntuacion); 
    }

    public static void main(String[] args) {
        // Crear un objeto Jugador
        Jugador jugador = new Jugador("Duppy", 50);

        // Llamar al método estático
        jugador.mostrarDetallesEstatico();
    }
}
