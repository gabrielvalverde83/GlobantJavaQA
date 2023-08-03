package enc29.pkg39.ejerc;

/**
  Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los 
muestre por pantalla en orden descendente.
*/

public class Ej15 {

    public static void main(String[] args) {
        
        rellenar();        
        
    }
    
    public static void rellenar(){
    
        int [] vector = new int [100];

          
        //se rellena una matriz ordenada del 1 al 100
        for(int i=0;i<100;i++){
            vector[i]=i;
        }
        
        //se imprime el resultado;
        System.out.println("El resultado de la matriz es:");
        for(int i=0;i<100;i++){
            System.out.print("[" + vector[i] + "] ");
        }
        
        System.out.println(" ");
        
         //se imprime el resultado de atras para adelante;
        System.out.println("El resultado de la matriz es:");
        for(int i=99;i>=0;i--){
            System.out.print("[" + vector[i] + "] ");
        }
    
    }
}
    