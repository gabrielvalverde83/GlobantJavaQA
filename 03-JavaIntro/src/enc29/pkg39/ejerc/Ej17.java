package enc29.pkg39.ejerc;

//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos 
//de 2 dígitos, etcétera (hasta 5 dígitos

import java.util.Scanner;
//import java.util.Random;

public class Ej17 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        //Random rand = new Random();
        
        System.out.println("Ingrese la dimensión del vector");
        int dimension = leer.nextInt();
        
        int [] vector = new int [dimension];
        
        String aux = "";
        
        System.out.println("El Vector: ");
        
        String numCadena;
        int cant1 = 0;
        int cant2 = 0;
        int cant3 = 0;
        int cant4 = 0;
        int cant5 = 0;
        
        rellenar (vector);
        
        for (int elemento: vector){
            aux = aux + " " + elemento;
            
            numCadena = String.valueOf(elemento);
            switch (numCadena.length()){
                case 1:
                    cant1 ++;
                    break;
                case 2:
                    cant2 ++;
                    break;
                case 3:
                    cant3 ++;
                    break;
                case 4:
                    cant4 ++;
                    break;
                case 5:
                    cant5 ++;
                    break;
            }
       }
        
        System.out.println(aux);
        System.out.println("\nResultados: "
                + "\nHay " + cant1 + " números de 1 cifra"
                + "\nHay " + cant2 + " números de 2 cifra"
                + "\nHay " + cant3 + " números de 3 cifra"
                + "\nHay " + cant4 + " números de 4 cifra"
                + "\nHay " + cant5 + " números de 5 cifra"
        );
    
    }

    public static void rellenar(int vector[]){
        
        for (int i=0; i<vector.length; i++){
            vector[i] = (int)(Math.random()*100000);
        }
    }
}
