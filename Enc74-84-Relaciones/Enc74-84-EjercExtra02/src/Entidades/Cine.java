package Entidades;

import java.util.Arrays;

public class Cine {
    
    private String [][] matriz;
    private String pelicula;
    private int precio;
    
    public Cine() {
    }

    public Cine(String[][] matriz, String pelicula, int precio) {
        this.matriz = matriz;
        this.pelicula = pelicula;
        this.precio = precio;
    }

    public String[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
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
