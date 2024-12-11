
package elseanidados;

import java.util.Scanner;


public class ElseAnidados {

    
    public static void main(String[] args) {
        // Si la nota es menor a 60 es Insuficiente
        
        System.out.println("Ingrese la nota del alumno:");
        Scanner teclado = new Scanner (System.in);
        double calificacion = teclado.nextInt();
        
    if(calificacion<60){
        System.out.println("El rendimiento del alumno es Insuficiente");
          
        }
    else {
            if(calificacion>=60 && calificacion<=80){
            System.out.println("El rendimiento del alumno es Bueno");
            }
            else {        
}           if(calificacion>=81 && calificacion<=90){
            System.out.println("El rendimiento del alumno es Insuficiente");
}
else {
            if(calificacion>=90){
           System.out.println("El rendimiento del alumno es Excelente");
            }
        }
    }
}
}
    

