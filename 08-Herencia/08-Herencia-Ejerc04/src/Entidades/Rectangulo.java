package Entidades;

import Interfaces.calculosFormas;

public class Rectangulo implements calculosFormas{
    private double base, altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void area() {
        double area = base*altura;
        System.out.println("Area del rectangulo es: "+area);
    }

    @Override
    public void perimetro() {
        double peri = (base+altura)*2;
        System.out.println("Perimetro del rectangulo es: "+peri);
    }
    
    
    
}
