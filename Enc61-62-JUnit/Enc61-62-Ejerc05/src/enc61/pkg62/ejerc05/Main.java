package enc61.pkg62.ejerc05;

import Servicios.DateValidatorServicios;

/**
Crea una clase DateValidator que valide la corrección de una fecha (por ejemplo, si es una
fecha válida en el calendario gregoriano).
Escribe pruebas unitarias para asegurarte de que el validador de fechas detecte correctamente
fechas válidas e inválidas, teniendo en cuenta diferentes casos, como años bisiestos.
 */

public class Main {

    public static void main(String[] args) {
        
        DateValidatorServicios dvServ = new DateValidatorServicios();
        
        dvServ.crearFecha();
        
        
        
    }
    
}
