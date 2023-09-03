package enc74.pkg84.ejercextra02b;

import Servicios.CineServicios;


public class Main {


    public static void main(String[] args) {
        
        CineServicios cineServ = new CineServicios();
        
        cineServ.inicializarButacas();
        cineServ.llenarButacasAleat();
        cineServ.ubicarPersona();
        
        
        
        
    }
    
}
