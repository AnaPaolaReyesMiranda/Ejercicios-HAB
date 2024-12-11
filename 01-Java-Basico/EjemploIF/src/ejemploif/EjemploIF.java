
package ejemploif;

import java.util.Scanner;


public class EjemploIF {

    public static void main(String[] args) {
       // Si un persona es mayor de edad >18
       
        System.out.println("Ingrese su edad:");
        
        Scanner teclado = new Scanner (System.in);
        int edad = teclado.nextInt();
        
        if(edad>= 18){
            System.out.println("Felicitaciones eres mayor de edad");
          
        }
    else {
            System.out.println("Lo siento, no eres mayor de edad");
}
    }
}