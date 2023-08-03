package Entidades;

import java.util.Arrays;

public class Ahorcado {
    
    private String palabra;
    private int longPalabra;
    private int intentosMax;
    private String pista;
    private String[] palabraVector;
    private String[] palabraAdivinada = new String[10];

    public Ahorcado() {
    }

    public Ahorcado(String palabra, String pista) {
        this.palabra = palabra;
        this.pista = pista;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getLongPalabra() {
        return longPalabra;
    }

    public void setLongPalabra(int longPalabra) {
        this.longPalabra = longPalabra;
    }

    public int getIntentosMax() {
        return intentosMax;
    }

    public void setIntentosMax(int intentosMax) {
        this.intentosMax = intentosMax;
    }

    public String getPista() {
        return pista;
    }

    public void setPista(String pista) {
        this.pista = pista;
    }

    public String[] getPalabraVector() {
        return palabraVector;
    }

    //plantie el setPalabraVector de esta forma asi no tengo que usar un vector auxiliar en AhorcadoServicios
    
    public void setPalabraVector(int longitudPalabra) {
        this.palabraVector = new String [longitudPalabra];
    }
    
    public void setPalabraVector2(String palabraVector, int i) {
        this.palabraVector[i] = palabraVector;
    }

    public String[] getPalabraAdivinada() {
        return palabraAdivinada;
    }

    public void setPalabraAdivinada(int longitudPalabra) {
        this.palabraAdivinada = new String [longitudPalabra];
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", longPalabra=" + longPalabra + ", intentosMax=" + intentosMax + ", pista=" + pista + ", palabraVector=" + Arrays.toString(palabraVector) + ", palabraAdivinada=" + Arrays.toString(palabraAdivinada) + '}';
    }
    
    

    

}

