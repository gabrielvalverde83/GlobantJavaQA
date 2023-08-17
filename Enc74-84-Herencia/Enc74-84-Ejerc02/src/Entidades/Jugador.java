package Entidades;

public class Jugador {
    
    private static int internalId = 0;
    private int id;
    private String nombre;
    private boolean mojado = false;

    public Jugador() {
        internalId++;
        this.id = internalId;
        this.nombre = "Jugador " + id;
    }

    public Jugador(String nombre) {
        internalId++;
        this.id = internalId;
        this.nombre = nombre + id;
    }

    public static int getInternalId() {
        return internalId;
    }

    public static void setInternalId(int internalId) {
        Jugador.internalId = internalId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    
    
    
    
        
}
