package Entidades;


import java.util.ArrayList;

public class Cliente {

    private String nombre;

    private String documento;

    private ArrayList<Poliza> polizas;

    public Cliente() {
    }

    public Cliente(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
        //this.polizas = polizas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public ArrayList<Poliza> getPolizas() {
        return polizas;
    }

    public void setPolizas(ArrayList<Poliza> polizas) {
        this.polizas = polizas;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", documento=" + documento + ", polizas=" + polizas + '}';
    }
    
     
    
    
    
    
}
