
package ejemploherencia;

import logica.Animal;
import logica.Gato;
import logica.Perro;


public class Ejemploherencia {

    
    public static void main(String[] args) {
       
       /* Perro perro = new Perro(5, "Ibra", 12, "Plateado");
        Gato gato = new Gato(5, "Garfield", 4, "naranja");*/
        
        /*Animal animal =  new Animal();
        animal = new Perro();
        animal = new Gato();*/
        
        Animal listaAnimales[] = new Animal [3];
        listaAnimales [0] = new Perro(5, "Moroch", 10, "Negro");
        listaAnimales [1] = new Gato(2, "Maka", 14, "Gris");
        
        
    }
    
}
