package Entidades;


import Enumeraciones.FormaPago;
import java.util.Date;

public class Cuota {

    private int numCuota;

    private int montoCuota;

    private boolean pagada;

    private Date fechaVencim;

    private FormaPago formaPago;

    public Cuota() {
    }

    public Cuota(int numCuota, int montoCuota, boolean pagada, Date fechaVencim, FormaPago formaPago) {
        this.numCuota = numCuota;
        this.montoCuota = montoCuota;
        this.pagada = pagada;
        this.fechaVencim = fechaVencim;
        this.formaPago = formaPago;
    }

    

    public int getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    public int getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(int montoCuota) {
        this.montoCuota = montoCuota;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public Date getFechaVencim() {
        return fechaVencim;
    }

    public void setFechaVencim(Date fechaVencim) {
        this.fechaVencim = fechaVencim;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Cuota{" + "numCuota=" + numCuota + ", montoCuota=" + montoCuota + ", pagada=" + pagada + ", fechaVencim=" + fechaVencim + ", formaPago=" + formaPago + '}';
    }
    
    
    
    
    
}


