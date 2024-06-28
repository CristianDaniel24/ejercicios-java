import java.util.Scanner;

public class basicbasic4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Step 1: Read the person's age and citizenship status
        System.out.print("Are you a citizen? (true/false): ");
        boolean ciudadano = scanner.nextBoolean();
        System.out.println("Ingresa tu edad:");
        int edad = scanner.nextInt();

        // Step 3: Call the method to check eligibility
        boolean verificacion = revision(ciudadano,edad);

        // Display the person's eligibility
        if (verificacion){
            System.out.println("Felicidades eres elegible para hacer la votacion");
        } else {
            System.out.println("Lamentablemente no eres elegible");
        }
        scanner.close();
    }
    // Step 2: Method to check if the person is eligible to vote
    public static boolean revision(boolean ciudadano,int edad){
     return (edad >= 18) && ciudadano;
    }
}