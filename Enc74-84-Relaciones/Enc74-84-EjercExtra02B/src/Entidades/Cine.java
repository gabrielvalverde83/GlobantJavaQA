package Entidades;

import java.util.Arrays;

public class Cine {
    
    private Butaca matrizButaca[][] = new Butaca[8][6];
    private String pelicula;
    private int precio;
    
    public Cine() {
    }

    public Cine(String pelicula, int precio) {
        this.pelicula = pelicula;
        this.precio = precio;
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

    public Butaca getMatrizButaca(int i, int j) {
        return matrizButaca[i][j];
    }

    public void setMatrizButaca(int i, char j, Butaca butaca) {
        this.matrizButaca[i][j] = butaca;
    }

    @Override
    public String toString() {
        return "Cine{" + "matrizButaca=" + Arrays.toString(matrizButaca) + '}';
    }

    
    
    
    
    
    

}
