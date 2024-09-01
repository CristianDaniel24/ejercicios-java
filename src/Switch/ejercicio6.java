package Switch;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Ingresa una opcion a continuacion");
            System.out.println("1. Agregar cancion como favorita");
            System.out.println("2. Eliminar cancion de favoritos");
            System.out.println("3. Ver lista de favoritos");
            System.out.println("4. Exit");
            System.out.println("Ingresa una opcion:");
            int resultado = scanner.nextInt();
            switch (resultado){
                case 1:
                    System.out.println("Agregando cancion a favoritos");
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Eliminando cancion de favoritos");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Cargando la lista de canciones favoritas");
                    System.out.println(" ");
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Seleccion invalida");
                    System.out.println(" ");
            }
        }
    }
}