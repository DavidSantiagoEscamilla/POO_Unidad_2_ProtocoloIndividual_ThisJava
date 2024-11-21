public class Estudiante {
    
    private String nombre;
    private int edad;

    //Constructor por defecto
    public Estudiante() {
        
        this("Nombre genérico", 18);
    }

    //Constructor con dos parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Metodo para imprimir los detalles del estudiante
    public void mostrarDetalles() {
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Edad del estudiante: " + edad);
    }

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("David", 18);

        System.out.println("Detalles del estudiante");
        estudiante1.mostrarDetalles();

        Estudiante estudiante2 = new Estudiante();

        System.out.println("Constructor por defecto");
        estudiante2.mostrarDetalles();
    }
}
