public class Controlador {
    Producto[] inventario;
    int totalVentas;

    public Controlador() {
        inventario = new Producto[10]; // Crear espacio para 10 productos en el inventario
        totalVentas = 0;
    }

    public void agregarProducto(Producto producto, int indice) {
        inventario[indice] = producto;
    }

    public void mostrarProductos(Vista vista) {
        vista.mostrarProductos(inventario);
    }

    public void venderProducto(Vista vista, int indice, int cantidad) {
        if (indice >= 0 && indice < inventario.length) {
            Producto producto = inventario[indice];
            if (producto.cantidadDisponible > 0 && producto.cantidadDisponible >= cantidad) {
                producto.cantidadDisponible -= cantidad;
                totalVentas += producto.precio * cantidad;
                vista.mostrarMensaje("Venta exitosa. Total: Q" + (producto.precio * cantidad));
            } else {
                vista.mostrarMensaje("No hay suficiente stock para vender este producto.");
            }
        } else {
            vista.mostrarMensaje("Producto no encontrado.");
        }
    }

    public void generarReporte(Vista vista) {
        vista.mostrarMensaje("Total de ventas: Q" + totalVentas);
    }
}