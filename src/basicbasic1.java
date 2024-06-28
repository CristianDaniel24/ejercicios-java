import java.util.Scanner;
public class basicbasic1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Initialize the array to store temperatures for a week (7 days)
        String[] day = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        int[] temp = new int[day.length];

        for (int i = 0; i < day.length; i++) {
            System.out.print("Ingrese la temperatura de los 7 dias de la semana: ");
            temp[i] = scanner.nextInt();
        }
        System.out.println(" ");

        // Read temperatures for each day of the week
        System.out.println("Las temperaturas ingresadas son: ");
        for (int i = 0; i < 7; i++) {
            System.out.println("La temperatura del " + day[i] + " es: " + temp[i]);
        }
        // Step 3: Call the method to calculate the average temperature
        int promedio = promedioTemp(temp);
        System.out.println("El promedio de las temperaturas es: "+promedio);
    }

    // Step 2: Method to calculate the average temperature
    public static int promedioTemp(int []temp){
        /*
        int suma = 0;
        for (int temperatura : temp) {
            suma += temperatura;
        }
         */
        int suma = 0;
        for (int i = 0; i < temp.length; i++){
             //suma = temp[i] + suma;
             suma += temp[i];
        }
        return suma / temp.length;
    }
    }