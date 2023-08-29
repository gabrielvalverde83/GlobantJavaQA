package Entidades;

import Enums.RelacionesRazasPerro;

public class RelacionesPerro {
    
    private String nombre;
    private RelacionesRazasPerro raza;
    private int edad;
    private String tamanio;

    public RelacionesPerro(String nombre, RelacionesRazasPerro raza, int edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public RelacionesPerro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public RelacionesRazasPerro getRaza() {
        return raza;
    }

    public void setRaza(RelacionesRazasPerro raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + '}';
    }
    
    
}
