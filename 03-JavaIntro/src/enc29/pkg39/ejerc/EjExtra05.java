package enc29.pkg39.ejerc;

/*
 Una obra social tiene tres clases de socios: 
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
todos los tipos de tratamientos. 
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento 
para los mismos tratamientos que los socios del tipo A. 
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos 
tratamientos. 
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor 
real que represente el costo del tratamiento (previo al descuento) y determine el 
importe en efectivo a pagar por dicho socio.
 */

import java.util.Scanner;

public class EjExtra05 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
   
        String tipo;
        int tratamiento = 1000;
        
        do {
            
            System.out.println("Ingrese el tipo de socio: A, B o C");
            tipo = leer.next();
            tipo = tipo.toLowerCase();
            
        } while (!tipo.equals("a") && !tipo.equals("b") && !tipo.equals("c") );
        
        System.out.println("El costo del tratamiento es $ " + tratamiento);
        
        switch(tipo){
            case "a":
                System.out.println("Por ser un socio tipo A, obtiene un desc. del 50% y pagará: $" + tratamiento*0.5);
                break;
            case "b":
                System.out.println("Por ser un socio tipo B, obtiene un desc. del 35% y pagará: $" + tratamiento*0.65);
                break;
            case "c":
                System.out.println("Por ser un socio tipo C, debe abonar el total del tratamiento, es decir $" + tratamiento);
                break;
        }
        
        
        
    }
    
}
