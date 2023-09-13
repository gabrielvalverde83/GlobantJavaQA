package enc29.pkg39.ejerc;

//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por 
//pantalla

import java.util.Scanner;

public class Ej02B {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String nombre = leer.next();
        
        System.out.println("El nombre es: " + nombre);
            
       nombre = leer.nextLine();
        
        System.out.println("El nombre es: " + nombre);
        
        nombre = leer.nextLine();
        
        System.out.println("El nombre es: " + nombre);
        
        
        
        
    }
    
}
