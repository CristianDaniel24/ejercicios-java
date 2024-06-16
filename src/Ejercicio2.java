//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio2{
    public static void main(String[] args) {
        // Step 1: Declare and initialize strings
        String sentence = "Hello, welcome!";
        String cadena1 = "Joaquin"; //initialize
        // Step 2: Perform string operations
        // Concatenate the two strings
        String cadenaFinal = sentence + cadena1;
        // Calculate the length of the concatenated string
        int longitud = cadenaFinal.length();
        // Extract a substring (e.g., "welcome to the world")
        String subcadena = cadenaFinal.substring(7,14);
        // Convert the concatenated string to upper case
        String cadenaMayuscula = cadenaFinal.toUpperCase();
        // Convert the concatenated string to lower case
        String cadenaMinuscula = cadenaFinal.toLowerCase();
        // Step 3: Print the results
        System.out.println("El texto extraido es: "+subcadena);
        System.out.println("Los total de textos es: "+cadenaFinal);
        System.out.println("La cadena en Mayusculas es: " +cadenaMayuscula);
        System.out.println("La cadena en Minusculas es: " +cadenaMinuscula);
    }
}