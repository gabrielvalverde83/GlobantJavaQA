/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jarvis.ENTIDADES;

public class Armadura {
    private String colorPrimario;
    private String colorSecundario;
    private int resistencia;
    private float salud;
    private float energia;
    private Dispositivo botas;
    private Dispositivo guantes;
    private Dispositivo consola;
    private Dispositivo sintetizador;

    public Armadura(String colorPrimario, String colorSecundario, int resistencia) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.resistencia = resistencia;
        this.salud = 100;
        this.energia = Float.MAX_VALUE;
        this.botas = new Dispositivo("Botas", 10);
        this.guantes = new Dispositivo("Guantes", 15);
        this.consola = new Dispositivo("Consola", 5);
        this.sintetizador = new Dispositivo("Sintetizador", 5);
    }

    public void caminar(float tiempo) {
        energia -= botas.usar(1, tiempo);
    }

    public void correr(float tiempo) {
        energia -= botas.usar(2, tiempo);
    }

    public void propulsar(float tiempo) {
        energia -= botas.usar(3, tiempo);
    }

    public void volar(float tiempo) {
        energia -= botas.usar(3, tiempo);
        energia -= guantes.usar(2, tiempo);
    }

    public void disparar(float tiempo) {
        energia -= guantes.usar(3, tiempo);
    }

    public void escribirConsola(String mensaje) {
        System.out.println("Escribiendo en consola: " + mensaje);
        energia -= consola.usar(1, 1);
    }

    public void hablarSintetizador(String mensaje) {
        System.out.println("Sintetizador: " + mensaje);
        energia -= sintetizador.usar(1, 1);
    }

    public void mostrarEstado() {
        System.out.println("---------------------------");
        System.out.println("Estado de la Armadura:");
        System.out.println("---------------------------");
        System.out.println(">> Color Primario: " + colorPrimario);
        System.out.println(">> Color Secundario: " + colorSecundario);
        System.out.println(">> Resistencia: " + resistencia);
        System.out.println(">> Salud: " + salud);
        System.out.println(">> Energía: " + energia);
        System.out.println(">> Botas dañadas: " + botas.estaDanado());
        System.out.println(">> Guantes dañados: " + guantes.estaDanado());
        System.out.println(">> Consola dañada: " + consola.estaDanado());
        System.out.println(">> Sintetizador dañado: " + sintetizador.estaDanado());

    }

    public void mostrarEstadoBateria() {
        float porcentaje = (energia / Float.MAX_VALUE) * 100;
        System.out.println("Estado de la batería: " + porcentaje + "%");
    }

    public Dispositivo getBotas() {
        return botas;
    }

    public Dispositivo getGuantes() {
        return guantes;
    }

    public Dispositivo getConsola() {
        return consola;
    }

    public Dispositivo getSintetizador() {
        return sintetizador;
    }

    public float getEnergia() {
        return energia;
    }
}
