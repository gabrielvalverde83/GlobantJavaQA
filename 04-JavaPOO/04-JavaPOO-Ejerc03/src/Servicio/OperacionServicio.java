package Servicio;

import Entidades.Operacion;
import java.util.Scanner;

public class OperacionServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Operacion crearOperacion(){
    
        Operacion op1 = new Operacion();
        
        System.out.println("Ingrese el primer numero");
        op1.setNum1(leer.nextDouble());
        
        System.out.println("Ingrese el segundo numero");
        op1.setNum2(leer.nextDouble());
        
        return op1;
    }
    
    public void sumar(Operacion op1){
        double suma = op1.getNum1() + op1.getNum2();
        System.out.println("Suma: " + suma);
    }
    
    public void restar(Operacion op1){
        double resta = op1.getNum1() - op1.getNum2();
        System.out.println("Resta: " + resta);
    }
    
    public void multiplicar(Operacion op1){
        double multiplicacion;
    
        if (op1.getNum1() == 0 || op1.getNum2() == 0){
            System.out.println("Error - Multiplicación = 0");
        } else {
            multiplicacion = op1.getNum1() * op1.getNum2();
            System.out.println("Multiplicación: " + multiplicacion);
        }
    }
    
    public void dividir(Operacion op1){
        double division;
    
        if (op1.getNum2() == 0){
            System.out.println("Error - División = 0");
        } else {
            division = op1.getNum1() / op1.getNum2();
            System.out.println("División: " + division);
        }
    }
}
