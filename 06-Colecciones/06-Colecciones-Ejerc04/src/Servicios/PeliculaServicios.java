package Servicios;

import Entidades.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaServicios {
    
    ArrayList<Pelicula> listadoPeliculas = new ArrayList(); 
    
    public ArrayList inicializar(){
        
        listadoPeliculas.add(new Pelicula("Bad Boys", "Michael Bay", 2.07));
        listadoPeliculas.add(new Pelicula("Rambo", "Sylvester Stallone", 1.55));
        listadoPeliculas.add(new Pelicula("Loca academia de pilotos", "Jim Abrahams", 1.4));
        listadoPeliculas.add(new Pelicula("Locacademia de policias", "Hugh Wilson", 1.6));
        listadoPeliculas.add(new Pelicula("Beethoven", "Brian Levant", 1.45));
        listadoPeliculas.add(new Pelicula("La historia sin fin", "Wolfgang Petersen", 1.7));
        listadoPeliculas.add(new Pelicula("Los bañeros más locos del mundo", "Carlos Galettini", 1.37));
        listadoPeliculas.add(new Pelicula("La vida es bella", "Roberto Benigni", 1.93));
        listadoPeliculas.add(new Pelicula("El Padrino", "Francis Ford Coppola", 2.92));
        listadoPeliculas.add(new Pelicula("El secreto de sus ojos", "Juan José Campanella", 2.12));
        listadoPeliculas.add(new Pelicula("Relatos Salvajes", "Damián Szifron", 2.03));
        listadoPeliculas.add(new Pelicula("9 Reinas", "Fabián Bielinsky", 1.92 ));
        listadoPeliculas.add(new Pelicula("Top Guns", "Tony Scott", 1.67));
        listadoPeliculas.add(new Pelicula("Jurassic Park", "Steven Spielberg", 2.12));
        listadoPeliculas.add(new Pelicula("Terminator", "James Cameron", 1.78));
        listadoPeliculas.add(new Pelicula("Tiburon", "Steven Spielberg", 2.07));
        listadoPeliculas.add(new Pelicula("Titanic", "James Cameron", 3.23));
        listadoPeliculas.add(new Pelicula("Todos los perros van al cielo", "Don Bluth", 1.42));
        listadoPeliculas.add(new Pelicula("Rey Leon", "Rob Minkoff ", 1.27));
        listadoPeliculas.add(new Pelicula("Piratas del Caribe", "Espen Sandberg", 2.15));
        listadoPeliculas.add(new Pelicula("Rocky", "John G. Avildsen", 1.98));

        //System.out.println(listadoPeliculas.toString());

        return listadoPeliculas;
    
    }
    
     /***********************************************************************************/
    /***********************************************************************************/
    /***********************************************************************************/
    
    public void ingresarPeliculas(){
        
        Scanner leer = new Scanner(System.in);
        
        String respuesta;
        
        do{
            System.out.println("Ingreso de Pelicula");
            crearPelicula();
            System.out.println("Desea ingresar una nueva pelicula???");
            do{
                respuesta = leer.next().toUpperCase();
                if(!respuesta.equals("S") && !respuesta.equals("N")){System.out.println("Error - Ingrese S o N");}
            } while (!respuesta.equals("S") && !respuesta.equals("N"));
        }while(respuesta.equals("S"));
    }
    
    /***********************************************************************************/
    /***********************************************************************************/
    /**
     * @return *********************************************************************************/
    
    public Pelicula crearPelicula(){
        
        Scanner leer = new Scanner(System.in);
    
        Pelicula peli = new Pelicula();
        
        System.out.println("************************************");
        System.out.println("Crear Pelicu");
        System.out.println("");
        
        System.out.println("Ingrese el nombre de la pelicula");
        peli.setTitulo(leer.next());
        System.out.println("Ingrese el director");
        peli.setDirector(leer.next());
        System.out.println("Ingrese la duracion en horas");
        peli.setDuracion(leer.nextDouble());
    
        return peli;
    }

    public void agregarPelicula(Pelicula peli){
    
        listadoPeliculas.add(peli);
        
    }
    
    /***********************************************************************************/
    /***********************************************************************************/
    /***********************************************************************************/
    
    public void mostrarPeliculas(){
        
        System.out.println("");
        System.out.println("************************************");
        System.out.println("Listado de Peliculas");
        System.out.println("");
        for(int i=0; i<listadoPeliculas.size(); i++){
            System.out.println(listadoPeliculas.get(i).toString());
        }
    }

    /***********************************************************************************/
    /***********************************************************************************/
    /***********************************************************************************/
    
    public void mostrarPeliculas2(){
        
        System.out.println("");
        System.out.println("************************************");
        System.out.println("Listado de Peliculas con duración mayor a 1 hora y media");
        System.out.println("");
        for(int i=0; i<listadoPeliculas.size(); i++){
            if(listadoPeliculas.get(i).getDuracion()>1.5){
                System.out.println(listadoPeliculas.get(i).toString());
            }
        }
    }    
    
    /***********************************************************************************/
    /***********************************************************************************/
    /***********************************************************************************/
    
    public void ordenarPelisPorDuracionDesc(){
    
        Collections.sort(listadoPeliculas, Comparadores.ordenarPorDuracionDesc);
        System.out.println("");
        System.out.println("************************************");
        System.out.println("Ordenar por duracion Descendente");
        mostrarPeliculas();
    }

    /***********************************************************************************/
    /***********************************************************************************/
    /***********************************************************************************/
    
    public void ordenarPelisPorDuracionAsc(){
    
        Collections.sort(listadoPeliculas, Comparadores.ordenarPorDuracionAsc);
        System.out.println("");
        System.out.println("************************************");
        System.out.println("Ordenar por duracion Ascendente");
        mostrarPeliculas();
    }
    
    
    /***********************************************************************************/
    /***********************************************************************************/
    /***********************************************************************************/
    
    public void ordenarPelisPorNombre(){
    
        Collections.sort(listadoPeliculas, Comparadores.ordenarPorNombreDesc);
        System.out.println("");
        System.out.println("************************************");
        System.out.println("Ordenar por titulo");
        mostrarPeliculas();
    }    
    
    
    /***********************************************************************************/
    /***********************************************************************************/
    /***********************************************************************************/
    
    public void ordenarPelisPorDirector(){
    
        Collections.sort(listadoPeliculas, Comparadores.ordenarPorDirectorDesc);
        System.out.println("");
        System.out.println("************************************");
        System.out.println("Ordenar por director");
        mostrarPeliculas();
    }
    
    
}
