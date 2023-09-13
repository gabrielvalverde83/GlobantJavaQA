package Entidades;

import java.util.Scanner;

public class Barco {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String matricula;

    private int eslora;

    private int anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, int eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }
    
    public int modulo(){
        return (10*eslora);
    }
    
    public void crearBarco(Barco b){
        System.out.println("Ingrese matricula: ");
        b.matricula = leer.next();
        System.out.println("Ingrese eslora: ");
        b.eslora = leer.nextInt();
        System.out.println("Ingrese año de fabricacion: ");
        b.anioFabricacion = leer.nextInt();
        
    }
}
