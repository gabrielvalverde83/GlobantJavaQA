package Servicio;

import Entidades.Matematica;

public class MatematicaServicio {
    
    public static Matematica crearMatematica(){
        
        Matematica m = new Matematica();
        
        Matematica.setNum1(Math.random()*10+1);
        System.out.println("Número 1: " + Matematica.getNum1());
        Matematica.setNum2(Math.random()*10+1);
        System.out.println("Número 2: " + Matematica.getNum2());
        
        return m;
    }
    
    public static void devolverMayor(Matematica m){
    
        Matematica.setMayor(Math.max(Matematica.getNum2(), Matematica.getNum1()));
        Matematica.setMenor(Math.min(Matematica.getNum1(), Matematica.getNum2()));
        
        if (Matematica.getNum1() > Matematica.getNum2()){System.out.println("El número 1 es mayor que el 2");}
        if (Matematica.getNum1() < Matematica.getNum2()){System.out.println("El número 2 es mayor que el 1");}
        if (Matematica.getNum1() == Matematica.getNum2()){
            System.out.println("Los números son iguales");
            System.out.println("Se define como mayor el num1 y como menor el num2");
            Matematica.setMayor(Matematica.getNum1());
            Matematica.setMenor(Matematica.getNum2());
        }
    }
    
    public static void calcularPotencia(Matematica m){
        
        int mayor = (int)Math.floor(Matematica.getMayor());
        int menor = (int)Math.floor(Matematica.getMenor());
        int resultado = (int)Math.pow(mayor, menor);
        
        System.out.println("Potencia: " + mayor + "^" + menor + " = " + resultado);
    }
    
    public static void calcularRaiz(Matematica m){
    
        double resultado = Math.sqrt(Math.abs(Matematica.getMenor()));
        
        System.out.println("La raiz cuadrada del " + Matematica.getMenor() + " = " + resultado);
    }
    
}
    

