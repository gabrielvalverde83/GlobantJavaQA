package Entidades;

public abstract class Empleado extends Persona{
    protected int anio;
    protected int nroDespacho;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String ID, String estadoCivil, int anio, int nroDespacho) {
        super(nombre, apellido, ID, estadoCivil);
        this.anio = anio;
        this.nroDespacho = nroDespacho;
    }

    public void setNroDespacho(int nroDespacho) {
        this.nroDespacho = nroDespacho;
    }

    @Override
    public String toString() {
        return super.toString() +
                " anio: " + anio +
                ", nroDespacho: " + nroDespacho;
    }
}
