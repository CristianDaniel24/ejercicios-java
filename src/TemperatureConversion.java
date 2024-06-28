import java.util.Scanner;
    public class TemperatureConversion {

    // Method to convert Celsius to Fahrenheit
        public static double convertirFarenheid(double farenheid, double temperature){
        double resultadoFarenheid;
        resultadoFarenheid=(temperature * 9/5) + 32;
            System.out.println("La temperatura en Farenheid es: "+resultadoFarenheid);
            return resultadoFarenheid;
        }
        // Method to convert Fahrenheit to Celsius
        public static double convertirCelsius(double celsius, double farenheid) {
            double resultadoCelsius;
            resultadoCelsius = (farenheid - 32) * 5 / 9;;
            System.out.println("La temperatura en Celsius es: " + resultadoCelsius);
            return resultadoCelsius;
        }
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                double farenheid = 33.8;
                double celsius = 33.8;
                // Step 1: Ask user for input temperature and conversion direction
                System.out.print("Enter the temperature: ");
                double temperature = scanner.nextDouble();
                System.out.print("Convert to (1) Celsius or (2) Fahrenheit? Enter 1 or 2: ");
                int conversionChoice = scanner.nextInt();

                scanner.close();

                // Step 2: Call the appropriate method based on user input
                if (conversionChoice == 1){
                    convertirCelsius(celsius, temperature);
                }else if (conversionChoice == 2) {
                    convertirFarenheid(farenheid, temperature);
                }
                else
                    System.out.println("Ingresa una opcion correcta");
            }
    }
