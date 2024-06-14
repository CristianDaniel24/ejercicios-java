public class Ejercicio1 {
    public static void main(String[] args) {
        // Step 1: Declare and initialize variables for item prices and quantities
        double precioManzana = 10.11;
        double precioMandarina = 8.8;
        double precioPapa = 5.10;
        int cantidadManzanas = 10;
        int cantidadMandarinas = 8;
        int cantidadPapa = 5;
        // Step 2: Calculate total cost for each item
        double totalManzanas = cantidadManzanas * precioManzana;
        double totalMandarinas = cantidadMandarinas * precioMandarina;
        double totalPapa = cantidadPapa * precioPapa;
        // Calculate overall total cost
        double total = totalManzanas + totalMandarinas + totalPapa;
        // Apply a discount (e.g., 10% off)
        double descuento = total * 0.10;
        double totalDescuento = total - descuento;
        // Step 3: Convert the discounted total cost to an integer (rounded down)
        int totalRedondeado = (int) totalDescuento;
        // Step 4: Print the results
        System.out.println("El costo total sin descuento es: " +total);
        System.out.println("El costo total con descuento es: " +totalDescuento);
        System.out.println("El costo total redondeado es: " +totalRedondeado);
        //sout
        }
    }