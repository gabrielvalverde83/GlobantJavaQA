package Entidades;

import Enums.Opciones;
import java.util.ArrayList;

public class Residencias extends AlojExtraHoteles {

    protected int cantHab;
    
    protected String descGrem;
    
    protected String campDep;

    /****************************************************************************************/

    public Residencias() {
    }
    
    public Residencias(int cantHab, String descGrem, String campDep, String priv, int metCuad, String nombre, String direccion, String localidad, String gerente) {
        super(priv, metCuad, nombre, direccion, localidad, gerente);
        this.cantHab = cantHab;
        this.descGrem = descGrem;
        this.campDep = campDep;
    }

    /****************************************************************************************/
    
    public void crearResidencia(){
        super.crearAlojExtraHotel();
        System.out.println("Ingrese cant habitaciones");
        this.cantHab = leer.nextInt();
        System.out.println("Hace descuento a los gremios? Si o No");
        this.descGrem = leer.next();
        System.out.println("Tiene campo de deporte? Si o No");
        this.campDep = leer.next();
    }
    
    /****************************************************************************************/   
    
    @Override
    public String toString() {
        return "Residencias{" + "cantHab=" + cantHab + ", descGrem=" + descGrem + ", campDep=" + campDep + " - " + super.toString() + '}';
    }

    
    
    
    

    
    
    
    
    
    
}
