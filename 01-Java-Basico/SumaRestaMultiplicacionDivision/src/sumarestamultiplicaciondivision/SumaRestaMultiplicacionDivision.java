
package sumarestamultiplicaciondivision;

import java.util.Scanner;


public class SumaRestaMultiplicacionDivision {

   
    public static void main(String[] args) {
        
        System.out.println("Ingrese el primer numero:");
        Scanner a = new Scanner(System.in);
        
        double num1 = a.nextDouble();
        
        System.out.println("Ingrese el segundo numero:");
        Scanner b = new Scanner(System.in);
        
         double num2 = a.nextDouble();
         
         double suma = num1 + num2;
         double resta = num1 - num2;
         double multiplicacion = num1 + num2;
         double division = num1 / num2;
         
         System.out.println("La suma es: " + suma);
         System.out.println("La resta es: " + resta);
         System.out.println("La multiplicacion es: " + multiplicacion);
         System.out.println("La division es: " + division);
       
    }
    
}
