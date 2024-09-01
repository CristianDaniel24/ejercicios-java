package Switch;

import java.util.Scanner;

public class ejercicio5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;
            while (!exit) {
                System.out.println("\nElija su metodo de pago");
                System.out.println("1. Paypal");
                System.out.println("2. Tarjeta credito/debito");
                System.out.println("3. Efectivo");
                System.out.println("4. Exit");
                System.out.print("Ingresa una opcion: ");
                int resultado = scanner.nextInt();
                switch (resultado) {
                    case 1:
                        System.out.println("Pagando con Paypal..");
                        break;
                    case 2:
                        System.out.println("Pagando con Tarjeta..");
                        break;
                    case 3:
                        System.out.println("Pago con Efectivo");
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