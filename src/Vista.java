import java.util.Scanner;

public class Vista {
    Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("1. Agregar producto");
        System.out.println("2. Mostrar productos disponibles");
        System.out.println("3. Vender producto");
        System.out.println("4. Generar reporte de ventas");
        System.out.println("5. Salir");
        System.out.print("Ingrese una opción: ");
        return scanner.nextInt();
    }

    public Producto ingresarProducto() {
        scanner.nextLine();
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese la cantidad disponible: ");
        int cantidad = scanner.nextInt();
        return new Producto(nombre, precio, cantidad);
    }

    public void mostrarProductos(Producto[] productos) {
        System.out.println("Productos disponibles:");
        for (Producto producto : productos) {
            System.out.println(producto.nombre + " - Precio: $" + producto.precio + " - Cantidad: " + producto.cantidadDisponible);
        }
    }

    public int seleccionarProducto() {
        System.out.print("Ingrese el índice del producto a vender: ");
        return scanner.nextInt();
    }

    public int ingresarCantidad() {
        System.out.print("Ingrese la cantidad a vender: ");
        return scanner.nextInt();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
