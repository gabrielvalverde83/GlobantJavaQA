package Servicios;

import Entidades.Habitacion;

public class HabitacionServicios {
    
    Habitacion listadoHab [] = new Habitacion [10];
    
    public void inicializarListadoHab() {

        listadoHab[0] = new Habitacion(0, 2 );
        listadoHab[1] = new Habitacion(1, 2 );
        listadoHab[2] = new Habitacion(2, 2 );
        listadoHab[3] = new Habitacion(3, 2 );
        listadoHab[4] = new Habitacion(4, 2 );
        listadoHab[5] = new Habitacion(5, 3 );
        listadoHab[6] = new Habitacion(6, 3 );
        listadoHab[7] = new Habitacion(7, 3 );
        listadoHab[8] = new Habitacion(8, 1 );
        listadoHab[9] = new Habitacion(9, 1 );


    }
    
}
