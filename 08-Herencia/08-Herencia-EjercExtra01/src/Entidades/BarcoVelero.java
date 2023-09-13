package Entidades;

import java.util.Scanner;

public class BarcoVelero extends Barco {

    private int mastiles;

    public BarcoVelero() {
    }

    public BarcoVelero(int mastiles, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.mastiles = mastiles;
    }

    @Override
    public int modulo() {
        return super.modulo()+ mastiles;
    }
    
    public void crearVelero(BarcoVelero bv){
        super.crearBarco(bv);
        System.out.println("Ingrese mastiles: ");
        bv.mastiles = leer.nextInt();
        
    }
}
