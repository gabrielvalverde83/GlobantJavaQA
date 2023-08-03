package enc29.pkg39.ejerc;

//Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si 
//el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje 
//por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
//“INCORRECTO”. Nota: investigar la función Lenght() en Java.

import java.util.Scanner;

public class Ej08 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Ingrese una frase de 8 letras");
        
        do {
            
            frase = leer.nextLine();
            
            if (frase.length() != 8){
                System.out.println("La cantidad de letras ingresada es incorrecta");
            }
            
        } while (frase.length() != 8);
        
        System.out.println("Frase correcta");
        
        
    }
    
}
