package enc29.pkg39.ejerc;

/**
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño 
N, con los valores ingresados por el usuario.
* 
* 
 */

import java.util.Scanner;

public class EjExtra18 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la dimensión del vector");
        int dimension = leer.nextInt();
        
        int [] vector = new int [dimension];
          
        System.out.println("La suma total es:" + rellenar(vector));
        
        imprimirV (vector);
        
    }

    public static int rellenar(int vector[]){
        
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        
        System.out.println("Ingrese los numeros a sumar:");
        for (int i=0; i<vector.length; i++){
            vector[i] = leer.nextInt();
            suma = suma + vector[i];
        }
        
        return suma;
    }

    public static void imprimirV(int vector[]){
        
        String aux = "";
        
        System.out.println("El Vector: ");

        for (int elemento: vector){
            aux = aux + "[" + elemento + "]"; 
        }
        System.out.println(aux);
    }
}