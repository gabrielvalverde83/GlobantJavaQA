package Servicios;

import Entidades.Jugador;
import Entidades.RevolverAgua;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class JugadorServicios {
    
    RevolverAguaServicios revolverServ = new RevolverAguaServicios();;
    ArrayList <Jugador> listado = new ArrayList();
    int turno = 0;

    
    public void inicializar(){
    
        listado.add(new Jugador("Pepe"));
        listado.add(new Jugador("Rosalia"));
        listado.add(new Jugador("Juanita"));
        listado.add(new Jugador("Rosendo"));
        listado.add(new Jugador("Chiquito"));
    }

    public void disparo(RevolverAgua revolver, TimerTask tiempo){
        
        
        System.out.println("entra a disparo");
        System.out.println(revolver.getPosicAct());
        System.out.println(revolver.getPosicAgua());
        if(RevolverAguaServicios.mojar(revolver)){
            
            listado.get(turno).setMojado(true);
            System.out.println("Este se mojo " + listado.get(turno).getNombre());
            tiempo.cancel();
        }
        System.out.println("PASA X ACa");
        RevolverAguaServicios.siguienteChorro(revolver);
        turno++;
        if(turno>listado.size()){turno = 0;}
        
    }
    
    public void largar(RevolverAgua revolver) {
        Timer timer = new Timer("Timer");
    
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("entro");
                disparo(revolver, this);
            }
        };
        timer.schedule(task, 1000,1000);
         
    }
    
    
 }
    

