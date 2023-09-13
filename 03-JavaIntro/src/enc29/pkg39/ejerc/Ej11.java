package enc29.pkg39.ejerc;

//Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
//pantalla el siguiente menú:
//MENU
//1. Sumar
//2. Restar
//3. Multiplicar
//4. Dividir
//5. Salir
//Elija opción:
//El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
//pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
//opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del 
//programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está 
//seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale 
//del programa, caso contrario se vuelve a mostrar el menú.

import java.util.Scanner;

public class Ej11 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 2 números enteros");
        
        double num1 = leer.nextDouble();
        double num2 = leer.nextDouble();
        
        System.out.println("\n**********MENU**********"
                + "\nIngrese la opción deseada"
                + "\n1.Sumar"
                + "\n2.Restar"
                + "\n3.multiplicar"
                + "\n4.Dividir"
                + "\n5.Salir"
        );
        
        int opcN;
        String opcL = "";
        double resultado;
        
        do {
            System.out.println("Ingrese una opcion");
            opcN = leer.nextInt();
            
            switch(opcN) {
                case 1:
                    System.out.println("La suma de los números es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de los números es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("El producto de los números es: " + (num1 * num2));
                    break;
                case 4:
                    resultado = num1/num2;
                    System.out.println("La division de los números es: " + resultado);
                    break;
                case 5:
                    System.out.println("Está seguro que desea salir?");
                    opcL = leer.next();
                    break;
            }
            
            
            
        } while (opcN != 5 || !opcL.equals("S"));
        
        
        
    }
    
}
