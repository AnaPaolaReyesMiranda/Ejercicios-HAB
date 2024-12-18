
package ejemplohashmap;

import java.util.HashMap;
import java.util.Map;


public class EjemploHashMap {

    public static void main(String[] args) {
        
        //Crear un HashMap
        Map<Integer, Double> estaturas = new HashMap<>();
        
        //Agregar valores
        estaturas.put(1, 1.79);
        estaturas.put(2, 1.67);
        estaturas.put(3, 1.58);
        estaturas.put(4, 1.95);
        
        //busqueda
                double estatura = estaturas.get(3);
                
        //busqueda por key
        boolean estaONo = estaturas.containsValue(1.54);
        
        
        
        //Promitivo             Clase Especial
        //int                       Integer
        //double                    Double
        //boolean                   Boolean
        // -                        String
    }
    
}