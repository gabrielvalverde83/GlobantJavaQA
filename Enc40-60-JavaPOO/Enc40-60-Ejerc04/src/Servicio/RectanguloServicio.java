package Servicio;

import Entidades.Rectangulo;
import java.util.Scanner;

public class RectanguloServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
    
        Rectangulo r1 = new Rectangulo();
        
        System.out.println("Ingrese la base del rectángulo");
        r1.setBase(leer.nextInt());
        System.out.println("Ingrese la altura");
        r1.setAltura(leer.nextInt());
        
        return r1;
    }
    
    public void superficie(Rectangulo r1){
    
        int superficie = r1.getBase()*r1.getAltura();
        System.out.println("La superficie es: " + superficie);
    }
    
    public void perimetro(Rectangulo r1){
        
        double perimetro = Math.pow(r1.getBase()+r1.getAltura(), 2);
        System.out.println("El perimetro es: " + perimetro);
    }
}
