package enc29.pkg39.ejerc;

//Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
//pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: 
//investigar la función equals() en Java.

import java.util.Scanner;

public class Ej07 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String frase = leer.nextLine();
        
        if(frase.equals("eureka")){
            System.out.println("La frase es correcta");
        } else {
            System.out.println("La frase es INcorrecta");
        }
        
        
    }
    
}
