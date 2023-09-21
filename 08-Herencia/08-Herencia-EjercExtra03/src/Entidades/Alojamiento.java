package Entidades;

import java.util.Scanner;

public class Alojamiento {

    protected String nombre;

    protected String direccion;

    protected String localidad;

    protected String gerente;
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /****************************************************************************************/
    
    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }
    
    /****************************************************************************************/
    
    public void crearAlojamiento(){
        
        System.out.println("Ingrese el nombre");
        this.nombre = leer.next();
        System.out.println("Ingrese la dirección");
        this.direccion = leer.next();
        System.out.println("Ingrese la localidad");
        this.localidad = leer.next();
        System.out.println("Ingrese el gerente");
        this.gerente = leer.next();
 
    }
    
    /****************************************************************************************/

    @Override
    public String toString() {
        return "Alojamiento{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", gerente=" + gerente + '}';
    }
    
    
    
    
}
