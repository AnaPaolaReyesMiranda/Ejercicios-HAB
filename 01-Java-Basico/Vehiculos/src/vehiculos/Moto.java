
package vehiculos;

public class Moto extends Vehiculo {
    
    private double cilindrada;

    
    
    public Moto() {
    }

    
    
    
    public Moto(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Moto(double cilindrada, String marca, String modelo, int anio) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }
    
    
    public void acelerar(){
        System.out.println("La moto esta acelerando");
    }

    
    
    
  @Override
    public String toString() {
        return " Moto {" + "cilindrada=" + cilindrada + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + '}';
    }
    
}
