package enc40.pkg60.ejerc10;

import java.util.Arrays;

/**
 Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A 
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El 
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. 
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números 
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 
20. 

 */

public class Enc4060Ejerc10 {

    public static void main(String[] args) {
        
        double vectorA[] = new double[50];
        double vectorB[] = new double[20];
        
        rellenar(vectorA);
        imprimir(vectorA);
        
        ordenar(vectorA);
        imprimir(vectorA);
        
        copiar(vectorA, vectorB);
        imprimir(vectorB);
        
        rellenar2(vectorB);
        imprimir(vectorB);
    }
    
    public static void rellenar(double vector[]){
        
        for (int i=0; i<vector.length; i++){
            vector[i] = (double)(Math.random()*10); //entre 0 y 9
        }
    }
  
  
    public static void imprimir(double vector[]){
    
        System.out.println(Arrays.toString(vector));
    }
    
    
//    public static void imprimir(double vector[]){
//        
//        String aux = "";
//        
//        System.out.println("El Vector: ");
//
//        for (double elemento: vector){
//            aux = aux + "[" + elemento + "]"; 
//        }
//        System.out.println(aux);
//    }
    
    public static void ordenar(double vectorA[]){
    
        Arrays.sort(vectorA);
            
    }
    
    public static void copiar(double vectorA[], double vectorB[]){
        
        System.arraycopy(vectorA, 0, vectorB, 0, 10);
    }
    
        
    public static void rellenar2 (double vector[]){
    
        Arrays.fill(vector, 10, 19, 0.5); 
        
        //Arrays.fill(vector, 0.5); //llena todo el array con el 0.5
        //Arrays.fill(vector, Math.random()*10);    //lena todo el vector con el mismo numero, elegido aleatoriamente
    
    }
}
