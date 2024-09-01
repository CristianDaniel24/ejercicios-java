package Switch;

import java.util.Scanner;

public class ejercicio3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;
            while (!exit) {
                System.out.println("\nElija su Mascota");
                System.out.println("1. Perro");
                System.out.println("2. Gato");
                System.out.println("3. Loro");
                System.out.println("4. Exit");
                System.out.print("Ingresa una opcion: ");
                int resultado = scanner.nextInt();
                switch (resultado) {
                    case 1:
                        System.out.println("Entregando Perro..");
                        break;
                    case 2:
                        System.out.println("Entrregando Gato...");
                        break;
                    case 3:
                        System.out.println("Entregando Loro...");
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