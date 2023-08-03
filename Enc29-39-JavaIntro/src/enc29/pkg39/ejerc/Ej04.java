package enc29.pkg39.ejerc;

//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
//Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

import java.util.Scanner;

public class Ej04 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        double grados = leer.nextDouble();
                
        double F = 32 + (9*grados/5);
        
        System.out.println(F);       
        
    }
    
}
