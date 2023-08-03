package enc29.pkg39.ejerc;

import java.util.Scanner;


public class validaciones {

    public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in);
    
    String palabra = "hola";
    int longPalabra = palabra.length();
    int columna = 0;
    boolean cabe = true;
    String matriz [][] = new String[10][10];
    int i = 0;

    
    /********************************************************************************************************/
    //ingreso de numeros
    
    int ingresosMax=0;
    int max = 10;
    boolean validacion;

        do {
            System.out.println("Ingrese un numero cuyo valor debe ser mayor a 1 y menor a " + max );
            
            validacion = true;    
            try {
                    ingresosMax = Integer.parseInt(leer.next());
            }catch (Exception e) {
                validacion = false;
                System.out.println("Error - Ingrese un número valido");
            }
            if(validacion == false || ingresosMax < 1 || ingresosMax > max){System.out.println("ERROR");}
        } while (validacion == false || ingresosMax < 1 || ingresosMax > max);

    System.out.println("Paso Validacion" + ingresosMax);
    
    /********************************************************************************************************/
    //ingreso tamaño palabra
    
    do{
        palabra = leer.next();
        longPalabra = palabra.length();
        if (longPalabra < 3 || longPalabra > 5) {
            System.out.println("Error - Recuerde, entre 3 y 5 caracteres");
        }
    } while(longPalabra < 3 || longPalabra > 5);

    /********************************************************************************************************/
    //ingreso tamaño palabra y que sea una letra, no numeros
    
    do{
        palabra = leer.next();
        longPalabra = palabra.length();
        if (longPalabra < 3 || longPalabra > 5) {
            System.out.println("Error - Recuerde, entre 3 y 5 caracteres");
        }
    } while(longPalabra < 3 || longPalabra > 5);


    /********************************************************************************************************/
    //palabra que entre en una columna de matriz
    
    do{
        columna = leer.nextInt() - 1;
        cabe = (matriz[i].length - columna) >= longPalabra;
        if (cabe == false || columna < 0) {
            System.out.println("En la posición de la columna elegida, la palabra no cabe o está fuera de rango de la matriz - Elija una posición menor");
        }
    }while(cabe == false || columna<0);
}
}   
