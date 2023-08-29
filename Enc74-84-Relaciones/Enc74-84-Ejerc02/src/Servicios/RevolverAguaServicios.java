package Servicios;

import Entidades.RevolverAgua;

public class RevolverAguaServicios {
    
    RevolverAgua revolver = new RevolverAgua();

    
    public void llenarRevolver(){
        
        revolver.setPosicAct(1);
        
        revolver.setPosicAgua(rellenar());
        
    }
    
    /************************************************************************************************
    ***********************************************************************************************
    ***********************************************************************************************/
    
    public static int rellenar(){
        
        int valor;
        
        valor = (int)(Math.random()*(6-1+1)+1);

        return valor;
    }
    
    /************************************************************************************************
    ***********************************************************************************************
    ***********************************************************************************************/
    
    public static boolean mojar(RevolverAgua revolver){
    
        //boolean mojado;
        return revolver.getPosicAct() == revolver.getPosicAgua();
    }
    
    /************************************************************************************************
    ***********************************************************************************************
    ***********************************************************************************************/
    
    public static void siguienteChorro(RevolverAgua revolver){
        
        int posicActual = revolver.getPosicAct()+1;
        
        if (posicActual == 7){
            posicActual = 1;
        }
        
        revolver.setPosicAct(posicActual);
    }
    
    /************************************************************************************************
    ***********************************************************************************************
    ***********************************************************************************************/
    
    public void imprimir(RevolverAgua revolver){
    
        System.out.println(revolver.toString());
    
    }
    
    
}
