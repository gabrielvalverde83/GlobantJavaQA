package Servicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class PaisesServicios {
    
    HashSet<String> paises = new HashSet();
    
    public void inicializar (){
        
        paises.add("Argentina");
        paises.add("Colombia");
        paises.add("Uruguay");
        paises.add("Costa Rica");
        paises.add("Argentina");    //para probar si se agrega o no
        paises.add("Mexico");
        paises.add("USA");
        paises.add("España");
        paises.add("Italia");
        paises.add("Fancia");
        paises.add("Argentina");    //para probar si se agrega o no
        paises.add("Argentina");    //para probar si se agrega o no
        paises.add("Holanda");
            
    }
    
    /******************************************************************************************
    ******************************************************************************************
    ******************************************************************************************/
    
    public void agregarPaises(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String respuesta;
        
        do {
            System.out.println("Ingrese el nombre del país a agregar");
            paises.add(leer.next());
            System.out.println("Desea ingresar otro? S o N");
            do {
                respuesta = leer.next().toUpperCase();
                if (!respuesta.equals("S") && !respuesta.equals("N")) {
                    System.out.println("Error - Ingrese S o N");
                }
            } while (!respuesta.equals("S") && !respuesta.equals("N"));
        } while (respuesta.equals("S"));
        
        
    }
    
    /******************************************************************************************
    ******************************************************************************************
    ******************************************************************************************/
    
    public void mostrarPaises(){
        
        System.out.println("");
        System.out.println("*************************************************");        
        System.out.println("Listados de Paises");
        System.out.println("");
        
        paises.forEach((elemento) -> {
            System.out.println(elemento);
        });
    
    }
    
    /******************************************************************************************
    ******************************************************************************************
    ******************************************************************************************/
    
    //mostrar con iterator
    
    public void mostrarPaises2(){
        
        System.out.println("");
        System.out.println("*************************************************");        
        System.out.println("Listados de Paises con iterator");
        System.out.println("");
        
        Iterator iterator = paises.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
            
    }
    
    /******************************************************************************************
    ******************************************************************************************
    ******************************************************************************************/
    
    //ordenar: convertir el hashmap a un nuevo arraylist y hacerle un sort al arraylist
    
    public void ordenarPaises(){
    
        System.out.println("");
        System.out.println("*************************************************");
        System.out.println("Ordenados");
        System.out.println("");
        
        ArrayList<String> paisesLista = new ArrayList(paises);
        Collections.sort(paisesLista);
        
        paisesLista.forEach((elemento) -> {
            System.out.println(elemento);
        });
    }
    
    /******************************************************************************************
    ******************************************************************************************
    ******************************************************************************************/
    
    //ordenar: convertir a treemap
    
    public void ordenarPaises2(){
        
        System.out.println("");
        System.out.println("*************************************************");
        System.out.println("Ordenados 2");
        System.out.println("");
        
        TreeSet<String> paisesTree = new TreeSet(paises);
                
        paisesTree.forEach((elemento) -> {
            System.out.println(elemento);
        });
    }
    
    /******************************************************************************************
    ******************************************************************************************
    ******************************************************************************************/
    
    public void buscarPais(){
    
        for (String paise : paises) {
            
        }
    
    }
    
}
