
package frutapoo;

import java.util.Scanner;
import logica.Fruta;

public class FrutaPOO {
    
    public static void main(String[] args) {
                
       
        System.out.println("Bienvenido al sistema de fruterias");
        
        Fruta frut = new Fruta();
        Scanner teclado = new Scanner(System.in);
        
        //cargamos los datos
        System.out.println("Ingrese los datos de la fruta que desea crear");
        
        System.out.println("Ingrese el nombre de la fruta: ");        
        frut.setNombre(teclado.nextLine());
        
        System.out.println("Ingrese el color de la fruta: ");        
        frut.setColor(teclado.nextLine());
        
        System.out.println("Ingrese el tipo de cascara de la fruta: ");        
        frut.setTipoCascara(teclado.nextLine());
               
        System.out.println("Ingrese las calorias de la fruta: ");     
        teclado = new Scanner(System.in);
        frut.setCalorias(teclado.nextDouble());
        
        System.out.println("¿La fruta es comestible? Ingrese y si es asi, o n si no es comestible");
        teclado = new Scanner(System.in);
        String opcion = teclado.next();
        
        if (opcion.equals("y")){
            frut.setEsComestible(true);           
        }
        else {
            frut.setEsComestible(false);
        }
        
        
        //mostramos los datos
        
        if (frut.isEsComestible()== true){
            opcion = "si";
        }
        else {
            opcion = "No";
        }
        
        
        
        System.out.println("La fruta cargada es: " + "Nombre: " 
                + frut.getNombre() + "Color: " + frut.getColor() + 
                "Cascara: " + frut.getTipoCascara() + "Calorias: " + 
                frut.getCalorias() + "¿Es comestible?" + frut.isEsComestible());
        
        frut.setCalorias(25);
        System.out.println(frut.toString());
        }
        
    }
   

