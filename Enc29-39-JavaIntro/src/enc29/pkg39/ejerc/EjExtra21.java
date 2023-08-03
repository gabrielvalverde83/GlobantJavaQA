package enc29.pkg39.ejerc;

import java.util.Scanner;

/**
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas 
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y 
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por 
trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del 
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y 
52
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o 
igual al 7 de sus notas del curso.

 */
public class EjExtra21 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de alumnos");
       
        int cantAlumnos = leer.nextInt();
        
        double [][] matriz = new double [cantAlumnos][5];
          
        rellenar (matriz);
        
        calcularNota (matriz, cantAlumnos);
        
        imprimirM (matriz);
        
    }

    public static void rellenar(double matriz[][]){
        
        for (double[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length - 1; j++) {
                matriz1[j] = (int)(Math.random()*10+1);
            }
        }
    }
    
    public static void calcularNota(double matriz[][], int cantAlumnos){
        
        int cont = 0;
        
        for (int i=0; i<matriz.length; i++) {
            matriz[i][4] = matriz[i][0] * 0.1 + matriz[i][1] * 0.15 + matriz[i][2] * 0.25 + matriz[i][3] * 0.5;
            if (matriz[i][4] >= 7) {
                cont++;
            }
        }
        
        System.out.println("Hay: " + cont + " aprobados");
        System.out.println("Hay: " + (cantAlumnos - cont) + " desprobados");
        
    }
    
    

    public static void imprimirM(double matriz[][]){
        
        String aux;
        
        System.out.println("Matriz: ");

        for (double [] fila: matriz){
            aux = "";
            for (double elemento:fila){
            aux = aux + "[" + elemento + "]"; 
            }
        System.out.println(aux);
        }
    }
}
