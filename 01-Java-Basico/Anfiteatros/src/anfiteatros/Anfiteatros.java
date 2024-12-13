package anfiteatros;

import java.util.Scanner;

public class Anfiteatros {

    public static void main(String[] args) {
        
       //declaracion de variables
       char asientos[][] = new char [5][5];
       boolean bandera = false;
       Scanner teclado = new Scanner(System.in);
       int fila=0,asiento=0;
       String respuesta;
       String vermapa;
       
       //cargamos la matriz
       for(int f=0;f<5;f++){
           for(int c=0;c<5;c++){
               asientos[f][c]='L';
           }
       }
       
       
        //bienvenida
        System.out.println("----Bienvenido al Anfiteatro----");
        
        //reserva asientos
        while(bandera!=true){
            System.out.println("¿Desea ver asientos disponibles? S: si, cualquier otra letra No");
            vermapa = teclado.next();
            
            if(vermapa.equalsIgnoreCase("S")){
                dibujarmapa(asientos);
            
            }           
                                   
           //reserva
           boolean estaok=false;
           while(estaok!=true){
            System.out.println("Ingrese Fila y Asiento: ");
            System.out.print("Fila(entre 0 y 4)");
            fila = teclado.nextInt();
            
            
            System.out.print("Fila(entre 0 y 4)");
            asiento = teclado.nextInt();
            
            
            if(fila<=4 && fila>=0){
                if(asiento<=4 && asiento>=0){
                    estaok=true;
                }
                else{
                System.out.println("El numero de asiento no es valido");
                }
           } 
            else{
                System.out.println("El numero de fila no es valido");
            }
            }
           
           
            if(asientos[fila][asiento]==('L')){
                asientos[fila][asiento] = 'X';
                System.out.println("El asiento fue reservado correctamente");                                
            }
            else{
                System.out.println("El asiento esta ocupado. Por favor elija otro");
            }
            
            System.out.println("¿Desea finalizar la reserva? S: si o cualquier tecla No");
            respuesta = teclado.next();
            
            if(respuesta.equalsIgnoreCase("S")){
                bandera=true;
            }                                
        }
  }
    
   static void dibujarmapa(char asientos[][]){
        for(int f=0;f<5;f++){
            System.out.print(f + "");
           for(int c=0;c<5;c++){
               
               System.out.print("[" + asientos[f][c] + "]");
           }
           
            System.out.println("");
           }
        
        
    }
    
}