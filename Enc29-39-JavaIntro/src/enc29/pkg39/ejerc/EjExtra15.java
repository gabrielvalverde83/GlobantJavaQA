package enc29.pkg39.ejerc;

/**
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
matemática y deben devolver sus resultados para imprimirlos en el main. 
 
 */

import java.util.Scanner;

public class EjExtra15 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 2 números enteros");
        
        double num1 = leer.nextDouble();
        double num2 = leer.nextDouble();
        int opc;
        
        System.out.println("\nIngrese un número para indicar la operación: "
                + "\n1 - Suma"
                + "\n2 - Resta"
                + "\n3 - Producto"
                + "\n4 - División");
        
        do{
            opc = leer.nextInt();
            if(opc<1 || opc>4){System.out.println("Error - Ingrese una opción válida");}
        } while (opc<1 || opc>4);
    
        switch (opc) {
            case 1:
                suma (num1, num2);
                break;
            case 2:
                resta (num1, num2);
                break;
            case 3:
                producto (num1, num2);
                break;
            case 4:
                division (num1, num2);            
                break;
        }

    }
    
    public static void suma (double num1, double num2){
        
        double resultado;
        
        resultado = num1 + num2;
    
        System.out.println(resultado);
    }
    
    public static void resta (double num1, double num2){
        
        double resultado;
        
        resultado = num1 - num2;
    
        System.out.println(resultado);
    }
    
    public static void producto (double num1, double num2){
        
        double resultado;
        
        resultado = num1 * num2;
    
        System.out.println(resultado);
    }
    
    public static void division (double num1, double num2){
    
        
        double resultado;
        
        resultado = num1 / num2;
    
        System.out.println(resultado);
    }
    
 
}
