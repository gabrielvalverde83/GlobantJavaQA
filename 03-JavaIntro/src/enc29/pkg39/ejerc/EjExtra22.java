package enc29.pkg39.ejerc;

/**
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y 
muestre la suma de sus elementos.
* 
* 
 */

import java.util.Scanner;

public class EjExtra22 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese las dimensiones de la matriz");
        int n = leer.nextInt();
        int m = leer.nextInt();
        
        int [][] matriz = new int [n][m];
          
        rellenar (matriz);
        
        imprimirM (matriz);
        
    }

    public static void rellenar(int matriz[][]){
        
        int suma = 0;
        
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[j] = (int)(Math.random()*10);
                suma = suma + matriz1[j];
            }
        }
        
        System.out.println("La suma de todos los elementos es: " + suma);
    }

    public static void imprimirM(int matriz[][]){
        
        String aux;
        
        System.out.println("Matriz: ");

        for (int [] fila: matriz){
            aux = "";
            for (int elemento:fila){
            aux = aux + "[" + elemento + "]"; 
            }
        System.out.println(aux);
        }
    }
}