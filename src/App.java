    /**
     * @author María José Girón Isidro - 23559
     * Primer Ciclo - Segundo Semestre
     * NOTA: algunas partes del programa fueron sacadas por chat GPT como referencia
     * Tuve que cambiar los nombres de las variables porque con las del análisi me perdí
     */

public class App {
    public static void main(String[] args) throws Exception {
        Vista vista = new Vista();
        Controlador controlador = new Controlador();

        while (true) {
            int opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1:
                    Producto nuevoProducto = vista.ingresarProducto();
                    controlador.agregarProducto(nuevoProducto, 0); // Asignar un índice adecuado
                    break;
                case 2:
                    controlador.mostrarProductos(vista);
                    break;
                case 3:
                    int indice = vista.seleccionarProducto();
                    int cantidad = vista.ingresarCantidad();
                    controlador.venderProducto(vista, indice, cantidad);
                    break;
                case 4:
                    controlador.generarReporte(vista);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    vista.mostrarMensaje("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        }
    }
    }
