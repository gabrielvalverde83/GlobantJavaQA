package enc29.pkg39.ejerc;

/**
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran 
por debajo de 1.60 mts. y el promedio de estaturas en general.
 */

import java.util.Scanner;

public class EjExtra06 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de personas");
        
        int cantP = leer.nextInt();
        int altura; 
        int sumaAltura = 0;
        int sumaAlturaCh = 0;
        int cont = 0;
        
        System.out.println("Ingrese la altura de las personas en cm");
        
        for (int i=0; i<cantP; i++){
            
            altura = leer.nextInt();
            sumaAltura= sumaAltura + altura;
            
            if (altura < 160){
                sumaAlturaCh = sumaAlturaCh + altura;
                cont++;
            }
        }
        
        System.out.println("El promedio de altura general es:" + sumaAltura/cantP + " cm");
        
        if (cont>0){
        System.out.println("El promedio de altura menor a 1.6m es: " + sumaAlturaCh/cont + " cm");
        } else {
            System.out.println("No hay personas menores a 1.6m ");
        }
    }
    
}
