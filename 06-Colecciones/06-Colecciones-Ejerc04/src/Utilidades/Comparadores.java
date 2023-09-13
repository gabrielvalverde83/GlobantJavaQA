package Utilidades;

import Entidades.Pelicula;
import java.util.Comparator;

public class Comparadores {
    public static Comparator<Pelicula> ordenarPorDuracionDesc = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return Double.compare(p2.getDuracion(), p1.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorDuracionAsc = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return Double.compare(p1.getDuracion(), p2.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorNombreDesc = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorDirectorDesc = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };
    
}


//ArrayList<Pelicula> listaPeliculas = peliculas.values().stream().collect(Collectors.toCollection(ArrayList::new));
//
//public void ordenarPeliculasPorDuracion(){
//        ArrayList<Pelicula> listaPeliculas = peliculas.values().stream().collect(Collectors.toCollection(ArrayList::new));
//        /*//metodo 1 ordenar
//        Collections.sort(listaPeliculas);
//        listaPeliculas.forEach(System.out::println);
//        */
//        /*//metodo 2 ordenar
//        listaPeliculas.sort((Pelicula p2, Pelicula p1) -> Integer.compare(p1.getDuracion(), p2.getDuracion()));
//        listaPeliculas.forEach(System.out::println);
//        */
//        //metodo 3 ordenar llama a la funcion static ordenarPorDuracion
//        Collections.sort(listaPeliculas, ordenarPorDuracion);
//        listaPeliculas.forEach(System.out::println);
//    }