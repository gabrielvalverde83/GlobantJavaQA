package Entidades;

public class Estudiante extends Persona{
    private String curso;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String ID, String estadoCivil, String curso) {
        super(nombre, apellido, ID, estadoCivil);
        this.curso = curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + " curso: '" + curso + "}";
    }
}
