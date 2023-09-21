package Entidades;

import Enums.Opciones;
import java.util.ArrayList;

public class AlojExtraHoteles extends Alojamiento {
    
    protected String priv;

    protected int metCuad;

    /****************************************************************************************/
    
    
    public AlojExtraHoteles() {
    }

    public AlojExtraHoteles(String priv, int metCuad, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.priv = priv;
        this.metCuad = metCuad;
    }


    /****************************************************************************************/
        
    public void crearAlojExtraHotel(){
        super.crearAlojamiento();
        System.out.println("Ingrese si es privado o no? Si o No");
        this.priv = leer.next();
        System.out.println("Ingrese los m2");
        this.metCuad = leer.nextInt();
    }
    
    /****************************************************************************************/

    @Override
    public String toString() {
        return "AlojExtraHoteles{" + "priv=" + priv + ", metCuad=" + metCuad + " - " + super.toString() + '}';
    }
    
    
    
    
    
    
    
    
}

