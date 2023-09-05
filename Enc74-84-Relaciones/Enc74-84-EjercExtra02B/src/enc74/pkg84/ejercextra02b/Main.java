package enc74.pkg84.ejercextra02b;

import Entidades.Cine;
import Servicios.CineServicios;
import Servicios.PeliculaServicios;
import Servicios.PersonaServicios;


public class Main {


    public static void main(String[] args) {
        
        CineServicios cineServ = new CineServicios();
        PersonaServicios persServ = new PersonaServicios();
        PeliculaServicios peliServ = new PeliculaServicios();
        
        cineServ.iniciarCine(peliServ.inicializarPelicula());
        
        cineServ.inicializarButacas();
        cineServ.llenarButacasAleat();
        
        cineServ.ubicarPersona();
        persServ.listadoPersonas();
        
        cineServ.ubicarAleatoriamPersonas(persServ.listadoPersonas());

        
    }
    
}
