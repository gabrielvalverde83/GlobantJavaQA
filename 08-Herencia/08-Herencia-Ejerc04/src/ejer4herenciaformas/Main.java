package ejer4herenciaformas;

import Entidades.Rectangulo;
import Entidades.Circulo;

public class Main {


    public static void main(String[] args) {
        Circulo circulo = new Circulo(2,3);
        circulo.area();
        circulo.perimetro();
        
        Rectangulo rectangulo = new Rectangulo(5,2);
        rectangulo.area();
        rectangulo.perimetro();
    }
    
}
