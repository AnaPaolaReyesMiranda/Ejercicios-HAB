
package ejemploarrylist;

import java.util.ArrayList;
import logica.Fruta;

public class EjemploArrylist {

    public static void main(String[] args) {
       
        ArrayList<Fruta> listaFrutas = new ArrayList<>();
        
        Fruta fruta = new Fruta("Manzana", "Rojo", "Todo el año");
        listaFrutas.add(fruta);
        listaFrutas.add(new Fruta("Naranja", "Anaranjado", "Todo el año"));
        listaFrutas.add(new Fruta("Banana", "Amarillo", "Todo el año"));
        listaFrutas.add(new Fruta("Sandia", "Verde", "Verano"));
        
        //traer elemento de un indice en particular
        Fruta frut = listaFrutas.get(3);
        
        //eliminar un elemento
        listaFrutas.add(new Fruta("Melon", "Azul", "Todo el año"));
        listaFrutas.remove(4);
        
        int tamanio = listaFrutas.size();
        
        //recorrer el arraylist mediante indices
        for (int i=0; i<listaFrutas.size(); i++) {
            System.out.println("Fruta: " + listaFrutas.get(i).getNombre());
        
        
        for (Fruta fru:listaFrutas){
            System.out.println("Fruta: " + fru.getNombre());
            
        }
        
        
    }
        
    }
    
}
