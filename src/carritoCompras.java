import java.util.Scanner;
import java.util.ArrayList;
public class carritoCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("_____ _                _         _____ _                        \n" +
                "|_   _(_)              | |       /  __ \\ |                       \n" +
                "  | |  _  ___ _ __   __| | __ _  | /  \\/ | __ _ _ __   ___ _   _ \n" +
                "  | | | |/ _ \\ '_ \\ / _` |/ _` | | |   | |/ _` | '_ \\ / __| | | |\n" +
                "  | | | |  __/ | | | (_| | (_| | | \\__/\\ | (_| | | | | (__| |_| |\n" +
                "  \\_/ |_|\\___|_| |_|\\__,_|\\__,_|  \\____/_|\\__,_|_| |_|\\___|\\__, |\n" +
                "                                                            __/ |");
        // Step 1: Initialize the cart with ArrayLists
        System.out.println("Bienvenidos a su tienda de confianza :)");
        ArrayList<String> itemNames = new ArrayList<>();
        itemNames.add("manzana");
        itemNames.add("pera");
        itemNames.add("naranja");
        itemNames.add("uvas");
        itemNames.add("bananos");
        ArrayList<Double> itemPrices = new ArrayList<>();
        itemPrices.add(2000.50);
        itemPrices.add(4000.40);
        itemPrices.add(3000.30);
        itemPrices.add(2000.30);
        itemPrices.add(6000.30);
        ArrayList<String> carrito = new ArrayList<>();
        // Step 3: Use a loop to display the menu and perform actions based on user input
        boolean exit = false;
        while (!exit) {
            int eleccion = menuDisplay(scanner);
            switch (eleccion) {
                case 1:
                    addItem(itemNames, carrito);
                    break;
                case 2:
                    verItem(carrito);
                    break;
                case 3:
                    eliminarItem(carrito);
                    break;
                case 4:
                    costo(itemPrices,carrito,itemNames);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Seleccion invalida");
            }

        }
    }

    // Method to display the menu and get the user's choice
    public static int menuDisplay(Scanner scanner) {
        System.out.println("\nMenu Carrito de Compras");
        System.out.println("1. Agregar producto");
        System.out.println("2. Ver los productos");
        System.out.println("3. Eliminar producto");
        System.out.println("4. Calcular el costo total");
        System.out.println("5. Exit");
        System.out.print("Ingresa una opcion: ");
        return scanner.nextInt();
    }

    // Method to add an item to the cart
    public static void addItem(ArrayList<String> itemNames, ArrayList<String> carrito) {
        Scanner leer = new Scanner(System.in);
        int cant = 0;
        System.out.println("Los productos de la tienda Clancy son:");
        for (int i = 0; i < itemNames.size(); i++) {
            System.out.println(itemNames.get(i));
        }
        System.out.println("¿Cuantos productos desas agregar?");
        cant = leer.nextInt();
        for (int i = 0; i < cant; i++) {
            System.out.println("Nombre del producto : ");
            String producto = leer.nextLine();
            if (i == 0) {
                producto = leer.nextLine();
            }
            if (itemNames.contains(producto)) {
                System.out.println("El producto " + producto + " fue agregado");
                carrito.add(producto);
            } else {
                System.out.println("El producto ingresado no existe en la tienda");
            }
        }
    }

    // Method to view all items in the cart
    public static void verItem(ArrayList<String> carrito) {
        if (carrito.isEmpty()) {
            System.out.println("El carrito esta vacio :(");
            return;
        }
        System.out.println("Los productos del carrito son: ");
        for (int i = 0; i < carrito.size(); i++) {
            System.out.println(carrito.get(i));
        }
    }

    // Method to remove an item from the cart
    public static void eliminarItem(ArrayList<String> carrito) {
        Scanner leer = new Scanner(System.in);
        int cant = 0;
        if (carrito.isEmpty()) {
            System.out.println("El carrito esta vacio :(");
            return;
        }
        System.out.println("¿Cuantos productos desas eliminar?");
        cant = leer.nextInt();
        for (int i = 0; i < cant; i++) {
            System.out.println("Nombre del producto a eliminar : ");
            String producto = leer.nextLine();
            if (i == 0) {
                producto = leer.nextLine();
            }
            carrito.remove(producto);
        }
        System.out.println("Los productos fueron eliminados, los productos restantes son:");
            for (int i = 0; i < carrito.size(); i++) {
                System.out.println(carrito.get(i));
            }
    }
            // Method to calculate the total cost of the cart
        public static void costo(ArrayList<Double> itemPrices, ArrayList<String> carrito, ArrayList<String> itemNames){
        Double total = 0.0;
            for (int i = 0; i < carrito.size(); i++){
                 int posicion = itemNames.indexOf(carrito.get(i));
                 total += itemPrices.get(posicion);
            }
            System.out.println("El coste de los productos es: "+total);
        }
}