package Entidades;

public class Temperatura {
    
    private double temperaturaIngresada;
    private boolean active;
    public Temperatura() {
    }

    public Temperatura(double temperaturaIngresada) {
        this.temperaturaIngresada = temperaturaIngresada;
        this.active = true;
    }

    public double getTemperaturaIngresada() {
        return temperaturaIngresada;
    }

    public void setTemperaturaIngresada(double temperaturaIngresada) {
        this.temperaturaIngresada = temperaturaIngresada;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    

    
    
    

}
