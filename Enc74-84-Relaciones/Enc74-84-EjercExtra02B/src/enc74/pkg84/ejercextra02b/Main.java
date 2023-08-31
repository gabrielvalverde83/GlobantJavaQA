package enc74.pkg84.ejercextra02b;

import Entidades.Cine;
import Servicios.CineServicios;

public class Main {


    public static void main(String[] args) {
        
        CineServicios cineServ = new CineServicios();
        Cine cine = new Cine();
        
        cineServ.inicializarButacas(cine);
        
    }
    
}
