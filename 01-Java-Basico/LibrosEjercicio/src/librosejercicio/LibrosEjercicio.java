package librosejercicio;

import java.util.Scanner;
import logica.Libro;


public class LibrosEjercicio {

    
    public static void main(String[] args) {
        
        System.out.println("*********** Bienvenido a la Biblioteca Libritos *********** ");
        
        Libro libro = new Libro();
        Scanner teclado = new Scanner (System.in);
        Libro listaLibros[] = new Libro[5];
        
        for (int i=0;i<listaLibros.length;i++) {
            System.out.println("Ingrese los datos del libro correspondiente");
            System.out.println("Código: ");
            libro.setCodigo(teclado.nextInt());
            System.out.println("Título: ");
            teclado = new Scanner (System.in);
            libro.setTitulo(teclado.nextLine());
            System.out.println("Autor: ");
            libro.setAutor(teclado.nextLine());
            System.out.println("Género: ");
            libro.setGenero(teclado.nextLine());
            System.out.println("Cantidad de páginas");
            teclado = new Scanner (System.in);
            libro.setNumPaginas(teclado.nextInt());
            
            //guardo libro en vector
            listaLibros[i] = libro;
            
            //reseteo libro y scanner
            libro = new Libro();
            teclado = new Scanner (System.in);
            
            System.out.println("Libro cargado correctamente");

        }
        
        System.out.println("Todos los libros se han cargado satisfactoriamente");
        System.out.println("-----------------------------------");
        System.out.println("Lista de libros cargados:");
        
         for (int i=0;i<5;i++) { 
             System.out.println(listaLibros[i].toString());
         }
        
           
        
    }
    
        
    }
    

