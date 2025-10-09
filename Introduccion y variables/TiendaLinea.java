public class TiendaLinea {
    public static void main(String[] args) {
        // Detalle de producto
        System.out.println();
        System.out.println("*** TIENDA EN LINEA ***");

        String nombreProducto = "Laptop HP";
        Double precioProducto = 15000.25;
        int stockDisponible = 0;
        boolean disponibleVenta;

        // Imprimir el detalle del producto
        System.out.println("Nombre del producto = " + nombreProducto);
        System.out.println("Precio del producto = " + precioProducto);
        System.out.println("Cantidad disponible = " + stockDisponible);

        if(stockDisponible <= 0){
            disponibleVenta = false;
        } else {
            disponibleVenta = true;
        }

        if(disponibleVenta == true){
            System.out.println("Esta disponible para la venta");
        } else{
            System.out.println("No esta disponible para la venta");
        }
        System.out.println();
    }
}
