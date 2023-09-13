package enc29.pkg39.ejerc;

/**
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el 
promedio de n números (n>0). El valor de n se solicitará al principio del programa y los 
números serán introducidos por el usuario. Realice dos versiones del programa, una 
usando el bucle “while” y otra con el bucle “do - while”.
 */

import java.util.Scanner;

public class EjExtra07b {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de números a calcular");
        int cantNum = leer.nextInt();
        
        System.out.println("Ingrese los números");
        
        calcular1 (cantNum);
        
    }
    
    public static void calcular1(int cantNum){
        
        Scanner leer = new Scanner(System.in);
        
        int cont = 0;
        int suma = 0;
        int max = 0;
        int min = 0;
        int num;
        
        do{
            
            num = leer.nextInt();
            
            suma = suma + num;
            
            if (cont == 0){
                min = num;
                max = num;
            } else if (num<min){
               min = num;
            } else if (num>max){
               max =num;
            }
           
            cont++;
            
        } while (cont<cantNum);
        
        System.out.println("El valor máximo es: " + max);
        System.out.println("El valor mínimo es: " + min);
        System.out.println("El promedio es: " + suma/cantNum);
        
        
    }
    
}
