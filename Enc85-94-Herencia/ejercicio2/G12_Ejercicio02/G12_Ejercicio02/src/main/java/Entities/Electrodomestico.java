package Entities;

import Enums.Colores;
import Enums.Consumo;
import java.util.ArrayList;
import java.util.Scanner;

public class Electrodomestico {

    protected Double precio;

    protected Colores color;

    protected char consumoEnergetico;

    protected Integer peso;
    
    Scanner s = new Scanner(System.in).useDelimiter("\n");

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, Colores color, char consumoEnergetico, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color.setNombre(comprobarColor(color.getNombre()));
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
    
    

    public char comprobarConsumoEnergetico(char letra) {
        
        char[] letras = {'A','B','C','D','E','F'};
        boolean val=true;
        for (int i = 0; i < letras.length; i++) {
            if (letra==letras[i]){
                val=false;
            }
        }
        if(val){
            return 'F';
        } else {
            return letra;
        }
        
    }

    public String comprobarColor(String color) {
        boolean val=true;
        for (Colores value : Colores.values()) {
            if (value.getNombre().equals(color)) {
                val=false;
            }
        }
        if(val){
            return Colores.BLANCO.getNombre();
        } else {
            return color;
        }
    }

    public void crearElectrodomestico() {
        
        System.out.println("Ingrese Precio");
        
    }

    public void precioFinal() {
    }
}
