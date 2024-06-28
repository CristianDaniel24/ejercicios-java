import java.util.Scanner;

public class basicbasic3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Step 1: Initialize the array to store a list of strings
        System.out.print("Enter the number of strings: ");
        int cadena = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] strings = new String[cadena];
        // Read the list of strings from the user
        for (int i = 0; i < cadena; i++) {
            System.out.println("Ingresa tu texto "+(i + 1)+" " );
            strings[i] = scanner.nextLine();
        }
        // Step 3: Call the method to find the longest string
        String totalCadenas = cadenas(strings);
        // Display the longest string
        System.out.println("La cadena mas grande ingresada es: "+totalCadenas);
        scanner.close();
    }

    // Step 2: Method to find the longest string in the array
    public static String cadenas(String []texto){
        String totalCadenas = texto[0];
    for (int i = 1; i < texto.length; i++) {
        if (texto[i].length() > totalCadenas.length()) {
            totalCadenas = texto[i];
        }
    }
    return totalCadenas;
    }
}