package enc74.pkg84.ejercextra01;

import Entities.Perro;
import Entities.Persona;
import Enums.RazasPerro;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        ArrayList<Persona> listaPersonas = new ArrayList();
        ArrayList<Perro> listaPerros = new ArrayList();
        Scanner s = new Scanner(System.in).useDelimiter("\n");
        String nombreAdoptar;

        listaPersonas.add(new Persona("Brian", "Melo", 31, 564879));
        listaPersonas.add(new Persona("Gabriel", "Valverde", 32, 564880));
        listaPersonas.add(new Persona("Natalia", "Ospina", 33, 564881));
        listaPersonas.add(new Persona("Elizabeth", "Vallejo", 34, 564882));
        listaPersonas.add(new Persona("Carlos", "Roman", 35, 564883));

        listaPerros.add(new Perro("Chiquito", RazasPerro.COCKER, 1, "Pequeño"));
        listaPerros.add(new Perro("Lola", RazasPerro.PASTOR_ALEMAN, 2, "Medio"));
        listaPerros.add(new Perro("Filomena", RazasPerro.LABRADOR, 5, "Grande"));
        listaPerros.add(new Perro("Luna", RazasPerro.COCKER, 0, "Pequeño"));
        listaPerros.add(new Perro("Manchita", RazasPerro.PASTOR_ALEMAN, 2, "Medio"));
        listaPerros.add(new Perro("Rufu", RazasPerro.LABRADOR, 7, "Grande"));
        listaPerros.add(new Perro("Blanquito", RazasPerro.COCKER, 1, "Pequeño"));

        boolean otro;

        for (Persona persona : listaPersonas) {
            otro = true;
            System.out.println("PERROS DISPONIBLES");
            for (Perro listaPerro : listaPerros) {
                System.out.println(listaPerro.getNombre());
            }
            while (otro) {
                System.out.println(persona.getNombre() + ", nombre del perro que quiere adoptar");
                nombreAdoptar = s.next();
                for (Perro perro : listaPerros) {
                    if (perro.getNombre().equalsIgnoreCase(nombreAdoptar)) {
                        persona.setPerro(perro);
                        System.out.println("Adoptaste a " + perro.getNombre());
                        otro = false;
                        listaPerros.remove(perro);
                        break;
                    }
                }
                if (otro) {
                    System.out.println("El perro ya está adoptado o no existe");
                }
            }
        }

        for (Persona persona : listaPersonas) {
            System.out.println("La mascota de "+persona.getNombre()+" es "+persona.getPerro().getNombre());
        }

    }

}

        
        
