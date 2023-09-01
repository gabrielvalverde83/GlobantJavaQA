package Entidades;

//import java.util.Arrays;

public class Cine {
    
    private Butaca [][] matrizButacas = new Butaca [8][6];
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

    public void setMatrizButacas(int i, char j, Butaca valor) {
        this.matrizButacas[i][j]= valor;
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
