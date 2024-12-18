
package empleados;


public class Empleados {

    
    public static void main(String[] args) {
        
        Empleado empleados[] = new Empleado [5];
        
        empleados [0] = new EmpleadoDependencia(300, "Alejandra", 2500);
        empleados [1] = new EmpleadoDependencia(500, "Larissa", 3000);
        empleados [2] = new EmpleadoPorHora(40, 500, "Adriana", 3500);
        empleados [3] = new EmpleadoPorHora(50, 1000, "Cristina", 4000);
        empleados [4] = new EmpleadoDependencia(600, "Rebeca", 3500);
        
        
        for (Empleado empleado : empleados){
            System.out.println("Nombre " + empleado.getNombre());
            System.out.println("Salario " + empleado.CalcularSalario());
            System.out.println("Descripcion " + empleado.getDescripcion());
            
        }
        
        
        
    }
    
}
