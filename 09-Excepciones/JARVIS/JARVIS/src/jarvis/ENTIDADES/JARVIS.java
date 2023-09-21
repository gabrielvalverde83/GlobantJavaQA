
package jarvis.ENTIDADES;

import java.util.Random;

public class JARVIS {
    private Armadura armadura;
    private Radar[] radar;

    public JARVIS(Armadura armadura) {
        this.armadura = armadura;
        this.radar = new Radar[10];
    }

    public void agregarObjetoRadar() {
        Random rand = new Random();
        float x = rand.nextFloat() * 10000 - 5000;  
        float y = rand.nextFloat() * 10000 - 5000;
        float z = rand.nextFloat() * 10000 - 5000;
        boolean hostil = rand.nextBoolean();
        int resistencia = rand.nextInt(100);
        Radar objeto = new Radar(x, y, z, hostil, resistencia);

        for (int i = 0; i < radar.length; i++) {
            if (radar[i] == null) {
                radar[i] = objeto;
                break;
            }
        }
    }

    public void destruirEnemigos() {
        System.out.println("//////////////////////////");
        System.out.println("<<<Enemigo detectado>>>");
        System.out.println("<<<Entrando en Combate>>>");
        System.out.println("//////////////////////////");
        
        for (Radar objeto : radar) {
            if (objeto != null && objeto.esHostil()) {
                while (!objeto.estaDestruido() && armadura.getEnergia() > 0) {
                    float distancia = objeto.calcularDistancia();
                    if (distancia <= 5000) {
                        int dano = (int) (5000 / distancia);
                        objeto.recibirDano(dano);
                        armadura.disparar(1);
                    } else {
                        break;
                    }
                }
            }
        }
    }

    public void accionesEvasivas() {
        if (armadura.getEnergia() < 0.1 * Float.MAX_VALUE) {
            armadura.volar(10 / 300.0f);
        }
    }

   
}
