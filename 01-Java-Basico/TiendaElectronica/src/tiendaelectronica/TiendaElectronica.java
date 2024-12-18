
package tiendaelectronica;

import java.util.ArrayList;
import java.util.Scanner;
import logica.Producto;



public class TiendaElectronica {

    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Producto> productos = new ArrayList<>();
        
        String nombreProducto, marcaProducto;
        double precioProducto;
        
        while(true){
            System.out.println("\n Tienda de Electronica --- Menu---");
            System.out.println(" 1. Ingresar producto");
            System.out.println(" 2. Buscar producto");
            System.out.println(" 3. Salir");
            System.out.println(" Seleccione una opcion (1,2 o 3)");
            
            int opcion = scanner.nextInt();
            
            
            switch (opcion){
            
                case 1:
                    while(true){
                        System.out.println("\n Ingrese el nombre del producto (o 'Fin' para terminar): ");
                        nombreProducto = scanner.nextLine();
                        if (nombreProducto.equalsIgnoreCase("Fin")){
                            
                        
                        }
                        else{
                            System.out.println("Ingrese la marca del producto: ");
                        marcaProducto = scanner.nextLine();
                        System.out.println("Ingrese el precio del producto: ");
                        precioProducto = scanner.nextDouble();
                        
                        Producto nuevoProducto = new Producto(nombreProducto, marcaProducto, precioProducto);
                        productos.add(nuevoProducto);
                        System.out.println("Producto agregado: " + nuevoProducto);
                        
                        }           
                        
                    }
                    
                case 2:
                    System.out.println("\n Ingrese el nombre del producto a buscar: ");
                    nombreProducto = scanner.nextLine();
                    boolean encontrado = false;
                        for (Producto producto : productos){
                            if(producto.getNombre().equalsIgnoreCase(nombreProducto)){
                            System.out.println("Producto encontrado: " + producto);
                            encontrado = true;
                            
                }           }
                        if (!encontrado){
                            System.out.println("El producto no se encuentra en la lista.");
                        }
                        System.out.println("\n ¿Desea buscar otro producto? (s/n): ");
                        String respuesta = scanner.nextLine();
                            if(respuesta.equalsIgnoreCase("n")){
                                System.out.println("¡Hasta luego!");
                            }
                            else{
                                System.out.println("¿Que otro producto desea buscar?");
                                
                            }
                   
                case 3:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    scanner.close();
                    return;
                    
                default: System.out.println("Opcion no valida. Intente nuevamente.");
            }
            
        
        }
        
       

   
}
}