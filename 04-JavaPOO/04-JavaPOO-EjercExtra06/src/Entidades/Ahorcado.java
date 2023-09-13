package Entidades;

import java.util.Arrays;

public class Ahorcado {
    
    private String palabra;
    private int intentosMax;    //se usa en un primer momento como intentos max y luego como contador decreciente de intentos que quedan
    private String pista;
    private String[] palabraAdivinada;

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
    
    public String[] getPalabraAdivinada() {
        return palabraAdivinada;
    }
    
    public String getPalabraAdivinada2(int i) {
        return palabraAdivinada[i];
    }

    public void setPalabraAdivinada(int longitudPalabra) {
        this.palabraAdivinada = new String [longitudPalabra];
    }
    
    public void setPalabraAdivinada2(String letra, int i) {
        this.palabraAdivinada[i] = letra;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", intentosMax=" + intentosMax + ", pista=" + pista + ", palabraAdivinada=" + Arrays.toString(palabraAdivinada) + '}';
    }

    
    
    

    

}

