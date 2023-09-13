package Servicios;

import Entidades.Persona;
import java.util.ArrayList;
import java.util.Iterator;

public class PersonaServicios {
    
        public ArrayList<Persona> listadoPersonas(){
        
        ArrayList<Persona> listadoPersonas = new ArrayList();
        
        listadoPersonas.add(new Persona("Benicio", 15 , 9));
        listadoPersonas.add(new Persona("Horacio", 18, 10));
        listadoPersonas.add(new Persona("Marita", 20, 11));
        listadoPersonas.add(new Persona("Rodolfo", 25 , 9));
        listadoPersonas.add(new Persona("Pepe", 9 , 10));
        listadoPersonas.add(new Persona("Moni", 7 , 11));
        listadoPersonas.add(new Persona("Ermegilda", 5, 9));
        listadoPersonas.add(new Persona("Tita", 35, 10));
        listadoPersonas.add(new Persona("Dai",40 , 11));
        listadoPersonas.add(new Persona("Cande", 52 , 9));
        listadoPersonas.add(new Persona("Rosi", 65, 10));
        listadoPersonas.add(new Persona("Alberto", 48, 11));
        listadoPersonas.add(new Persona("Federico", 3 , 9));
        listadoPersonas.add(new Persona("Gustavo", 1 , 10));
        listadoPersonas.add(new Persona("Miguel", 87 , 11));
        listadoPersonas.add(new Persona("Mariana", 24, 9));
        listadoPersonas.add(new Persona("Ana", 13 , 10));
        listadoPersonas.add(new Persona("Cristina", 9 , 9));
        listadoPersonas.add(new Persona("Sara", 7, 10));
        listadoPersonas.add(new Persona("Gabriel", 17, 11));
        listadoPersonas.add(new Persona("Jose", 14, 9));
        listadoPersonas.add(new Persona("Marta", 21, 10));
        listadoPersonas.add(new Persona("Leopoldo", 23, 11));
        listadoPersonas.add(new Persona("Santiago",33 , 9));
        listadoPersonas.add(new Persona("Ceci", 66, 10));
        listadoPersonas.add(new Persona("Marcelo", 88, 11));
        
        for (Iterator<Persona> iterator = listadoPersonas.iterator(); iterator.hasNext();) {
                Persona next = iterator.next();
                System.out.println(next);
        }
             
        return listadoPersonas;
    }
    
}
