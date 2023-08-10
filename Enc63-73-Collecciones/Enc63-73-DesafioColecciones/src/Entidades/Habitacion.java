package Entidades;

import java.util.Date;
public class Habitacion {
    
    private int numHab;
    private int cantPers;
    private Date fechaIn;
    private Date fechaOut;

    public Habitacion() {
    }

    public Habitacion(int numHab, int cantPers) {
        this.numHab = numHab;
        this.cantPers = cantPers;
    }
    
    

    public Habitacion(int numHab, int cantPers, Date fechaIn, Date fechaOut) {
        this.numHab = numHab;
        this.cantPers = cantPers;
        this.fechaIn = fechaIn;
        this.fechaOut = fechaOut;
    }

    public int getNumHab() {
        return numHab;
    }

    public void setNumHab(int numHab) {
        this.numHab = numHab;
    }

    public int getCantPers() {
        return cantPers;
    }

    public void setCantPers(int cantPers) {
        this.cantPers = cantPers;
    }

    public Date getFechaIn() {
        return fechaIn;
    }

    public void setFechaIn(Date fechaIn) {
        this.fechaIn = fechaIn;
    }

    public Date getFechaOut() {
        return fechaOut;
    }

    public void setFechaOut(Date fechaOut) {
        this.fechaOut = fechaOut;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "numHab=" + numHab + ", cantPers=" + cantPers + ", fechaIn=" + fechaIn + ", fechaOut=" + fechaOut + '}';
    }

    

    
    
    
    
}
