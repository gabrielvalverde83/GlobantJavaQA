package enc29.pkg39.ejerc;

/**
 Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. 
 */

import java.util.Scanner;

public class EjExtra12 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una x para salir del contador");
                
        String letra;
        int contU = 0;
        int contD = 0;
        int contC = 0;
        String contUS, contDS, contCS;
        
        do {
            
            contUS = String.valueOf(contU);
            contDS = String.valueOf(contD);
            contCS = String.valueOf(contC);
            
            if (contUS.equals("3")) {contUS = "E";}
            if (contDS.equals("3")) {contDS = "E";}
            if (contCS.equals("3")) {contCS = "E";}
            
            System.out.println(contCS + " - " + contDS + " - " + contUS);
            letra = leer.next();
            
            if (contU == 9 && contD ==9 && contC ==9){
            
                break;
            
            } else if (contU == 9 && contD == 9){
                
                contC++;
                contU = 0;
                contD = 0;
                
            } else if ( contU == 9){
            
                contD++;
                contU = 0;
          
            } else {
            
                contU++;
            }
        } while (!letra.equals("x"));

    }
    
}
