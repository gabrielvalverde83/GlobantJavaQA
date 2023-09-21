/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jarvis.ENTIDADES;

public class Radar {
    private float x, y, z;
    private boolean hostil;
    private int resistencia;

    public Radar(float x, float y, float z, boolean hostil, int resistencia) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.hostil = hostil;
        this.resistencia = resistencia;
    }

    public float calcularDistancia() {
        return (float) Math.sqrt(x*x + y*y + z*z);
    }

    public boolean esHostil() {
        return hostil;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void recibirDano(int dano) {
        resistencia -= dano;
    }

    public boolean estaDestruido() {
        return resistencia <= 0;
    }
}
