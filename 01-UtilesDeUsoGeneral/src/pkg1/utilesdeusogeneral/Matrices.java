package pkg1.utilesdeusogeneral;

import java.util.Arrays;
import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la dimension de la matriz");
        int n = leer.nextInt();
        int m = leer.nextInt();
        
        int [][] matriz = new int [n][m];
          
        rellenar (matriz);
        
        imprimirM (matriz);
        
    }
    
    /********************************************************************************************************/
    /********************************************************************************************************/
    /********************************************************************************************************/
    
    //rellenar

    public static void rellenar(int matriz[][]){
        
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[j] = (int)(Math.random()*10);
            }
        }
    }
    
    /********************************************************************************************************/
    /********************************************************************************************************/
    /********************************************************************************************************/
    
    // rellenar con for tradicional    
    
    public static void rellenar2(int matriz[][]){
        
        for (int i=0; i<matriz.length; i++) {
            for (int j = 0; j<matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random()*10);
            }
        }
    }
    
    /********************************************************************************************************/
    /********************************************************************************************************/
    /********************************************************************************************************/
    
    // rellenar con el mismo valor toda la matriz
    
    public static void rellenar3(int matriz[][]){
        
        for (int[] fila:matriz)      //lleno toda la matriz con "-"
            Arrays.fill(fila, 0);
    }
    
    
    /********************************************************************************************************/
    /********************************************************************************************************/
    /********************************************************************************************************/
    
    //imprimir

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
    
        /*
    
    */
}
  
