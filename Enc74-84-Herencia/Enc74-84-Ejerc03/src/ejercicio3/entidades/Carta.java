package ejercicio3.entidades;

public class Carta {

    private int numero;

    private Palo palo;

    public Carta(int numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }
    
    @Override
    public String toString() {
        return "La carta es el: " + numero + " de " + palo.name();
    }
}
