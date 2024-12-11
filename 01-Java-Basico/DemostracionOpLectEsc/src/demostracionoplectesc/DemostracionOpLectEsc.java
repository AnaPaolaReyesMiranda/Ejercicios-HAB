package demostracionoplectesc;

import java.util.Scanner;


public class DemostracionOpLectEsc {

    
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        String nombre = teclado.nextLine();
        
        System.out.println("Su nombre es:" + nombre);
        int edad = teclado.nextInt();
        
        System.out.println("Su edad es:" + edad);
    }
    
}
