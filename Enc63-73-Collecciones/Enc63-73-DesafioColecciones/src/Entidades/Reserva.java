
package Entidades;

import java.util.Date;

public class Reserva {
    
    private static int internalId=0;
    private int id;
    private int numHab;
    private int cantPers;
    private Date fechaIn;
    private Date fechaOut;
    private Persona datosPersona;

    public Reserva() {

    }

    public Reserva(int numHab, int cantPers, Date fechaIn, Date fechaOut, Persona datosPersona) {
        internalId++;
        id = internalId;
        this.numHab = numHab;
        this.cantPers = cantPers;
        this.fechaIn = fechaIn;
        this.fechaOut = fechaOut;
        this.datosPersona = datosPersona;
    }

    public static int getInternalId() {
        return internalId;
    }

    public static void setInternalId(int internalId) {
        Reserva.internalId = internalId;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        internalId++;
        id = internalId;
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

    public Persona getDatosPersona() {
        return datosPersona;
    }

    public void setDatosPersona(Persona datosPersona) {
        this.datosPersona = datosPersona;
    }

    @Override
    public String toString() {
        return "Reserva{" + "id=" + id + ", numHab=" + numHab + ", cantPers=" + cantPers + ", fechaIn=" + fechaIn + ", fechaOut=" + fechaOut + ", datosPersona=" + datosPersona + '}';
    }
    
    
    
    

    
    
    
}
