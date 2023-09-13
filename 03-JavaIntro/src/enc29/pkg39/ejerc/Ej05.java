package enc29.pkg39.ejerc;

//Escribir un programa que lea un número entero por teclado y muestre por pantalla el 
//doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
//Math.sqrt().

import java.util.Scanner;

public class Ej05 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num = leer.nextInt();
        
        System.out.println("El doble de: " + num + " es: " + (num*num));
        
        System.out.println("El triple de: " + num + " es: " + (num*num*num));
        
        System.out.println("La raiz cuadrada de: " + num + " es: " + (Math.sqrt(num)));
    
    }
    
}
