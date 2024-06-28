import java.util.Scanner;

public class basicbasic2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Initialize the array to store a list of integers
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        // Read the list of integers from the user
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el numero entero");
            numbers[i] = scanner.nextInt();
        }
        // Step 3: Call the method to calculate the sum of even numbers
        int pares = numerospares(numbers);
        // Display the sum of even numbers
        System.out.println("La suma de los numeros pares es: "+pares);
    }

    // Step 2: Method to calculate the sum of all even numbers
    public static int numerospares(int[] numbers) {
        int suma = 0;
        /*
        for (int n : numbers) {
            if (n % 2 == 0) {
                suma += n;
            }
        }
         */
        for (int n = 0; n < numbers.length; n++){
            if (numbers[n] % 2 == 0){
                suma += numbers[n];
            }
        }
        return suma;
    }
}