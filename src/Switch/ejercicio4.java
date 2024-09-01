package Switch;

import java.util.Scanner;

public class ejercicio4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;
            while (!exit) {
                System.out.println("\nElija el candidato de preferencia");
                System.out.println("1. Luis Urtado");
                System.out.println("2. Carlos Perez");
                System.out.println("3. Daniel Calderon");
                System.out.println("4. Exit");
                System.out.print("Ingresa una opcion: ");
                int resultado = scanner.nextInt();
                switch (resultado) {
                    case 1:
                        System.out.println("Votando por Luis Urtado..");
                        break;
                    case 2:
                        System.out.println("Votando por Carlos Perez..");
                        break;
                    case 3:
                        System.out.println("Votando por Daniel Calderon..");
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