package enc29.pkg39.ejerc;

import java.util.Scanner;

/**
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la 
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los 
elementos).
 */
public class EjExtra19 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese la dimension de los vectores");
        int dimension = leer.nextInt();
        
        
        int vectorA [] = new int [dimension];
        int vectorB [] = new int [dimension];
        char nombreV;

        rellenar(vectorA);
        rellenar(vectorB);
        nombreV = 'A';
        imprimirV(vectorA, nombreV);
        nombreV = 'B';
        imprimirV(vectorB, nombreV);
        
        revisar(vectorA, vectorB);
    }
    
    public static void rellenar(int vector[]){
        
        for (int i=0; i<vector.length; i++){
            vector[i] = (int)(Math.random()*(1-0+1)+0);
            //vector[i] = 0;    //para probar
        }
    }

    public static void imprimirV(int vector[], char nombreV){
        
        String aux = "";
        
        System.out.println("El Vector: " + nombreV);

        for (int elemento: vector){
            aux = aux + "[" + elemento + "]"; 
        }
        System.out.println(aux);
    }
    
    public static void revisar(int vectorA[], int vectorB[]){
        
        int cont = 0;
        
        for(int i=0; i<vectorA.length; i++){
            if(vectorA[i] == vectorB[i]){
                cont++;
            } else {
                System.out.println("No coinciden los vectores");
                break;
            }
        }    
        
        if (cont == vectorA.length){
            System.out.println("Los vectores SI coinciden");
        }
    }
}
    
