package Entidades;

public class Pelicula {
    
    private String nombre;
    private String director;
    private int duracion;
    private int edad;
    
    /************************************************************/

    public Pelicula() {
    }

    public Pelicula(String nombre, String director, int duracion, int edad) {
        this.nombre = nombre;
        this.director = director;
        this.duracion = duracion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
    
    
}
