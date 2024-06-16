import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class condicionales2 {
    public static void main(String[] args) {
            // Step 1: Declare and initialize the variable for the day number
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number (1-7) to get the corresponding day of the week: ");
            int dayNumber = scanner.nextInt();
            String dayOfWeek = "";
            // Step 2: Use the switch statement to determine the day of the week
            switch (dayNumber) {
                case 1:
                    dayOfWeek = "Lunes";
                    break;
                case 2:
                    dayOfWeek = "Martes";
                    break;
                case 3:
                    dayOfWeek = " Miercoles";
                    break;
                case 4:
                    dayOfWeek = "Jueves";
                    break;
                case 5:
                    dayOfWeek = "Viernes";
                    break;
                case 6:
                    dayOfWeek = "Sabado";
                    break;
                case 7:
                    dayOfWeek = "Domingo";
                    break;
                default:
                    System.out.println("El numero ingresado no es valido");
                    break;
            }
            // Step 3: Print the results
            System.out.println("El dia de la semana seleccionado es: "+ dayOfWeek);
        }
    }