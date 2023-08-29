package pkg1.utilesdeusogeneral;

import Entidades.RelacionesPersona;
import Enums.RelacionesRazasPerro;

public class RelacionesPerro {

    public RelacionesPerro(String chiquito, RelacionesRazasPerro COCKER, int par, String mediano) {
    }

    public static void main(String[] args) {
        RelacionesPersona p1 = new RelacionesPersona("Brian", "Melo", 25, 102030);
        RelacionesPersona p2 = new RelacionesPersona("Valentina", "Dallap", 20, 405060);
        
        RelacionesPerro mascota1 = new RelacionesPerro("Chiquito", RelacionesRazasPerro.COCKER, 5, "Mediano");
        RelacionesPerro mascota2 = new RelacionesPerro("Lola", RelacionesRazasPerro.PASTOR_ALEMAN, 1, "Pequeño");
    }
    
}
