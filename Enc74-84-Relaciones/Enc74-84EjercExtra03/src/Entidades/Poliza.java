package Entidades;


import java.util.ArrayList;
import java.util.Date;

public class Poliza {

    private int numero;

    private Date inicio;

    private Date fin;

    private ArrayList<Cuota> cuotas = new ArrayList();

    //private String formaPago;

    private int montoTotalAseg;

    private boolean granizo;

    private int montoGranizo;

    private String tipoCobert;

    private Cliente cliente;

    private Vehiculo vehiculo;
    
    
    

    public Poliza() {
    }

    public Poliza(int numero, Date inicio, Date fin, int montoTotalAseg, boolean granizo, int montoGranizo, String tipoCobert) {
        this.numero = numero;
        this.inicio = inicio;
        this.fin = fin;
        this.montoTotalAseg = montoTotalAseg;
        this.granizo = granizo;
        this.montoGranizo = montoGranizo;
        this.tipoCobert = tipoCobert;
        //this.cliente = cliente;
        //this.vehiculo = vehiculo;
    }

    public Poliza(ArrayList<Cuota> cuotas) {
        this.cuotas = cuotas;
    }
 
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public ArrayList<Cuota> getCuotas() {
        return cuotas;
    }

//    public void setCuotas(ArrayList<Cuota> cuotas) {
//        this.cuotas = cuotas;
//    }
   
    public void setCuotas(Cuota x) {
        this.cuotas.add(x);
    }

    public int getMontoTotalAseg() {
        return montoTotalAseg;
    }

    public void setMontoTotalAseg(int montoTotalAseg) {
        this.montoTotalAseg = montoTotalAseg;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public int getMontoGranizo() {
        return montoGranizo;
    }

    public void setMontoGranizo(int montoGranizo) {
        this.montoGranizo = montoGranizo;
    }

    public String getTipoCobert() {
        return tipoCobert;
    }

    public void setTipoCobert(String tipoCobert) {
        this.tipoCobert = tipoCobert;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Poliza{" + "numero=" + numero + ", inicio=" + inicio + ", fin=" + fin + ", cuotas=" + cuotas + ", montoTotalAseg=" + montoTotalAseg + ", granizo=" + granizo + ", montoGranizo=" + montoGranizo + ", tipoCobert=" + tipoCobert + ", cliente=" + cliente + ", vehiculo=" + vehiculo + '}';
    }

    
    
    
    
    
    
}
