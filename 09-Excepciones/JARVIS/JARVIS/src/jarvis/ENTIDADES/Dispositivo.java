/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jarvis.ENTIDADES;

import java.util.Random;

public class Dispositivo {
    private String nombre;
    private float consumoEnergia;
    private boolean danado;

    public Dispositivo(String nombre, float consumoEnergia) {
        this.nombre = nombre;
        this.consumoEnergia = consumoEnergia;
        this.danado = false;
    }

    public float usar(int intensidad, float tiempo) {
        if (danado) {
            System.out.println(nombre + " está dañado y no puede ser usado.");
            return 0;
        }
        float energiaConsumida = consumoEnergia * intensidad * tiempo;
        Random rand = new Random();
        if (rand.nextInt(100) < 30) {
            danado = true;
            System.out.println(nombre + " se ha dañado.");
        }
        return energiaConsumida;
    }

    public boolean reparar() {
        if (!danado) {
            System.out.println(nombre + " no está dañado.");
            return true;
        }
        Random rand = new Random();
        if (rand.nextInt(100) < 40) {
            danado = false;
            System.out.println(nombre + " ha sido reparado.");
            return true;
        }
        System.out.println("Intento de reparación de " + nombre + " ha fallado.");
        return false;
    }

    public boolean estaDanado() {
        return danado;
    }
}
