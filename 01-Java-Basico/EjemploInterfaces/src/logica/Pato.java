
package logica;


public class Pato extends Animal implements Acuaticos, Voladores, Terrestres {

    public Pato(String nombre, String color) {
        super(nombre, color);
    }

    @Override
    public void comer() {
        System.out.println("Soy un pato y como");
    }

    @Override
    public void nadar() {
        System.out.println("Soy un pato y nado");
    }

    @Override
    public void respirarBajoAgua() {
        System.out.println("Soy un pato y puedo respirarBajoAgua");
    }

    @Override
    public void volar() {
        System.out.println("Soy un pato y vuelo");
    }

    @Override
    public void aletear() {
        System.out.println("Soy un pato y aleteo");
    }

    @Override
    public void caminar() {
        System.out.println("Soy un pato y camino");
    }

    @Override
    public void respirar() {
        System.out.println("Soy un pato y respiro");
    }
    
    
    
}
