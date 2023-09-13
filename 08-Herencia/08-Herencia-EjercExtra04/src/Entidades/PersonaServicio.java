package Entidades;

import enumClases.SeccionesEnum;

public class PersonaServicio extends Empleado{
    private SeccionesEnum seccion;

    public PersonaServicio() {
    }
    
    public PersonaServicio(String nombre, String apellido, String ID, String estadoCivil, int anio, int nroDespacho, SeccionesEnum seccion) {
        super(nombre, apellido, ID, estadoCivil, anio, nroDespacho);
        this.seccion = seccion;
    }
    
    public void setSeccion(SeccionesEnum seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString()+ " Seccion: " + seccion;
    }
}
