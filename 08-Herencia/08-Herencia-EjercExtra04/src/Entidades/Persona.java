package Entidades;
/*• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
        identificación y su estado civil.*/
public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected String ID;
    protected String estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String ID, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.estadoCivil = estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", ID='" + ID + '\'' +
                ", estadoCivil='" + estadoCivil ;
    }
}
