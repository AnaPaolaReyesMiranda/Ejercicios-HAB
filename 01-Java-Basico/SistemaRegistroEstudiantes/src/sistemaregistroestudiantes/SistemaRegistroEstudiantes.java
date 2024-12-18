
package sistemaregistroestudiantes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;




public class SistemaRegistroEstudiantes {

    public static void main(String[] args) {
        
        Map<Integer,Double> notas;
        notas = new HashMap<>();
        
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("Sistema registro Estudiantes");
            System.out.println("1. Ingresar estudiante");
            System.out.println("2. Buscar estudiante por matricula");
            System.out.println("3. Buscar estudiante por promedio ");
            System.out.println("4. Salir ");
            System.out.println("Seleccione una opcion (1,2,3 o 4):  ");
            
            int opcion= scanner.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.println(" Ingrese numero de matricula del estudiante: ");
                int matricula = scanner.nextInt();
                    System.out.println("Ingrese el promedio del estudiante: ");
                    double promedio = scanner.nextDouble();
                    notas.put(opcion, promedio);
                    System.out.println(" Estudiante ingresado correctamente.");
                    break;
                case 2:   
                    System.out.println("Ingrese el numero de matricula para buscar: ");
                    matricula = scanner.nextInt();
                    if (notas.containsKey(matricula)){
                    System.out.println("Estudiante encontrado: Matricula: " + matricula + ", Promedio: " + notas.get(matricula));
            }
                    else{
                        System.out.println("No se encontro ningun estudiante con esa matricula.");
                        
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el promedio para buscar estudiantes: ");
                    promedio = scanner.nextDouble();
                    boolean encontrado = false;
                    for(Map.Entry<Integer, Double> entry : notas.entrySet()){
                        if(entry.getValue().equals(promedio)){
                            System.out.println("Estudiante encontrado: Matricula: " + entry.getKey() + "Promedio: " + entry.getValue());
                            encontrado = true;
                        }
                            if(!encontrado){
                                System.out.println("No se encontraron estudiantes con ese promedio.");
                            }
                            break;
                    }
                case 4:    
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    return;
                default: System.out.println("Opcion no valida. Intente nuevamente.");
            }
        }
       
    }
    
}
