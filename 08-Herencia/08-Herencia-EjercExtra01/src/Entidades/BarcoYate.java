package Entidades;


import Entidades.Barco;

public class BarcoYate extends Barco {

    private int numCamarotes;

    private int potenciaCV;

    public BarcoYate() {
    }

    public BarcoYate(int numCamarotes, int potenciaCV, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numCamarotes = numCamarotes;
        this.potenciaCV = potenciaCV;
    }

    @Override
    public int modulo() {
        return super.modulo() + numCamarotes + potenciaCV;
    }
    
    public void crearYate(BarcoYate by){
        super.crearBarco(by);
        System.out.println("Ingrese numero de camarotes: ");
        by.numCamarotes = leer.nextInt();
        System.out.println("Ingrese potencia en CV: ");
        by.potenciaCV = leer.nextInt();
    }
    
}
