/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jarvis;

import jarvis.ENTIDADES.Armadura;
import jarvis.ENTIDADES.JARVIS;

public class Main {
    public static void main(String[] args) {
        Armadura armadura = new Armadura("Rojo", "Dorado", 100);
        JARVIS jarvis = new JARVIS(armadura);

        armadura.mostrarEstado();
        armadura.caminar(5);
        armadura.correr(3);
        armadura.mostrarEstadoBateria();

        jarvis.agregarObjetoRadar();
        jarvis.destruirEnemigos();
        jarvis.accionesEvasivas();

        armadura.mostrarEstado();
    }
}
