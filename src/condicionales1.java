import javax.swing.*;
import java.util.Scanner;
public class condicionales1 {
    public static void main(String[] args) {
            // Step 1: Declare and initialize the variable for the student's score
            int score;
            Scanner Scanner = new Scanner(System.in);
            JOptionPane.showMessageDialog(null,"Si quiere saber el puntaje del estudiante ingrese a continuacion");
            score = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificaion del estudiante(0-100)"));
            //initialize
            char grade = 'o';
            String mensaje = "";
            // Step 2: Use conditionals to determine the grade
            if (score >= 90){
                grade = 'A';
                mensaje = "Fecilidades tu calificaion es";
            } else if (score >= 80 && score <= 90){
                grade = 'B';
                mensaje = "Fecilidades tu calificaion es";
            } else if (score >= 70 && score <= 79){
                grade = 'C';
                mensaje = "Fecilidades tu calificaion es";
            } else if (score >= 60 && score <= 69){
                grade = 'D';
                mensaje = "Fecilidades tu calificaion es";
            } else if (score <= 60){
                grade = 'F';
                mensaje = "Fallaste mas suerte para la proxima";
            }else
                JOptionPane.showMessageDialog(null,"Ingresa una puntuacion incorrecta");
        // Step 3: Print the results
        JOptionPane.showMessageDialog(null,"La puntuacion ingresada es: "+score);
        JOptionPane.showMessageDialog(null,"La Calificaicon es : "+grade);
        JOptionPane.showMessageDialog(null,mensaje);
        }
     }