package enc74.pkg84.ejercextra01;

import Entities.Perro;
import Entities.Persona;
import Enums.RazasPerro;

public class Main {

    public static void main(String[] args) {
        
        Persona p1 = new Persona("Brian", "Melo", 25, 102030);
        Persona p2 = new Persona("Valentina", "Dallap", 20, 405060);
        
        Perro mascota1 = new Perro("Chiquito", RazasPerro.COCKER, 5, "Mediano");
        Perro mascota2 = new Perro("Lola", RazasPerro.PASTOR_ALEMAN, 1, "Pequeño");
        
        p1.setPerro(mascota1);
        p2.setPerro(mascota2);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        
    }
}
