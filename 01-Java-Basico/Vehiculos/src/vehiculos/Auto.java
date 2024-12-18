
package vehiculos;


public class Auto extends Vehiculo {
    
    private int cantidadPuertas;
    
    

    public Auto() {
    }

    
    
    
    public Auto(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public Auto(int cantidadPuertas, String marca, String modelo, int anio) {
        super(marca, modelo, anio);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    
   public void acelerar(){
        System.out.println("El Auto esta acelerando");
    } 
   
   
   
   
    
    @Override
    public String toString() {
        return " Auto {" + "cantidadPuertas=" + cantidadPuertas  + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + '}';
    }
    
    
    
    
}
