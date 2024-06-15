//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio3 {
    public static void main(String[] args) {
        // Step 1: Declare and initialize an array of integers
        int[] numbers = {1, 2, 3, 4, 5};
        // Step 2: Perform array operations
        // Calculate the sum of the elements in the array
        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            suma += numbers[i];
        }
        // Find the maximum value in the array
        int maximoArray = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximoArray) {
                maximoArray = numbers[i];
            }
        }
        // Step 3: Print the results
        System.out.println("La suma de los elementos del Array es: " + suma);
        System.out.println("El maximo numero del Array es: " + maximoArray);

    }
}