package enc29.pkg39.ejerc;

//Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda 
//en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en 
//Java

import java.util.Scanner;

public class Ej03 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String frase = leer.nextLine();
        
        frase = frase.toLowerCase();
        
        System.out.println(frase);
        
        frase = frase.toUpperCase();
        
        System.out.println(frase);
        
        
    }
    
}
