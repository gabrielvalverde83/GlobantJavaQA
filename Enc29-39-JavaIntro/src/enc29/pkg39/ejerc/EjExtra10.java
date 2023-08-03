package enc29.pkg39.ejerc;

/**

 */

import java.util.Scanner;

public class EjExtra10 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num1 = (int)(Math.random()*(10-0+1)+0);
        int num2 = (int)(Math.random()*(10-0+1)+0);
        
        int producto = num1*num2;
        int respuesta;
        
        //System.out.println(num1 + " * " + num2);  //pare revisar funcionamiento
        
        System.out.println("Ingrese una respuesta para adivinar el producto de 2 números entre 0 y 10");
        System.out.println("Ingrese 111 si se cansó y desea salir");
        
        do {
            
            respuesta = leer.nextInt();
            
            if (producto != respuesta){
                System.out.println("Error - Reintente");
            } else {
                System.out.println("Felicitaciones, le acertó");
            }
        
        } while (producto != respuesta || respuesta != 111 );
    }
}
