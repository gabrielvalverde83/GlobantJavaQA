package enc29.pkg39.ejerc;

//. Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 
//3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida 
//dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 
//que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al 
//menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la 
//columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
//Ejemplo

import java.util.Scanner;
import java.util.Arrays;

public class Ej21 {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int[][] matrizG = new int[10][10];
        int[][] matrizCh = new int[3][3];
        
        rellenar(matrizG);
        
        imprimir(matrizG);
        
        //Metodo para llenar toda la matriz con un mismo valor de la clase java.util.Arrays (debo importarla)
        for (int[] fila:matrizCh)
            Arrays.fill(fila,10);
        
        imprimir(matrizCh);
        
        //rellenar2(matrizG, matrizCh); //matriz de prueba para forzar el encuentro
        
        imprimir(matrizG);
        
        buscarM(matrizG, matrizCh);
        
                
    }
    
    public static void rellenar(int[][] matriz){
        
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[j] = (int)(Math.random()*100);
            }
        }
    }
    
    public static void imprimir(int matriz[][]){
        
        String aux;
        //String numCandena;
        
        System.out.println("\nMatriz:");
        //para cada fila de la matriz
        for (int[] fila:matriz){
            aux = "";
            //para cada elemento de la fila
            for(int elemento:fila){

                aux += " " + elemento; 
            }
            System.out.println(aux);
        }
    }
    
    /*
    public static void rellenar2(int [][] matriz1, int [][] matriz2){
        
        for(int i=1; i<4; i++){
            for(int j=3; j<6; j++){
                matriz1[i][j] = matriz2[i-1][j-3];
            }
        }
   
    }
    */
    
    public static void buscarM(int [][]matriz3,int [][] matriz4){
        
        int contF, contC, valorCoincide;
        int salida = 0;
        boolean encontrada = false;
        
        for(int i=0; i<matriz3.length-2; i++){
            if (encontrada == true){
                break;
            }
            for (int j=0; j<matriz3[i].length-2; j++){
                //int contFCh=0;
                if(matriz3[i][j] == matriz4[0][0]){
                    contF = i;
                    contC = j;
                    valorCoincide = 0;
                    //for(int k=contFCh; k<matriz4.length; k++){
                    for(int k=0; k<matriz4.length; k++){
                        for(int l=0; l<matriz4[i].length; l++){
                            if (matriz3[contF][contC] == matriz4[k][l]){
                                valorCoincide ++;
                                contC++;
                                salida = 0;
                            } else {
                                salida = 1;
                                break;
                            }
                        }
                        contF++;
                        contC = j;  
                        if(salida==1){
                            break;
                        }
                    }
                    if (valorCoincide == (matriz4.length*matriz4[0].length)){
                        encontrada = true;
                        System.out.println("La matriz fue encontrada, comenzando en:" + "[" + i + "]" + "[" + j + "]");
                        break;
                    } else {
                        encontrada = false;
                    }
                }
            }
        }
        
    if (encontrada == false){
        System.out.println("La matriz NO fue encontrada");
    }
        
    }



}


 