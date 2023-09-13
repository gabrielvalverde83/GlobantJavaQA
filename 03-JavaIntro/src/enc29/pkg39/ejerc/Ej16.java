package enc29.pkg39.ejerc;

//Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida 
//al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
//numero y si se encuentra repetido

import java.util.Scanner;
//import java.util.Random;

public class Ej16 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
               
        System.out.println("Ingrese la dimensión del vector");
        int dimension = leer.nextInt();
        
        int [] vector = new int [dimension];
        
        System.out.println("Ingrese en número que desea encontrar: ");
        int numEncontrar = leer.nextInt();       
        
        rellenar (vector);
        
        imprimirV (vector);
        
        encontrar (vector, numEncontrar);

        }


    public static void rellenar(int vector[]){
        
        for (int i=0; i<vector.length; i++){
            vector[i] = (int)(Math.random()*10);
        }
    }

    public static void imprimirV(int vector[]){
        
        String aux = "";
        
        System.out.println("El Vector: ");

        for (int elemento: vector){
            aux = aux + "[" + elemento + "]"; 
        }
        System.out.println(aux);
    }
    
    public static void encontrar (int vector [], int numEncontrar){
        int coincidencia = 0;
        
        for (int i=0; i<vector.length; i++){
           if (vector[i]==numEncontrar ){
               System.out.println("coincidencia en: " + i);
               coincidencia ++;
           } 
        }   
        
        if (coincidencia == 0){
            System.out.println("No se encontraron coincidencias");
        }
    }

}

