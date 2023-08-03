package enc29.pkg39.ejerc;

/**
Escribir un programa que lea un número entero y devuelva el número de dígitos que 
componen ese número. Por ejemplo, si introducimos el número 12345, el programa 
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el 
operador de división. Nota: recordar que las variables de tipo entero truncan los 
números o resultados.
 */

import java.util.Scanner;

public class EjExtra11 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero");
        double num = leer.nextInt();
        double num2;
        int cont = 0;
        
        do {
            
            num2 = Math.floor(num/10);
            num = num2;
            cont ++;
            
        } while(num2 != 0);
        
        System.out.println("Tiene " + cont + " digitos");
  
    }
    
}
