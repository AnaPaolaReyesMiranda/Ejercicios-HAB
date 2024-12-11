package numerospositivosnegativos;

import java.util.Scanner;


public class NumerosPositivosNegativos {

  
    public static void main(String[] args) {
        /* Crea un programa que permita al usuario ingresar 
        numero positivos y vaya acumulando la suma de estos.
        Debe detenerse cuando se ingrese un numero negativo, y 
        en ese momento debe mostrar la suma total de los numeros positivos*/
           
        
             
        Scanner teclado = new Scanner (System.in);
        int num = 0;
        int total = 0;
        
        System.out.println(" Ingresa los numeros a sumar: ");
        
        while (num >=0){
            System.out.println("Numero:");
            num = teclado.nextInt();
            
            if(num >= 0){
               total  += num;
            }
               else {
                System.out.println("Total:" + total);
                        
            }
        }
        
        }
        
        
    }
    

