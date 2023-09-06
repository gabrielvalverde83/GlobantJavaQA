package Entidades;

public class Persona {
    
    private static int internalID;
    private String id;
    private String nombre;
    private int edad;
    private int dinero;
    
        
    /*********************************************************************/
    
    public Persona() {
    }
    
    public Persona(String nombre, int edad, int dinero) {
        internalID++;
        if (internalID<10){
            this.id = "p0" + String.valueOf(internalID);
        } else {
            this.id = "p" + String.valueOf(internalID);
        }
        
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + '}';
    }
    
    
    
    
    
    
}
