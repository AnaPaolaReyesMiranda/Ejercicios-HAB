package pooejemplo;

import java.time.LocalDate;
import logica.Persona;


public class POOEjemplo {

    
    public static void main(String[] args) {
        Persona perso = new Persona();
        Persona perso2 = new Persona(1, "Alejandra", "De Paula", 
        LocalDate.of(2024,12,11), "Hola 123");
        
        System.out.println("El nombre es: " + perso2.getNombre() + " El apellido es: " + 
                perso2.getApelido() + " La direccion es: " + perso2.getDireccion());
        
        
        perso2.setNombre("Luisina");
        
        System.out.println("----Antes-----");
        
        System.out.println("El nombre es: " + perso2.getNombre() + " El apellido es: " + 
                perso2.getApelido() + " La direccion es: " + perso2.getDireccion());
        
        
        System.out.println("----Despues-----");
        
        System.out.println("El nombre es: " + perso2.getNombre() + " El apellido es: " + 
                perso2.getApelido() + " La direccion es: " + perso2.getDireccion());
        
    }
   
    
}
