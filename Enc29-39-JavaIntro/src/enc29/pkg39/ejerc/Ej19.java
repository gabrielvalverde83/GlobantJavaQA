package enc29.pkg39.ejerc;

/**
 Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que 
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada 
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se 
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

 */

public class Ej19 {

    public static void main(String[] args) {
        
        int [][] matriz = new int [4][4];
        int [][] matrizB = new int [4][4];
        int [][] matrizC = new int [4][4];
          
        rellenar (matriz);
        
        System.out.println("Matriz A: ");
        imprimirM (matriz);
        
        genTranspuesta(matrizB, matriz);
        
        System.out.println("Matriz transpuesta: ");
        imprimirM (matrizB);
        
        genAntiSimetrica(matrizC, matriz);
        
        System.out.println("Matriz antisimetrica generada: ");
        imprimirM (matrizC);
        
        comprobar(matrizC, matriz);
        
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
    
    public static void genAntiSimetrica(int matrizB[][], int matriz[][]){
        
        for (int i=0; i<matrizB.length; i++){
            for (int j=0; j<matrizB[i].length; j++){
                matrizB[i][j] = (-1)*matriz[j][i];
            }
        }
    }
    
    public static void comprobar(int matrizC[][], int matriz[][]){

        int cont=0;
        
        for (int i=0; i<matrizC.length; i++){
            for (int j=0; j<matrizC[i].length; j++){
                if (matrizC[i][j] == (-1)*matriz[j][i]){
                    cont++;
                }
            }
        }
        
        if (cont == matrizC.length*matrizC[0].length){
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("la matriz NO es antisimetrica");
        }
    }

}