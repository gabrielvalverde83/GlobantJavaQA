package pkg1.utilesdeusogeneral;

import java.util.Scanner;

public class Varios {

    public static void main(String[] args) {
        
        Scanner leer   = new Scanner(System.in);

        //conversion de double a entero más cercano
                
        System.out.println("Ingrese el tiempo en minutos");
        
        int tpoIngresado = leer.nextInt();
        
        double dias = Math.floor(tpoIngresado/1140);   //min a dias - devuelve el entero más cercano por debajo
        
        /********************************************************************************************************/
        /********************************************************************************************************/
        /********************************************************************************************************/

        // conversion de entero a String
        
        int contU = 0;

        String contUS;
        
        contUS = String.valueOf(contU);
        
        
        
    }
    
}
