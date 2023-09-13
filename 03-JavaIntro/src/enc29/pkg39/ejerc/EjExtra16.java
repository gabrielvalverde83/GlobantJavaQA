package enc29.pkg39.ejerc;

/**
 Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de 
las personas ingresadas por teclado e indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
mostrando personas y frenar cuando el usuario ingrese la palabra “No”
 */

import java.util.Scanner;

public class EjExtra16 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas a ingresar");
        int cantPersonas = leer.nextInt();
        
        for (int i=0; i<cantPersonas; i++){
            llenar();
        }
        String respuesta;
        
        do{
            System.out.println("Desea agregar más personas? S o N");
            
                do{
                    respuesta = leer.next().toUpperCase();
                    if(!respuesta.equals("S") && !respuesta.equals("N")){System.out.println("Error - Ingrese S o N");}
                } while (!respuesta.equals("S") && !respuesta.equals("N"));

                if(respuesta.equals("S")){
                    llenar();
                } else {
                    System.out.println("Saliendo");
                }
        }while(respuesta.equals("S"));
    }
        
    public static void llenar(){
        
        System.out.println("Ingrese nombre");
        Scanner leer = new Scanner(System.in);
        String nombre = leer.nextLine();
        
        String mayor;
        System.out.println("Ingrese edad");
        
        int edad = leer.nextInt();
        
        if (edad >= 18) {
            mayor = "SI";
        } else {
            mayor = "NO";
        }
        
        System.out.println(nombre + " tiene " + edad + " años por lo que " + mayor + " mayor de edad");
    
    }
    
}
