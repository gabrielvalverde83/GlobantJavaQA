/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pelicula;
import java.util.Scanner;

/**
 *
 * @author 57312
 */
public class ServiciosPelicula {

    Pelicula[] peliculas = new Pelicula[2];
    Scanner leer = new Scanner(System.in);

    public void crearPelicula() {
        for (int i = 0; i < peliculas.length; i++) {
            Pelicula p = new Pelicula();
            //p.setId(i + 1);
            System.out.println("Ingrese el título de la película");
            p.setTitulo(leer.next());
            System.out.println("Ingrese el género de la película");
            p.setGenero(leer.next());
            System.out.println("Ingrese el año de la película");
            p.setAnio(leer.nextInt());
            System.out.println("Ingrese la duración en minutos");
            p.setDuracion(leer.nextInt());
            peliculas[i] = p;
        }
    }

    public void listarPeliculas() {
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public Pelicula selectPelicula() {
        System.out.println("Seleccione la película a alquilar");
        listarPeliculas();
        int id = leer.nextInt();
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i].getIdi() == id) {
                return peliculas[i];
            }
        }
        return null;
    }

    public boolean buscarPorTitulo() {
        System.out.println("Ingrese el título de la película");
        String titulo = leer.next();
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                return true;
            }
        }
        return false;
    }

    public boolean buscarPorGenero() {
        System.out.println("Ingrese el género de la película");
        String genero = leer.next();
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getGenero().equalsIgnoreCase(genero)) {
                return true;
            }
        }
        return false;
    }

}
