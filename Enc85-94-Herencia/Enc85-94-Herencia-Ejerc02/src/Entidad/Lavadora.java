package Entidad;

public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
    }

    public Lavadora(double precio, String color, char consumoEnergetico, int peso, int carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override   //porque no usa el paquete interfaces y mete las clases ahi?
    public void crearElectrodomestico() {
        super.crearElectrodomestico(); 
        System.out.print("Escriba la capacidad de carga de la lavadora: ");
        setCarga(Integer.parseInt(leer.next()));
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        if (carga > 30) {
            precio += 500;
        }
    }

    @Override
    public String toString() {
        return "Lavadora{" + super.toString() + ", carga=" + carga + '}';
    }
}
