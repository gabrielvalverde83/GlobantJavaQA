package enc29.pkg39.ejerc;

/**
Crear un programa que dibuje una escalera de números, donde cada línea de números 
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al 
usuario al comenzar. Ejemplo: si se ingresa el número 3: 
1
12
123
 */

import java.util.Scanner;

public class EjExtra13 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número para hacer una escalera");
        int escalones = leer.nextInt();
        
        String escalonesS = "";
        
        for (int i=1; i<=escalones; i++){
        
            escalonesS = escalonesS + String.valueOf(i);

            System.out.println(escalonesS);
        }
    }
}
