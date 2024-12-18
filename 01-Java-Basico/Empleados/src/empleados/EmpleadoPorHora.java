
package empleados;


public class EmpleadoPorHora extends Empleado {
    
    private int horasTrabajadas;
    private double tarifaPorHora;

    
    
    
    public EmpleadoPorHora() {
    }

    
    
    
    
    
    public EmpleadoPorHora(int horasTrabajadas, double tarifaPorHora) {
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public EmpleadoPorHora(int horasTrabajadas, double tarifaPorHora, String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    
    
    
    
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    
    
    @Override
    public double CalcularSalario(){        
        return horasTrabajadas * tarifaPorHora;
        
    }
    
    
   
   
    
    
    @Override
    public String getDescripcion(){
        return super.getDescripcion() + "Trabajando " + horasTrabajadas + "horas a una tarifa de " + tarifaPorHora + "por hora";
    }
        
    
    
}
