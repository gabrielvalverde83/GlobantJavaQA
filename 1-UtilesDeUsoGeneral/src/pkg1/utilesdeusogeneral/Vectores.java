package pkg1.utilesdeusogeneral;

import java.util.Arrays;
import java.util.Scanner;

public class Vectores {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la dimension de los vectores");
        int dimension = leer.nextInt();
        
        int vector [] = new int [dimension];
          
        rellenar (vector);
        
        imprimirV (vector);
        
    }
    
    /********************************************************************************************************/
    /********************************************************************************************************/
    /********************************************************************************************************/
    
    //rellenar

    public static void rellenar(int vector[]){
        
        for (int i=0; i<vector.length; i++){
            vector[i] = (int)(Math.random()*10);
        }
    }
    
    /********************************************************************************************************/
    /********************************************************************************************************/
    /********************************************************************************************************/
    
    // rellenar con el mismo valor toda la matriz //// supongo que sirve para vectores también
    
    public static void rellenar3(int matriz[][]){
        
        for (int[] fila:matriz)      //lleno toda la matriz con "-"
            Arrays.fill(fila, 0);
    }
    
    /********************************************************************************************************/
    /********************************************************************************************************/
    /********************************************************************************************************/
    
    //imprimir

    public static void imprimirV(int vector[]){
        
        String aux = "";
        
        System.out.println("El Vector: ");

        for (int elemento: vector){
            aux = aux + "[" + elemento + "]"; 
        }
        System.out.println(aux);
    }
    
   
    
    
    
    
}
