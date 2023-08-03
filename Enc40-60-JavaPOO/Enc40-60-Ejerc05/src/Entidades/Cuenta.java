package Entidades;

public class Cuenta {
    
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual = 1000;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dniCliente) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    
    
   
}
