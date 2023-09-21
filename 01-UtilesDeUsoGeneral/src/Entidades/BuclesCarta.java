package Entidades;

import Enums.BuclesPalo;

public class BuclesCarta {

    private int numero;
    private BuclesPalo palo;



    public BuclesCarta(int numero, BuclesPalo palo) {
        this.numero = numero;
        this.palo = palo;
    }
    
    @Override
    public String toString() {
        return "La carta es el: " + numero + " de " + palo.name();
    }
}
