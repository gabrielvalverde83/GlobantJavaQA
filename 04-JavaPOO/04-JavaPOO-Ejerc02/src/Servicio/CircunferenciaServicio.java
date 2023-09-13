package Servicio;

import Entidades.Circunferencia;
import java.util.Scanner;

public class CircunferenciaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Circunferencia crearCircunferencia(){
        
        Circunferencia c1 = new Circunferencia();
            
        System.out.println("Ingrese el radio de la circunferencia");
        c1.setRadio(leer.nextDouble());
        
        return c1;
    
    }
    
    public void calcularArea(Circunferencia c1){
        
        double area =  Math.PI * Math.pow(c1.getRadio(),2);
        System.out.println("El area de la circunferencia es: " + area);
    
    }
    
    public void calcularPerimetro(Circunferencia c1){
        
        double perimetro = 2 * Math.PI * c1.getRadio();
        System.out.println("Y el perímetro es: " + perimetro);

    }
    
    
    
}
