package Entidades;

import java.util.ArrayList;

public class Consulta {
    
        protected ArrayList<Alojamiento> listadoResidencias;

        protected ArrayList<Alojamiento> listadoCampings;
        
        
        /****************************************************************************************/
        
        public void crearResidencias(){
        
            listadoResidencias.add(new Residencias(50, "NO", "SI", "NO", 3055, "Apart Hotel 1", "Azcuenaga 1547", "Lujan", "John"));
            
        }
    
    
}
