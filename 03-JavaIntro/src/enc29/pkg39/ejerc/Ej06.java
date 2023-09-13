package enc29.pkg39.ejerc;

//Crear un programa que dado un numero determine si es par o impar.

import java.util.Scanner;

public class Ej06 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num = leer.nextInt();
        
        if (num % 2 == 0)
            System.out.println("El numero es par");
        else
            System.out.println("El numero es imparS");
        
        
    }
    
}
