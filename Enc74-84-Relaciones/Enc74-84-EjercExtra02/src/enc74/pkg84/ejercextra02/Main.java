package enc74.pkg84.ejercextra02;

import Entidades.Cine;
import Servicios.CineServicios;

public class Main {

    public static void main(String[] args) {
    
        CineServicios butacasServ = new CineServicios();
        Cine butacas = new Cine();
        
        butacasServ.crearCine(butacas);
        
            
        }
        
    }    
        
        
        
        
        
//        String[] fila1 = new String[24];
//        for (int i = 0; i < fila1.length; i=i+3) {
//            Arrays.fill(fila1, i, i+1, String.valueOf(1));
//        }
//        
//        System.out.println(Arrays.toString(fila1));
        
        
    
    
