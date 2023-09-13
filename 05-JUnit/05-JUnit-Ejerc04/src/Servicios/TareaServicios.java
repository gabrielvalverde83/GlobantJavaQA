package Servicios;

import java.util.ArrayList;
import java.util.Scanner;

public class TareaServicios {
    
    ArrayList<String> tareas = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    /*****************************************************************************************************/
    
    public void crearTarea(){
        System.out.println("Introduzca la tarea");
        String descripcion = leer.next();
        System.out.println("Prioridad");
        String estado = leer.next();
        System.out.println("");
        
        String tarea = descripcion + " - " + estado ;
        
        tareas.add(tarea);
    }
    
    /*****************************************************************************************************/
    
    public void mostrarTares(){
        System.out.println("");
        System.out.println("********************************************");
        System.out.println("Lista de tareas:\tTarea\t\tPrioridad");
        
        for(int i=0; i<tareas.size(); i++){
            System.out.println((i+1) + " - " + tareas.get(i));
        }

        System.out.println("");
        System.out.println("Hay " + tareas.size() + " tareas");
    }
    
    /*****************************************************************************************************/
    
    public void eliminarTarea(){
        System.out.println("");
        System.out.println("********************************************");
        System.out.println("Elija la tarea a Eliminar por posición");
        int eleccion = leer.nextInt();
        tareas.remove(eleccion-1);
    }
}
