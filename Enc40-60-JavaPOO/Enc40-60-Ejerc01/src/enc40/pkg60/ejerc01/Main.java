package enc40.pkg60.ejerc01;

import Entidades.Libro;
import Servicio.LibroServicio;

/**
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas. 
 */

public class Main {

    public static void main(String[] args) {
        
        LibroServicio ls = new LibroServicio();
        
        Libro l1 = ls.cargarLibro();
        Libro l2 = ls.cargarLibro();
        
//        System.out.println(l1);
//        System.out.println(l2);
        
        ls.imprimirLibro(l1, 1);
        ls.imprimirLibro(l2, 2);
    }
    
}
