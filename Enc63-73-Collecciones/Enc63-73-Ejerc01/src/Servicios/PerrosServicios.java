package Servicios;

import java.util.ArrayList;
import java.util.Scanner;

public class PerrosServicios {
    
    ArrayList<String> razasPerros = new ArrayList();
    Scanner leer = new Scanner(System.in);
    
    public void cargarPerro(){
        
        String raza;
        String respuesta;
        
        do{
        System.out.println("Ingrese la raza del perro");
        raza = leer.next();
        razasPerros.add(raza);
        System.out.println("Quiere ingresar más perros??? SI O cualquier letra para SALIR");
        respuesta = leer.next().toUpperCase();
        } while(respuesta.equals("SI"));
        
        for (String aux : razasPerros){
            System.out.println(aux);
        }
            
        }
}
    

