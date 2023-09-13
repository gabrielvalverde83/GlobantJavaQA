package Entidades;

public class Vehiculo {

    private String Marca;

    private String Modelo;

    private int anio;

    private String tipo;
    
    
    

    public Vehiculo() {
    }

    public Vehiculo(String Marca, String Modelo, int anio, String tipo) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.anio = anio;
        this.tipo = tipo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", anio=" + anio + ", tipo=" + tipo + '}';
    }
    
    
    

}
