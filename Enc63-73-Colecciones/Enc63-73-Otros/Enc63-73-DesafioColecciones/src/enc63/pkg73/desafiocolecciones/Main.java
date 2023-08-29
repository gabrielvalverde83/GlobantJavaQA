package enc63.pkg73.desafiocolecciones;

import Servicios.HotelServicios;

public class Main {


    public static void main(String[] args) {
        
        HotelServicios hs = new HotelServicios();
        hs.inicializar();
        hs.cargarReserva();
        hs.eliminarReserva();
    }
    
}
