package enc29.pkg39.ejerc;

/**
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe 
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares 
y la cantidad de números impares. Al igual que en el ejercicio anterior los números 
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */

import java.util.Scanner;

public class EjExtra08 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduzca números enteros");
        
        int num;
        int contPar = 0;
        int contImpar = 0;
        int contTotal = 0;
        
        do {
            
            num = leer.nextInt();
            if (num%5 == 0){        // si num es multiplo de 5, el resto es cero y sale
                break;
            }
            
            if (num>0) {
            
                contTotal ++;

                if (num%2 == 0) {   //es par
                    contPar ++;
                } else {            //impar
                    contImpar ++;
                }
                
            }

        } while (1==1);   
        
        System.out.println("Se ingresaron: " + contTotal);
        System.out.println("De los cuales: " + contPar + " son Pares");
        System.out.println("De los cuales: " + contImpar + " son Impares");
    }
    
}
