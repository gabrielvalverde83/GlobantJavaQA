package Servicios;

import Entidades.RevolverAgua;
import java.util.Random;

public class RevolverAguaServicios {

    
    public static void llenarRevolver(RevolverAgua revolver){
        
        revolver.setPosicAct(rellenar());
        
        revolver.setPosicAgua(rellenar());
        
    }
    
    /************************************************************************************************
    ***********************************************************************************************
    ***********************************************************************************************/
    
    public static int rellenar(){
        
        int valor;
        
        Random rm = new Random();
        
        valor = rm.nextInt(5);
        
        //valor = (int)(Math.random()*(6-1+1)+1);

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
