package Enums;

public enum Colores {

    BLANCO("Blanco"), NEGRO("Negro"), ROJO("Rojo"), AZUL("Azul"), GRIS("Gris");
    
    private String nombre;
    
    private Colores(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    
    
    
}
