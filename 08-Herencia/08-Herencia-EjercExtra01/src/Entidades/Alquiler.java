package Entidades;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Alquiler {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String nombre;

    private int documento;

    private LocalDate fechaAlquiler;

    private LocalDate fechaDevolucion;

    private int posicionAmarre;

    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, int documento, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }
    
    public void crearAlquiler(Alquiler a){
        System.out.println("Ingrese nombre del cliente: ");
        a.nombre = leer.next();
        System.out.println("Ingrese documento del cliente: ");
        a.documento = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese fecha de alquiler (YYYY/MM/DD)");
        int anio = leer.nextInt();
        int mes = leer.nextInt();
        int dia = leer.nextInt();
        a.fechaAlquiler = fechaAlquiler.of(anio, mes, dia);
        System.out.println("fecha alquiler: "+fechaAlquiler);
        System.out.println("Ingrese fecha de devolución (YYYY/MM/DD)");
        anio = leer.nextInt();
        mes = leer.nextInt();
        dia = leer.nextInt();
        a.fechaDevolucion = fechaDevolucion.of(anio, mes, dia);
        System.out.println("fecha devolucion: "+fechaDevolucion);
        System.out.println("Ingrese posicion de amarre: ");
        a.posicionAmarre = leer.nextInt();
    }
    
    public void alquiler(Alquiler a, Barco b){
        long numDias = ChronoUnit.DAYS.between(a.fechaAlquiler, a.fechaDevolucion);
        int modulo = b.modulo();
        System.out.println("Numero Dias: "+numDias);
        System.out.println("Modulo: "+modulo);
        System.out.println("Precio final del alquiler: $"+(numDias*modulo));
    }

    @Override
    public String toString() {
        return "Alquiler{" + "leer=" + leer + ", nombre=" + nombre + ", documento=" + documento + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco + '}';
    }
    
    
}
