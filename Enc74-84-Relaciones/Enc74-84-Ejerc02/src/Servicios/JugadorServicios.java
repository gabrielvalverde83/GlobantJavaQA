package Servicios;

import Entidades.Jugador;
import Entidades.RevolverAgua;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class JugadorServicios {
    
    ArrayList <Jugador> listado = new ArrayList();
    int turno = 0;
    
    /*************************************************************************************/
    /*************************************************************************************/
    /*************************************************************************************/

    public void inicializar(){
    
        listado.add(new Jugador("Pepe"));
        listado.add(new Jugador("Rosalia"));
        listado.add(new Jugador("Juanita"));
        listado.add(new Jugador("Rosendo"));
        listado.add(new Jugador("Chiquito"));
        
        System.out.println(listado.toString());
    }
        
    /*************************************************************************************/
    /*************************************************************************************/
    /*************************************************************************************/
    
    //public void largar(RevolverAgua revolver, ArrayList mojado) {
        
    public void timerDisparos(RevolverAgua revolver){
        
        Timer timer = new Timer("Timer");

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                //System.out.println("entro");
                disparo(revolver, this);
            }
        };
        timer.schedule(task, 1000, 1000);
    }
    
    /*************************************************************************************/
    /*************************************************************************************/
    /*************************************************************************************/

    public void disparo(RevolverAgua revolver, TimerTask tiempo){
        
        //para corroborar:
//        System.out.println("");
//        System.out.println(revolver.getPosicAct());
//        System.out.println(revolver.getPosicAgua());
//        System.out.println(turno);
//        System.out.println(listado.get(turno).getNombre());
        
        if(RevolverAguaServicios.mojar(revolver)){
            //si es true hace esto
            listado.get(turno).setMojado(true);
            System.out.println("Este se mojo " + listado.get(turno).getNombre());
            tiempo.cancel();
        }
        
        RevolverAguaServicios.siguienteChorro(revolver);
        turno = turno + 1;
        if((turno)==listado.size()){turno = 0;}
    }
 }
    

