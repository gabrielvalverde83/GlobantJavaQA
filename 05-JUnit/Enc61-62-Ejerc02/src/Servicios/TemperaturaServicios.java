package Servicios;

import Entidades.Temperatura;
import java.util.Scanner;

public class TemperaturaServicios {
    
    Scanner leer = new Scanner(System.in);
    
    
    public Temperatura crearTemperatura(){
               
        Temperatura temp = new Temperatura();
        System.out.println("Ingrese la temperatura a calcurar");
        temp.setTemperaturaIngresada(leer.nextDouble());

        return temp;
    }
    
    public double calcularTemperaturaFarenheit(Temperatura temp){
        
        double resultado = (temp.getTemperaturaIngresada()*1.8)+32;
        System.out.println(temp.getTemperaturaIngresada() + " ° Celsius a ° Farenheit " + resultado);
        return resultado;
    }
    
    public double calcularTemperaturaKelvin(Temperatura temp){
        
        double resultado = temp.getTemperaturaIngresada()+273.15;
        System.out.println(temp.getTemperaturaIngresada() + " ° Celsius a ° Kelvin " + resultado);
        return resultado;
        
    }
}

