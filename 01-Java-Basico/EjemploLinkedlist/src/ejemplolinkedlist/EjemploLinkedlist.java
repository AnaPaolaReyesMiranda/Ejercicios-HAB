
package ejemplolinkedlist;

import java.util.LinkedList;


public class EjemploLinkedlist {

   
    public static void main(String[] args) {
        
        LinkedList<String> listaFrutas = new  LinkedList<String>();
        
        //Java agrega los elementos en el orden que yo especifique
        // LIFO y FIFO
        // LIFO Last in First Out
        // FIFO First in First Out
        
        listaFrutas.add("Naranja");
        listaFrutas.add("Manzana");
        listaFrutas.add("Banana");
        listaFrutas.add("Fresa");
                
        //agrego el melon para que sea mi nodo cabecera (primer lugar)
        listaFrutas.add(0, "Melon");
        
        //para ver el tamaño de una lista
        int tamanio = listaFrutas.size();
        System.out.println("El tamaño de la lista es: " + tamanio);
        
        //recorrer mi linkedlist
        //usamos for each
        for (String fruta : listaFrutas){
            System.out.println("La fruta guardad es: " + fruta);
        }
        
        //borrar elemento por posicion
        listaFrutas.remove(0);
        
        
        
        System.out.println("-------------------------------");
         for (String fruta : listaFrutas){
            System.out.println("La fruta guardad es: " + fruta);
        }
         
         
         
       
    }
    
}
