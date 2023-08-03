package enc29.pkg39.ejerc;

/**
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el 
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
*   60 min = 1h
*   1140 min = 1dia
 **/

import java.util.Scanner;

public class EjExtra01 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tiempo en minutos");
        
        int tpoIngresado = leer.nextInt();
        
        double dias = Math.floor(tpoIngresado/1140);   //min a dias - devuelve el entero más cercano por debajo
        
        double horas = Math.floor((tpoIngresado - dias*1140)/60);    //horas restando los dias
        
        double minutos = tpoIngresado - dias*1140 - horas*60;
        
        System.out.println("Equivale a :" + dias + " dias, " + horas + " horas y " + minutos + " minutos");
    }
    
}
