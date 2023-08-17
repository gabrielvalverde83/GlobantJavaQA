package pkg1.utilesdeusogeneral;

public class random {

    public static void main(String[] args) {
        
        int [] vector = new int [15];
        
        rellenar (vector);
        
        imprimir (vector);
        
        rellenar2 (vector);     //aleatorios con rango
        
        imprimir (vector);
        
        rellenar3 (vector);     //aleatorios con rango
        
        imprimir (vector);
   
    }
    
    /********************************************************************************************************/
    /********************************************************************************************************/
    /********************************************************************************************************/
    
    // imprimir
    
    public static void imprimir(int vector[]){
        
        String aux = "";
        
        System.out.println("El Vector: ");
        for (int elemento: vector){
            aux = aux + "[" + elemento + "]"; 
        }
        System.out.println(aux);
    }
    
    /********************************************************************************************************/
    /********************************************************************************************************/
    /********************************************************************************************************/
    
    // rellenar aleatorio entre 0 y 9
        

    public static void rellenar(int vector[]){
        
        for (int i=0; i<vector.length; i++){
            vector[i] = (int)(Math.random()*10);    //aleatorio entre 0y9
        }
    }
    
    public static void rellenar2(int vector[]){
        
        for (int i=0; i<vector.length; i++){
            vector[i] = (int)(Math.random()*10+1);    //aleatorio entre 1y10
            //vector[i] = (int)(Math.random()*10+3);    //aleatorio entre 3y12
        }
    }
    
    /********************************************************************************************************/
    /********************************************************************************************************/
    /********************************************************************************************************/
    
    // rellenar aleatorio entre 5 y 15
    /*
        Obtener un numero entre 5 y 15
        int numero = (int)(Math.random()*(X-Y+1)+Y;
        Si le sacamos el +1 no incluye al 15
        */
    
    
    public static void rellenar3(int vector[]){
        
        for (int i=0; i<vector.length; i++){
            vector[i] = (int)(Math.random()*(15-5+1)+5);
        }
    }
}
