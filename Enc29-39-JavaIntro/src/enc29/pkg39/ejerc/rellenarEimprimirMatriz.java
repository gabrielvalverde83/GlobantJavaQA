package enc29.pkg39.ejerc;

public class rellenarEimprimirMatriz {

    public static void main(String[] args) {
        
        int [][] matriz = new int [8][10];
          
        rellenar (matriz);
        
        imprimirM (matriz);
        
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
        
        System.out.println("Matriz: ");

        for (int [] fila: matriz){
            aux = "";
            for (int elemento:fila){
            aux = aux + "[" + elemento + "]"; 
            }
        System.out.println(aux);
        }
    }
    
        /*
    public static void rellenar(int matriz[][]){
        
        for (int i=0; i<matriz.length; i++) {
            for (int j = 0; j<matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random()*10);
            }
        }
    }
    */
}
  
