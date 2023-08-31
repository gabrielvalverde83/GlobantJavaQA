package Entidades;

import java.util.ArrayList;

public class Tienda {

    private static int contadorIDTienda = 0;
    private Integer idTienda;
    private String direccion, representante;
    
    /*******************************************************************************************/
    /*******************************************************************************************/
    /*******************************************************************************************/
    
    public Tienda() {
    }

    public Tienda(String direccion, String representante) {
        this.idTienda = contadorIDTienda;
        contadorIDTienda ++;
        this.direccion = direccion;
        this.representante = representante;
    }

    public Integer getIdTienda() {
        return idTienda;
    }

    public void setIdTienda() {
        this.idTienda = contadorIDTienda;
        contadorIDTienda++;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }
    
    @Override
    public String toString() {
        return "Tienda{" + "idTienda=" + idTienda + ", direccion=" + direccion + ", representante=" + representante + '}';
    }

    

    
    
}
