package enc29.pkg39.ejerc;

/**
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de 
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la 
cantidad de hijos para averiguar la media de edad de los hijos de todas las familias
 */

import java.util.Scanner;

public class EjExtra14 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de familias");
        int cantFamilias = leer.nextInt();
        
        double [] vector = new double [cantFamilias];
        
        double cantHijos, edad, sumaEdad;
                
        for (int i = 0; i < cantFamilias; i++ ) {
            System.out.println("Ingrese la cantidad de hijos de la familia " + (i+1));
            cantHijos = leer.nextInt(); 
            sumaEdad = 0;
            
            System.out.println("Ingrese las edades de los hijos");
            for (int j=0; j<cantHijos; j++){
                edad = leer.nextInt();
                sumaEdad = sumaEdad + edad;
            }
            
            vector[i] = sumaEdad/cantHijos;
        }
        
        imprimirV( vector);
    }

    public static void imprimirV(double vector[]){
        
        String aux = "";
        System.out.println("Las media de edades de cada familia es: ");

        for (double elemento: vector){
            aux = aux + "[" + elemento + "]"; 
        }
        
        System.out.println(aux);
    }
}
