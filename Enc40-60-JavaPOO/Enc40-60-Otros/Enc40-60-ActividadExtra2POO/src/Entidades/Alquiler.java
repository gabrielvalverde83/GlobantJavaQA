/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author 57312
 */
public class Alquiler {
    
   private Date fechaInicio;
   private Date fechaFin;
   private int precio;
   private Pelicula p;

    public Alquiler() {
    }

    public Alquiler(Date fechaInicio, Date fechaFin, int precio, Pelicula p) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
        this.p = p;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Pelicula getP() {
        return p;
    }

    public void setP(Pelicula p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", precio=" + precio + ", p=" + p + '}';
    }
   
   
}
