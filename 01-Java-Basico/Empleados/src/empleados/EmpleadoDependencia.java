
package empleados;


public class EmpleadoDependencia extends Empleado {
   
    private double bono;

    
    
    public EmpleadoDependencia() {
    }

    
    
    
    public EmpleadoDependencia(double bono) {
        this.bono = bono;
    }

    public EmpleadoDependencia(double bono, String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    
    
    
    
    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    
    
    @Override
    public double CalcularSalario(){        
        return salarioBase + bono;
        
    }
    
   
    
    
    
    @Override
    public String getDescripcion(){
        return super.getDescripcion() + "Bono adicional de  " + bono ;
    }
    
    
    
        
    }
    

