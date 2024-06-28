
import java.util.Arrays;
import java.util.Scanner;
    public class MetodosyFunciones2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Step 1: Prompt the user to input the number of students
            System.out.print("Enter the number of students: ");
            int numStudents = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Arrays to store student names and grades
            String[] nombreEstudiantes = new String[numStudents];
            int[] calificaionEstudiantes = new int[numStudents];
            // Input student names and grades
            for (int i = 0; i < numStudents; i++) {
                System.out.println("Ingrese el nombre de los estudiantes: ");
                nombreEstudiantes[i] = scanner.nextLine();
                System.out.println("Ingrese la calificaion de los estudiantes: ");
                calificaionEstudiantes[i] = scanner.nextInt();
                scanner.nextLine();
            }
            // Step 2: Call methods to calculate average, highest, and lowest grades
            double media = calificacionMedia(calificaionEstudiantes);
            int mayor = calificacionAlta(calificaionEstudiantes);
            int baja = calificacionBaja(calificaionEstudiantes);
            char letra = calificacionLetra(calificaionEstudiantes);
            String nombres = Arrays.toString(nombreDeLosEstudiantes(nombreEstudiantes,numStudents));
            // Print results
            System.out.println("Los estudiantes son: ");
            for (int i = 0; i < numStudents; i++) {
                System.out.println("Estudiante " + (i + 1) + ": " + nombreEstudiantes[i]);
            }
            System.out.println("La media de los estudiantes es; " + media);
            System.out.println("La calificaion mas alta de los estudiantes es; " + mayor);
            System.out.println("La calificaion mas baja de los estudiantes es; " + baja);
            System.out.println("Los estudiantes: " + nombres + " tuvieron una calificacion media de: " + media + " y su calificacion correspondiente a letra es: " + letra);
            scanner.close();
        }

        // Method to calculate the average grade
        public static double calificacionMedia(int[] calificacionEstudiantes) {
            int suma = 0;
            for (int i = 0; i < calificacionEstudiantes.length; i++) {
                suma += calificacionEstudiantes[i];
            }
            return (double) suma / calificacionEstudiantes.length;
        }

        // Method to find the highest grade
        public static int calificacionAlta(int[] calificacionEstudiantes) {
            int notaMayor = 0;
            for (int i = 0; i < calificacionEstudiantes.length; i++) {
                if (calificacionEstudiantes[i] > notaMayor) {
                    notaMayor = calificacionEstudiantes[i];
                }
            }
            return notaMayor;
        }

        // Method to find the lowest grade
        public static int calificacionBaja(int[] calificacionEstudiantes) {
            int notaMenor = calificacionEstudiantes[0];
            for (int i = 1; i < calificacionEstudiantes.length; i++) {
                if (calificacionEstudiantes[i] < notaMenor) {
                    notaMenor = calificacionEstudiantes[i];
                }
            }
            return notaMenor;
        }

        // Method to convert a numeric grade to a letter grade using switch
        public static char calificacionLetra(int[] calificacion) {
            for (int i = 0; i < calificacion.length; i++) {
                switch (calificacion.length / 10) {
                    case 10:
                    case 9:
                        return 'A';
                    case 8:
                        return 'B';
                    case 7:
                        return 'C';
                    case 6:
                        return 'D';
                    default:
                        return 'F';
                }
            }
            return (char) calificacion.length;
        }
        public static String[] nombreDeLosEstudiantes(String[] nombreEstudiantes, int numStudents) {
            for (int i = 0; i < numStudents ; i++) {
                System.out.print(nombreEstudiantes[i] + " ");
            }
            return nombreEstudiantes;
        }
    }
