package Servicios;

import Entidades.Cine;

public class CineServicios {
    
    ArrayList<String> asientosLibres
  
    public void crearCine(Cine butacas){
    
        int filas = 8;  //del 1 al 8
        int columnas = 6; // de la A a la F

        String[][] filasCine = new String[filas * columnas][3];

        int contNum = 1;
        char contLet = 'F';
        int contRep = 0;

        for (int i = 0; i < filas * columnas; i++) {
            contRep++;
            filasCine[i][0] = String.valueOf(contNum);
            filasCine[i][1] = String.valueOf(contLet);
            contLet = (char) (contLet - 1);
            filasCine[i][2] = " ";
            if (contRep == columnas) {
                contNum++;
                contLet = 'F';
                contRep = 0;
            }
        }
        
        imprimirM(filasCine, filas, columnas);
        
        butacas.setMatriz(filasCine);
    }
    
    /*************************************************************************************************/
    /*************************************************************************************************/
    /*************************************************************************************************/    
    
    public static void imprimirM(String matriz[][], int filas, int columnas){
        
        System.out.println("Matriz: ");
        int cont = filas*columnas-1;
        
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print("[" + matriz[cont][0] + " " + matriz[cont][1] + " " + matriz[cont][2] + "]");
                cont--;
            }
            System.out.println("");
        }
    }
    
    /*************************************************************************************************/
    /*************************************************************************************************/
    /*************************************************************************************************/    
    
    public void asientosLibres(){
    
    
    
    
    
    }
    
    
    
    
    
    
}


    
    

