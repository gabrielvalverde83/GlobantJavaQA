package pkg1.utilesdeusogeneral;

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
    /********************************************************************************************************/
    /********************************************************************************************************/
    
    //ingreso de numeros con try & catch
     
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
    /********************************************************************************************************/
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
    /********************************************************************************************************/
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
    /********************************************************************************************************/
    /********************************************************************************************************/
    
    //ingreso opciones de letra
    
        String tipo;

        do {
            System.out.println("Ingrese el tipo de socio: A, B o C");
            tipo = leer.next();
            tipo = tipo.toLowerCase();
            if (!tipo.equals("a") && !tipo.equals("b") && !tipo.equals("c")) {
                System.out.println("Error - Ingrese opción válida");
            }
        } while (!tipo.equals("a") && !tipo.equals("b") && !tipo.equals("c"));
    
    /********************************************************************************************************/
    /********************************************************************************************************/
    /********************************************************************************************************/
    
    //ingreso opciones de numeros
    
        
        int opcN;
        String opcL = "";
        int resultado;
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();;

        do {
            System.out.println("Ingrese una opcion");
            opcN = leer.nextInt();

            switch (opcN) {
                case 1:
                    System.out.println("La suma de los números es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de los números es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("El producto de los números es: " + (num1 * num2));
                    break;
                case 4:
                    resultado = num1 / num2;
                    System.out.println("La division de los números es: " + resultado);
                    break;
                case 5:
                    System.out.println("Está seguro que desea salir?");
                    opcL = leer.next();
                    break;
            }

        } while (opcN != 5 || !opcL.equals("S"));

    /********************************************************************************************************/
    /********************************************************************************************************/
    /********************************************************************************************************/
    
    //palabra que entre en una columna de matriz
    
    do{
        columna = leer.nextInt() - 1;
        cabe = (matriz[i].length - columna) >= longPalabra;
        if (cabe == false || columna < 0) {
            System.out.println("En la posición de la columna elegida, la palabra no cabe o está fuera de rango de la matriz - Elija una posición menor");
        }
    }while(cabe == false || columna<0);
    
    
    
    
    
    
    
    
    
    
    
    
    /********************************************************************************************************/
    /********************************************************************************************************/
    /********************************************************************************************************/
    
    //seguir ingresando info o confirmar algo?
    
    String respuesta;
    
    do {
        //hacer algo propio del ejercicio
        System.out.println("Desea ingresar otro? S o N");
        do {
            respuesta = leer.next().toUpperCase();
            if (!respuesta.equals("S") && !respuesta.equals("N")) {
                System.out.println("Error - Ingrese S o N");
            }
        } while (!respuesta.equals("S") && !respuesta.equals("N"));
    } while (respuesta.equals("S"));
    
    
    
    
    
    
    
    
    
    
    
    }
}   
