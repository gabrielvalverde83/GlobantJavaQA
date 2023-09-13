package Entidades;

/*• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
        pertenecen (lenguajes, matemáticas, arquitectura, ...).*/
public class Profesor extends Empleado{
    private String departamento;
    
    public Profesor() {
    }
    
    public Profesor(String nombre, String apellido, String ID, String estadoCivil, int anio, int nroDespacho, String departamento) {
        super(nombre, apellido, ID, estadoCivil, anio, nroDespacho);
        this.departamento = departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return  super.toString() + "class: Profesor " +
                "departamento='" + departamento + '\'' +
                '}';
    }
}
