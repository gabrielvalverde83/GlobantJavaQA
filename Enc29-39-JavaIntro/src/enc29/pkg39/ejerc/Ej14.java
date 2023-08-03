package enc29.pkg39.ejerc;

/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */

import java.util.Scanner;

public class Ej14 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de euros: ");
        double cant = leer.nextDouble();
        
        System.out.println("\nIngrese la opción correspondiente"
            +"\n1-Dolar"
            +"\n2-Yenes"
            +"\n3-Libras");
        
        int moneda = leer.nextInt();
        
        while (moneda<1 || moneda > 3){
            System.out.println("Opción invalida. Ingrese una opción correcta");
            moneda = leer.nextInt();
        }
        
        double euros;
        
        switch(moneda){
            case 1:
                euros = 1.28611 * cant;
                System.out.println("Eros $ " + cant + " son Dolares $ "+ euros);
                break;
            case 2:
                euros = 129.852 * cant;
                System.out.println("Eros $ " + cant + " son Yenes $ "+ euros);
                break;
            case 3:
                euros = 0.86 * cant;
                System.out.println("Eros $ " + cant + " son Libras $ "+ euros);
                break;
        }

    }
   
}
