package enc29.pkg39.ejerc;

//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase 
//es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla 
//que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: 
//investigar la función Substring y equals() de Java.

import java.util.Scanner;

public class Ej09 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String frase = leer.nextLine();
        
        if (frase.startsWith("A")) {
            
            System.out.println("Correcto");
            
        } else {
            
            System.out.println("Incorrecto");
            
        }
        
        
        
        
    }
    
}
