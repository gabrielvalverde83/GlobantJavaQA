package Servicios;



public class ButacaServicios {
    
    public void inicializarButacas(){
        
      
        
        
        for(char i=0; i<8; i--){     //i son filas, va del 8 al 1, posic 0 en el vector de Butacas
            for (char j='A'; j<='F'; j++){  //j son columnas, va de la A a la F, posic 1 en el vector de Butacas
                cine.setMatrizButacas(i, j, new Butaca("a","b", "c" ));
            
            
            }
            
            
        }
    
    
    
    }
    
}
