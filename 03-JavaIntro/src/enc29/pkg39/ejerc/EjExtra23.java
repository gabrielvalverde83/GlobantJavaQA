package enc29.pkg39.ejerc;



/**
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida 
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que 
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, 
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima 
por pantalla la sopa de letras creada. 
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones 
de Java substring(), Length() y Math.random().
 */

import java.util.Arrays;
import java.util.Scanner;

public class EjExtra23 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        /* definir matriz  ****************************************/
        
        System.out.println("*********************** SOPA DE LETRAS ***********************");
                
        int n = 20;
        
        int m = 20;
        
        String [][] matriz = new String [n][m];
        
        for (String[] fila:matriz)      //lleno toda la matriz con "-"
            Arrays.fill(fila,"-");

        /* cargar palabra ****************************************/
        
        System.out.println("Ingrese la cantidad de palabras a ingresar"
                + "\nEste valor debe ser mayor a 1 y menor a " + n);
        
        int ingresosMax;
        do{
            ingresosMax = leer.nextInt();
            if(ingresosMax < 1 || ingresosMax > n){System.out.println("Error - debe ingresar un numero mayor a 1 y menor a: " + n);}
        }while (ingresosMax < 1 || ingresosMax > n);
        
        String palabra;
        int longPalabra;
        int fila;
        int columna;
        boolean cabe;
        
        for(int i=0; i<ingresosMax; i++){
            System.out.println("Ingrese la " + (i+1) +  "° palabra de una longitud entre 3 y 5 caracteres");
            
            do{
                palabra = leer.next();
                longPalabra = palabra.length();
                if (longPalabra < 3 || longPalabra > 5){System.out.println("Error - Recuerde, entre 3 y 5 caracteres");}
            } while(longPalabra < 3 || longPalabra > 5);

            /* ingresar posicion y revisar si en esa fila ya se coloco una palabra ****************************************/
            /*Otra forma que se me ocurrio de validar para no llenar la matriz de "-" y hacerlo, creo yo,  más prolijo es mediante un vector de tamaño 20 e ir almacenando
            las filas que vamos usando alli y cada vez que vamos a ingresar una nueva palabra en una nueva fila revisar que no la hallamos ocupado
            Si tengo un tiempito la voy a hacer asi*/

            System.out.println("Ingrese en la posición que la quiere ingresar. Primero la fila:");
            {System.out.println("La fila debe ser mayor o igual a 1 y menor a: " + (matriz.length));}
            
            do{
                do{
                    fila = leer.nextInt()-1;
                    if (fila > matriz.length-1 || fila < 0){System.out.println("Error - La fila debe ser mayor o igual a 1 y menor o igual a: " + (matriz.length));}
                } while (fila > matriz.length-1 || fila < 0);
                if (!(matriz[fila][0]).equals("-")){System.out.println("Error - Esta fila ya está ocupada - Ingrese una nueva fila");}
            }while(!(matriz[fila][0]).equals("-"));
            
            System.out.println("Ahora ingrese la columna donde comienza la palabra");
            System.out.println("La columna debe ser mayor o igual a 1 y menor o igual a: " + matriz[i].length);
            System.out.println("Tenga en cuenta que debe entrar la palabra");

            do{
                columna = leer.nextInt()-1;
                cabe = (matriz[i].length-columna) >= longPalabra;
                if (cabe == false || columna<0) {System.out.println("En la posición de la columna elegida, la palabra no cabe o está fuera de rango de la matriz - Elija una posición menor");}
            }while(cabe == false || columna<0);

            colocarPalabra(matriz, fila, columna, palabra, longPalabra);
            
            rellenar(matriz, fila);
            
            }
        
        rellenar2(matriz);
        
        imprimirM(matriz);
        
    }
    
    /***********************************************************************************************************************/
    
    public static void colocarPalabra(String matriz[][], int fila, int columna, String palabra, int longPalabra){
        
       int cont = 0; 
       for(int j=columna; j<(columna + longPalabra);j++){
           matriz[fila][j] = palabra.substring(cont, cont+1);
           cont++;
       }
    }
    
    /***********************************************************************************************************************/
    
    public static void rellenar(String matriz[][],int fila){
        
        int numero;
                
        for (int j=0; j<matriz[fila].length; j++) {
                if (matriz[fila][j].equals("-")){
                    numero = (int)(Math.random()*10);
                    matriz[fila][j] = String.valueOf(numero);
                }
            
        }
    }
    
    /***********************************************************************************************************************/
    
    public static void rellenar2(String matriz[][]){
        
        int numero;
                
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++){
                if (matriz[i][j].equals("-")){
                    numero = (int)(Math.random()*10);
                    matriz[i][j] = String.valueOf(numero);
                }
            }
        }
    }
    
    
    
    /***********************************************************************************************************************/
    
    public static void imprimirM(String matriz[][]){
        
        String aux;
        
        System.out.println("Matriz: ");

        for (String [] fila: matriz){
            aux = "";
            for (String elemento:fila){
            aux = aux + "[" + elemento + "]"; 
            }
        System.out.println(aux);
        }
    }
    
}
