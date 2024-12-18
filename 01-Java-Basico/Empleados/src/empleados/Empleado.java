
package empleados;

public class Empleado {
    private String nombre;
    double salarioBase;
    String descripcion;
    
    
    public Empleado() {
    }

    
    
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    
    
    
    
    
    
    
    
    public double CalcularSalario(){
        System.out.println(" Debe elegir el tipo de empleado para calcular salario ");
        return 0;
        
    }
    
    
    
    public String getDescripcion(){        
        return "Empleado con responsabilidades generales " + salarioBase;
    }
    
    
    
}
