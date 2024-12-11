package matrices;

import java.util.Scanner;

public class Matrices {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        double[][] tabla = new double[4][4];
        
        Scanner scanner = new Scanner(System.in);
        
        for (int i=0; i < 4; i++){
            System.out.println("Ingrese las notas del alumno:");
            double sumanotas = 0;
            for (int j=0; j<3; j++){
                System.out.println("Nota " + (j + 1) + "i");
                tabla[i][j] = scanner.nextDouble();
                sumanotas += tabla[i][j];
             }
            tabla[i][3] = sumanotas / 3;
        }
        
        System.out.println("Notas y promedios de los alumnos:");
        for (int i=0; i<4; i++){
            System.out.println("Alumno " + (i + 1) + ":" );
            for (int j=0; j<3; j++){
                System.out.print("Nota " + (j + 1) + ": " + tabla[i][j] +  " ");
            }
         System.out.println("Promedio: " + tabla[i][3]);   
        }
    }
}
        
