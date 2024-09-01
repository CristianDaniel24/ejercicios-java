package Switch;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit){
            System.out.println("Ingresa la votacion de tu artista favorito");
            System.out.println("1. Twenty One Pilots");
            System.out.println("2. Calvin Harris");
            System.out.println("3. Avicii");
            System.out.println("4. Exit");
            int resultado = scanner.nextInt();
            switch (resultado){
                case 1:
                    System.out.println("Votaste por Twenty One Pilots");
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Votaste por Calvin Harris");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Votaste por avicii");
                    System.out.println(" ");
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Seleccionaste una opcion invalida");
                    System.out.println(" ");
            }
        }
    }
}