package Servicios;

import Entidades.Butaca;
import Entidades.Cine;
import java.util.Arrays;


public class CineServicios {
    
    Cine cine = new Cine();

    
    
    public void inicializarButacas(){
        int cont = 8;
        String contS;
        String jS;
        char jC;
        
        for(int i=0; i<8; i++){     //i son filas, va del 8 al 1, posic 0 en el vector de Butacas
            contS = String.valueOf(cont);
            jC = 'A';
                for (char j=0; j<6; j++){  //j son columnas, va de la A a la F, posic 1 en el vector de Butacas
                    //cine.setMatrizButaca(i, j, new Butaca("B", "A", "");
                    jS = String.valueOf(jC);
                    //jI = Integer.parseInt(jS);
                    cine.setMatrizButaca(i, j, new Butaca(contS, jS, " "));
                    jC++;
                }
            cont--;    
        }  
        imprimirM();
    
    }
    
    public void imprimirM(){
        
        System.out.println("Matriz: ");

        for (int i=0; i<8; i++){
            System.out.println("");
            for (int j=0; j<6;j++){
                System.out.print("[" + cine.getMatrizButaca(i, j).getButaca(0) + "]" + "[" + cine.getMatrizButaca(i, j).getButaca(1) + "]" + "[" + cine.getMatrizButaca(i, j).getButaca(2) + "]");
            }
        }
        System.out.println("");
    }
    
    
}
