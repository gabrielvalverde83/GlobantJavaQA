package enc29.pkg39.ejerc;

/**
 Realizar un programa que rellene una matriz de 4 x 4 de valores aleatorios y muestre la 
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se 
obtiene cambiando sus filas por columnas (o viceversa) 
 */

public class Ej18 {

    public static void main(String[] args) {
        
        int [][] matriz = new int [4][4];
        int [][] matrizB = new int [4][4];
          
        rellenar (matriz);
        
        System.out.println("Matriz A: ");
        imprimirM (matriz);
        
        genTranspuesta(matrizB, matriz);
        
        System.out.println("Matriz transpuesta: ");
        imprimirM (matrizB);
        
    }

    public static void rellenar(int matriz[][]){
        
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[j] = (int)(Math.random()*10);
            }
        }
    }

    public static void imprimirM(int matriz[][]){
        
        String aux;

        for (int [] fila: matriz){
            aux = "";
            for (int elemento:fila){
            aux = aux + "[" + elemento + "]"; 
            }
        System.out.println(aux);
        }
    }
    
    public static void genTranspuesta(int matrizB[][], int matriz[][]){
        
        for (int i=0; i<matrizB.length; i++){
            for (int j=0; j<matrizB[i].length; j++){
                matrizB[i][j] = matriz[j][i];
            }
        }
    }

}
