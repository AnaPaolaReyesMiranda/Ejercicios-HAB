package vectoresmatrices;

import java.util.Scanner;


public class VectoresMatrices {

    
    public static void main(String[] args) {
        // Vectores o arreglos unidimensionales
        
        int[] vector = new int[15];
        int contador7 = 0;
        
        Scanner scanner = new Scanner(System.in);
        
            for (int i=0; i<15; i++){
                System.out.println("Ingrese el numero" + (i + 1) + ":");
                vector[i] = scanner.nextInt();
            }
               for (int i=0; i<15; i++){
                    if (vector[i] == 7){
                        contador7++;
                    }
                }
                System.out.println("El numero 7 se cargo " + contador7 + " veces en el vector");
                
            } 
        
    }
    

