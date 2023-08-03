package enc29.pkg39.ejerc;

//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
//solicite números al usuario hasta que la suma de los números introducidos supere el 
//límite inicial.

import java.util.Scanner;

public class Ej10 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero máximo");
        
        int max = leer.nextInt();
        
        System.out.println("Ingrese numeros hasta que su suma sea mayor al valor max ingresado");
        
        int suma = 0;
        int num;
        
        do {
            
            num = leer.nextInt();
            suma = suma + num;            
            
        } while (suma < max);
        
        System.out.println("La suma es: " + suma);
        
    }
    
}
