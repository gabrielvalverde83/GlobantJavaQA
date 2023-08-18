package Entidades;

import java.util.ArrayList;
import java.util.Arrays;

public class Rutina {
    
    private static int internalId = 0;
    private int id;
    private String nombre;
    private ArrayList <String> ejercicios = new ArrayList();

    public Rutina() {
    }

    public Rutina(String nombre, ArrayList<String> ejercicios) {
        internalId++;
        id = internalId;
        this.nombre = nombre;
        this.ejercicios = ejercicios;
    }

    public static int getInternalId() {
        return internalId;
    }

    public static void setInternalId(int internalId) {
        Rutina.internalId = internalId;
    }

    public int getId() {
        return id;
    }

    public void setId() {     //modificado
        internalId++;   
        id = internalId; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(ArrayList<String> ejercicios) {
        this.ejercicios = ejercicios;
    }

    @Override
    public String toString() {
        return "Rutina{" + "id=" + id + ", nombre=" + nombre + ", ejercicios=" + ejercicios.toString() + '}';
    }
}

