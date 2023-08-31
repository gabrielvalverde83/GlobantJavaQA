package Entidades;

//import java.util.Arrays;

public class Cine {
    
    private Butaca [][] matrizButacas;
    private String pelicula;
    private int precio;
    
    public Cine() {
    }

    public Cine(String pelicula, int precio) {
        this.pelicula = pelicula;
        this.precio = precio;
    }

    public Butaca[][] getMatrizButacas() {
        return matrizButacas;
    }

    public void setMatrizButacas(Butaca[][] matrizButacas) {
        this.matrizButacas = matrizButacas;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
