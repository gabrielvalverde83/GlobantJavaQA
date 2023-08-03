package Servicio;

import Entidades.Libro;
import java.util.Scanner;

public class LibroServicio {
    
    public Libro cargarLibro(){
        
        //creo el objeto
        
        Libro l1 = new Libro();
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el número ISBN");
        l1.setIsbn(leer.nextInt());
        System.out.println("Ingrese el título");
        l1.setTitulo(leer.next());
        System.out.println("Ingrese el autor");
        l1.setAutor(leer.next());
        System.out.println("Ingrese la cantidad de páginas");
        l1.setNumeroPag(leer.nextInt());

        return l1;
    }
    
    public void imprimirLibro(Libro l1, int c){
        //String s = l1.getClass().getName();
        System.out.println("**********************");
        System.out.println("Datos del libro: " + c);
        System.out.println("\nISBN: " + l1.getIsbn()
                + "\nTitulo: " + l1.getTitulo()
                + "\nAutor: " + l1.getAutor()
                + "\nCant de páginas: " + l1.getNumeroPag());
    }
    
}
