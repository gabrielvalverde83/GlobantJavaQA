/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poodesafio2peliculas;

import Servicios.ServiciosAlquiler;
import Servicios.ServiciosPelicula;

/**
 *
 * @author 57312
 */
public class POODesafio2Peliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosPelicula sp = new ServiciosPelicula();
        ServiciosAlquiler sa = new ServiciosAlquiler(sp);
        sp.crearPelicula();
        sp.listarPeliculas();
        sa.crearAlquiler();
        sa.listarAlquileres();
        if (sp.buscarPorTitulo()) {
            System.out.println("La película está disponible");
        }else{
            System.out.println("La pelicula No está disponible");
        }
        if (sp.buscarPorGenero()) {
            System.out.println("Actualmente tenemos películas de este género");
        }else{
            System.out.println("No tenemos películas de este género");
        }
        sa.buscarAlquiler();
        sa.calcularIngreso(sa.getAlquileres()[1]);
    }
    
}
