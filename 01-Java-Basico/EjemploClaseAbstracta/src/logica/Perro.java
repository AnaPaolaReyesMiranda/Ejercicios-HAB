
package logica;


public class Perro extends Animal {

    
    
    
    
    
    public Perro(String nombre, String color) {
        super(nombre, color);
    }

    
    
    
    

    @Override
    public void comer() {
        System.out.println("Soy un perro y como");
    }

    @Override
    public void hacerSonido() {
        System.out.println("Soy un perro gua gua");
    }
    
    
    
}
