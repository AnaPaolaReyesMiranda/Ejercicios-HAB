
package ejemploencapsulamiento;


public class EjemploEncapsulamiento {

    
    public static void main(String[] args) {
        
       
        
         
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.getTitular();        
        cuenta.getSaldo();
        cuenta.getNumeroCuenta();
        
        System.out.println("Nombre: " + cuenta.getTitular() + "Numero de cuenta: " 
                + cuenta.getNumeroCuenta() +  "Su saldo es: " + cuenta.getSaldo());
        
        
    }
    
}
