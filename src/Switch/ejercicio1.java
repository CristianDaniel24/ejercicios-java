package Switch;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("\nIngrese una opcion");
            System.out.println("1. Comprar producto");
            System.out.println("2. Ver los productos disponibles");
            System.out.println("3. Detalles de la tienda");
            System.out.println("4. Exit");
            System.out.print("Ingresa una opcion: ");
            int resultado = scanner.nextInt();
            switch (resultado) {
                case 1:
                    System.out.println("Comprando producto..");
                    break;
                case 2:
                    System.out.println("Arroz"+"\nPapa"+"\nLentejas");
                    break;
                case 3:
                    System.out.println("Nombre: Clancy"+"\n3 años de servicio");
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Seleccion invalida");
            }
        }
    }
}
