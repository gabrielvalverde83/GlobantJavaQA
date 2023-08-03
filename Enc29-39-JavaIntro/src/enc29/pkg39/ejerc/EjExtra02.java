package enc29.pkg39.ejerc;

/**
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada 
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, 
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores 
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */

import java.util.Scanner;

public class EjExtra02 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor de tipo de entero para: A, B, C y D");
        
        int a = leer.nextInt();
        int b = leer.nextInt();
        int c = leer.nextInt();
        int d = leer.nextInt();
        
        int aux = a;
        
        a = d;
        d = b;
        b = c;
        c = aux;
        
        System.out.println("A = " + a + ", B = " + b + ", C = " + c + ", D = " + d);
    }
    
}
