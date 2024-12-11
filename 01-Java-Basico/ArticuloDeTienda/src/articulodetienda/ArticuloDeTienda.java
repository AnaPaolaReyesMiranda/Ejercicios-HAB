
package articulodetienda;

import java.util.Scanner;


public class ArticuloDeTienda {

    
    public static void main(String[] args) {
        /* El precio es <50 y <100 es Economico,
         El precio es =50 y =100 es Accesible,
         El precio es =101 y =200 es Estandar,
         El precio es >200 es Premium. */
        
        System.out.println("Ingrese el precio del articulo:");
        Scanner teclado = new Scanner (System.in);
        double articulo = teclado.nextInt();
        
    if(articulo<50){
        System.out.println("El producto es Economico" );
          
        }
    else {
            if(articulo>=50 && articulo<=100){
            System.out.println("El producto es Accesible");
            }
            else {        
    }               if(articulo>=101 && articulo<=200){
                System.out.println("El producto es Estandar");
    }   
                else {
                    if(articulo>=200){
                    System.out.println("El producto es Premium");
                }
            }
        }
    }
}
