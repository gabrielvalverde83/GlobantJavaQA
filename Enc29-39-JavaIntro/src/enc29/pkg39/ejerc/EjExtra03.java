package enc29.pkg39.ejerc;

/**
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase 
String
 */

import java.util.Scanner;

public class EjExtra03 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String letra;
        int longitud;
        
        do{
            System.out.println("Ingrese una letra");
            letra = leer.nextLine();
        } while (letra.length()>1);
        
        boolean contiene = letra.toLowerCase().matches(".*[aeiou].*");
        
        System.out.println("Es una vocal??? : " + contiene);

    }
    
}
