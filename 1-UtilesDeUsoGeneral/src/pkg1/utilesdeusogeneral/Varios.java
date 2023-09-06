package pkg1.utilesdeusogeneral;


import java.util.ArrayList;
import java.util.Scanner;

public class Varios {

    public static void main(String[] args) {
        
        Scanner leer   = new Scanner(System.in);

        //conversion de double a entero más cercano
                
        System.out.println("Ingrese el tiempo en minutos");
        
        int tpoIngresado = leer.nextInt();
        
        double dias = Math.floor(tpoIngresado/1140);   //min a dias - devuelve el entero más cercano por debajo
        
        /********************************************************************************************************/
        /********************************************************************************************************/
        /********************************************************************************************************/

        // conversion de entero a String
        
        int entero = 0;

        String palabra;
        
        palabra = String.valueOf(entero);
        
        /********************************************************************************************************/
        /********************************************************************************************************/
        /********************************************************************************************************/

        // conversion de String a entero
        
        String palabra2 = "hola";
        
        int entero2;
        
        entero2 = Integer.parseInt(palabra2);
        
        
        /********************************************************************************************************/
        /********************************************************************************************************/
        /********************************************************************************************************/
        
        // pedir un caracter x teclado
        
        System.out.print("Escriba el consumo del electrodoméstico: ");
        char letra = leer.nextLine().charAt(0);
        
        
        
        
    }
    
    public boolean mojar(){
        
        // forma de comparar y devolver un boolean
        
        int num1 = 1;
        int num2 = 2;
        
        
        return num1 == num2;
    }
    
    
    public void formasImprimir(ArrayList clientes) {
        
        clientes.forEach((cliente) -> {
            System.out.println(cliente);
        });
        
        for (Object cliente : clientes) {
            System.out.println(cliente);
        }
        
        clientes.forEach(cliente -> System.out.println(cliente));
        clientes.forEach(System.out::println);
    }
    
    
 
} 
        
        
        
    
    

