package enc29.pkg39.ejerc;

/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la 
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que 
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
El programa deberá comprobar que los números introducidos son correctos, es decir, 
están entre el 1 y el 9.
*/

import java.util.Scanner;

public class Ej20 {

    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la dimensión de la cantidad de filas/columanas que tendrá la matriz");
        int dimension = leer.nextInt();
        
        int [][] matriz = new int [dimension][dimension];
        
        System.out.println("Introducir números del 1 al 9 para llenar una matriz de 3x3,");
        
        rellenar (matriz);
        
        comprobar (matriz);
        
    }
    
    public static void rellenar (int matriz[][]){
        
        Scanner leer = new Scanner(System.in);
        
        for (int[] matriz1 : matriz) {
            System.out.println("Fila");
            for (int j = 0; j<matriz.length; j++) {
                do{
                    matriz1[j] = leer.nextInt();
                    if(matriz1[j]<1 || matriz1[j]>9){
                        System.out.println("Reingrese un número entre 1 y 9");
                    }
                } while(matriz1[j]<1 || matriz1[j]>9);
            }
        }
    }
    
    public static void comprobar (int matriz[][]){
        
        int suma1=0;
        int suma2=0;
        int suma3=0;
        int suma4=0;
        
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz.length; j++){
                suma1 = suma1 + matriz[i][j];   // suma de filas
                suma2 = suma2 + matriz[j][i];   // suma de columnas
                suma3 = suma3 + matriz[i][i];   // suma de diag ppal
                suma4 = suma4 + matriz[i][matriz.length-1-i];   // suma de diag secund
            }
        }
        
        if (suma1 == suma2 && suma3 == suma4 && suma2 == suma3) {
            System.out.println("La matriz ES Mágica");
        } else {
            System.out.println("La matriz NO es mágica");
        }
        
    }
    
    
}

