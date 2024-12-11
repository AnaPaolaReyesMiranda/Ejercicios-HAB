
package excedentedepeso;

import java.util.Scanner;


public class ExcedenteDePeso {

  
    public static void main(String[] args) {
        // Si una persona pesa > 100 no puede subir al juego, si pesa < 100 si puede subir
       
        System.out.println("Ingrese su peso en kg:");
        
        Scanner teclado = new Scanner (System.in);
        double peso = teclado.nextInt();
        
        if(peso<= 100){
            System.out.println("¡Felicidades! puedes subir al juego");
          
        }
    else {
            double resta = peso - 100;
            System.out.println("¡Lo siento!, No puedes subir al juego porque excedes el peso por: "+ resta + "kg");          
}
        
        
        
    }
    
}
