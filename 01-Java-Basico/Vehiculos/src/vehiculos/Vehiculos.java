
package vehiculos;


public class Vehiculos {

   
    public static void main(String[] args) {
        
        
        Vehiculo vehiculo = new Vehiculo("Merecedes", "MCW", 2345);
        Auto auto = new Auto(4, "Chevrolet", "MCR", 2456);
        Moto moto = new Moto(4, "Hyunday", "MCT", 4346);
        
        System.out.println("La informacion del vehiculo es:" + vehiculo.toString());
        System.out.println("La informacion del auto es:" + auto.toString());
        System.out.println("La informacion de la moto es:" + moto.toString());
        
        vehiculo.acelerar();
        auto.acelerar();
        moto.acelerar();
        
        
    }
    
}
