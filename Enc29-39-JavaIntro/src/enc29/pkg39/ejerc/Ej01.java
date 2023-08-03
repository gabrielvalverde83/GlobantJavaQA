package enc29.pkg39.ejerc;

//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los 
//dos. El programa deberá después mostrar el resultado de la suma

import java.util.Scanner;

public class Ej01 {

    public static void main(String[] args) {
            
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 2 numeros enteros");
        
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        System.out.println("La suma es: " + (num1 + num2));
        
        // System.out.println("La suma es: " + num1 + num2 );  //si lo escribo asi los concatena
        
        
        
    }
    
}
