/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alquiler;
import Entidades.Pelicula;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author 57312
 */
public class ServiciosAlquiler {

    Alquiler[] alquileres = new Alquiler[2];
    Scanner leer = new Scanner(System.in);
    ServiciosPelicula sp;

    public void crearAlquiler() {
        for (int i = 0; i < alquileres.length; i++) {
            Alquiler al = new Alquiler();
            System.out.println("Ingrese la fecha de inicio del alquiler");
            System.out.println("Ingrese el día:");
            int dia = leer.nextInt();
            System.out.println("Ingrese el mes:");
            int mes = leer.nextInt() - 1;
            System.out.println("Ingrese el año:");
            int anio = leer.nextInt() - 1900;
            Date fechaI = new Date(anio, mes, dia);
            al.setFechaInicio(fechaI);
            System.out.println("Ingrese la fecha fin del alquiler");
            System.out.println("Ingrese el día:");
            int diaF = leer.nextInt();
            System.out.println("Ingrese el mes:");
            int mesF = leer.nextInt() - 1;
            System.out.println("Ingrese el año:");
            int anioF = leer.nextInt() - 1900;
            Date fechaF = new Date(anioF, mesF, diaF);
            al.setFechaFin(fechaF);
            Pelicula pseleccionada = sp.selectPelicula();
            if (pseleccionada != null) {
                al.setP(pseleccionada);
            } else {
                System.out.println("La película seleccionada es incorrecta");
            }
            System.out.println("Ingrese el precio del alquiler");
            al.setPrecio(leer.nextInt());
            alquileres[i] = al;
        }

    }

    public Alquiler[] getAlquileres() {
        return alquileres;
    }

    public ServiciosAlquiler(ServiciosPelicula sp) {
        this.sp = sp;
    }

    public void listarAlquileres() {
        for (Alquiler alquilere : alquileres) {
            System.out.println(alquilere);
        }
    }

    public void buscarAlquiler() {
        System.out.println("Ingrese la fecha del alquiler");
        System.out.println("Ingrese día");
        int dia = leer.nextInt();
        System.out.println("Ingrese mes");
        int mes = leer.nextInt() - 1;
        System.out.println("Ingrese año");
        int anio = leer.nextInt() - 1900;
        Date fecha = new Date(anio, mes, dia);
        boolean encontrado = false;
        for (Alquiler alquilere : alquileres) {
            if (encontrado) {
                break;
            }
            if (alquilere.getFechaInicio().compareTo(fecha) == 0) {
                System.out.println("Estos son los datos del alquiler " + alquilere);
                encontrado = true;
            } else {
                System.out.println("No existe un alquiler con esa fecha");
            }
        }
    }
    
    public void calcularIngreso(Alquiler a){
        double diferencia = Math.ceil((a.getFechaFin().getTime()-a.getFechaInicio().getTime())/(1000.0*3600.0*24.0));
        if (diferencia<=3) {
            System.out.println("El valor del alquiler es: $10");
        }else{
            System.out.println("El valor del alquiler es: "+(10*(1+0.1*(diferencia-3))));
        }
    }

}
