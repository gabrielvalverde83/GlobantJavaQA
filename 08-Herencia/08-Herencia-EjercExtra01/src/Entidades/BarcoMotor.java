package Entidades;

public class BarcoMotor extends Barco {

    private int potenciaCV;

    public BarcoMotor() {
    }

    public BarcoMotor(int potenciaCV, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    @Override
    public int modulo() {
        return super.modulo() + potenciaCV;
    }
    
    public void crearMotor(BarcoMotor bm){
        super.crearBarco(bm);
        System.out.println("Ingrese potencia CV: ");
        bm.potenciaCV = leer.nextInt();
    }
    
    
}
