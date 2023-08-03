package enc29.pkg39.ejerc;

public class rellenarEimprimirVector {

    public static void main(String[] args) {
        
        int [] vector = new int [10];
          
        rellenar (vector);
        
        imprimirV (vector);
        
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
}
