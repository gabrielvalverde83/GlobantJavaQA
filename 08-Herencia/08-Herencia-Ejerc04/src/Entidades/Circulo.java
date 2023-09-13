package Entidades;

import Interfaces.calculosFormas;

public class Circulo implements calculosFormas{
    private double radio, diametro;

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public void area() {
        double area = PI * (Math.pow(radio, 2));
        System.out.println("Area del circulo: "+area);
    }

    @Override
    public void perimetro() {
        double peri = PI * diametro;
        System.out.println("Diametro del circulo: "+peri);
    }
}
