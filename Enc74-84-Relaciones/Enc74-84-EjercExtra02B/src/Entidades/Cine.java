package Entidades;

import java.util.Arrays;

public class Cine {
    
    private Butaca matrizButaca[][] = new Butaca[8][6];
    private Pelicula pelicula;
    private int precio;
    private static int capacidad = 48;
    private int capacidadCont;
    
    public Cine() {
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
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
        capacidad--;
        this.capacidadCont = capacidad;
    }

    public void setCapacidadCont() {
        capacidad--;
        this.capacidadCont = capacidad;
    }

    public int getCapacidadCont() {
        return capacidadCont;
    }




    @Override
    public String toString() {
        return "Cine{" + "matrizButaca=" + Arrays.toString(matrizButaca) + '}';
    }

    
    
    
    
    
    

}
