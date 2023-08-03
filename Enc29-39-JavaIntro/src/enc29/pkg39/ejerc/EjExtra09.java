package enc29.pkg39.ejerc;

/**
 Simular la división usando solamente restas. Dados dos números enteros mayores que 
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, 
este resultado es el residuo, y el número de restas realizadas es el cociente. 
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada 
37 – 13 = 24 dos restas realizadas 
50
24 – 13 = 11 tres restas realizadas 
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */

import java.util.Scanner;

public class EjExtra09 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el cociente de una division");
        System.out.println("Ingrese el divisor de una division");        
        
        int num1, num2, num3;
        int cont = 0;
        
        do {
            System.out.println("Los numeros ingresados deben ser mayor a 1");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
            
        } while(num1 < 1 || num2 < 1);
        
        System.out.println("Dividir : " + num1 + "/" + num2);
        
        do {
        
            num3 = num1 - num2;
            num1 = num3;
            cont++;
        
        } while (num3 > num2);
        
        System.out.println("El cociente es:" + cont);
        System.out.println("El residuo es " + num3);
        
    }
    
}
