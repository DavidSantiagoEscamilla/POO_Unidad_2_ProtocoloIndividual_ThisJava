public class Producto {
    private String nombre;
    private double precio;

    //Constructor que recibe parámetros y utiliza this para diferenciarlos de los atributos
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //Método para mostrar los detalles del producto
    public void mostrarProducto() {
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio del producto: $" + precio);
    }


    //Metodo para probar la clase
    public static void main(String[] args) {
        Producto producto = new Producto("Manzana", 1.5);

        System.out.println("Detalles del producto:");
        producto.mostrarProducto();
    }
}
