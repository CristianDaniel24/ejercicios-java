package Switch;

import java.util.Scanner;

public class ejercicio2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;

                System.out.println("\nIngresa una opcion");
                System.out.println("1. Iniciar las luces del concierto");
                System.out.println("2. Exit");
                System.out.print("Ingresa una opcion: ");
                int resultado = scanner.nextInt();
            while (!exit) {
                switch (resultado) {
                    case 1:
                        System.out.println("Luz encendida");
                        System.out.println("Luz apagada");
                        break;
                    case 2:
                        exit = true;
                        break;
                    default:
                        System.out.println("Seleccion invalida");
                }
            }
        }
    }