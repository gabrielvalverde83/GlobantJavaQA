
package Servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class PerrosServicios {
    
    ArrayList<String> razasPerros = new ArrayList();
    Scanner leer = new Scanner(System.in);
    Iterator<String> iterador;
    
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
        
        razasPerros.add("caniche");
        razasPerros.add("perrominuscula");
        razasPerros.add("Lola");
        razasPerros.add("Callejeros");
        razasPerros.add("Chiquito");
        razasPerros.add("Lola");
        razasPerros.add("Lola");
        razasPerros.add("Lola");
        razasPerros.add("Lola");
        razasPerros.add("Grandote");
        razasPerros.add("Pepe");
        razasPerros.add("Tito");
        razasPerros.add("Pepe");
        razasPerros.add("Grandote");
        razasPerros.add("Grandote");
        razasPerros.add("Grandote");
        razasPerros.add("Cartucho");
        razasPerros.add("Lola");
        razasPerros.add("Grandote");
        razasPerros.add("Lola");
    }
    
    public void mostrarPerros(){
        System.out.println("****************************************");
        System.out.println("Lista de perros");
        razasPerros.forEach((aux) -> {
            System.out.println(aux);
        });
    }
    
    public void eliminarPerro(){
        
        System.out.println("****************************************");
        System.out.println("Ingrese la raza del perro a borrar");
        String borrarPerro = leer.next();
        int cont = 0;
        
        for(int i=0; i<razasPerros.size();i++){
        
            if(razasPerros.get(i).equalsIgnoreCase(borrarPerro)){
                razasPerros.remove(i);
                cont++;
            }
        }
        if(cont == 0){System.out.println("No se encontraron coincidencias");}
    
    }
    
    public void eliminarRazaIterator(){
        
        System.out.println("****************************************");
        System.out.println("Iterator*****");
        System.out.println("Ingrese la raza del perro a borrar");
        String borrarPerro = leer.next();
        int cont = 0;
        
        iterador = razasPerros.iterator();
        while (iterador.hasNext()) {
            String next = iterador.next();
            if (next.equalsIgnoreCase(borrarPerro)) {
                iterador.remove();
                cont++;
            }
        }
        
        if(cont == 0){System.out.println("No se encontraron coincidencias");}
    }
    
    public void ordenarLista(){
        System.out.println("****************************************");
        System.out.println("Lista Ordenada");
                
        Collections.sort(razasPerros);
    }
    
    
}