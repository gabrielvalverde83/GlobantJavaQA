/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class CafeteraServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Cafetera crearCafetera(){
        
        Cafetera c1 = new Cafetera();
        
        c1.setCapacidadMaxima(2000);
        c1.setCapacidadActual(500);
    
        return c1;
    }
    
    
    /****
     * 
     * @param c1 
     **************************************************************************/
    
    
    public void menu(Cafetera c1){
        
        int opc;
        
        do{
            System.out.println("\n****************************"
                    + "\nOpciones a simular"
                    + "\n1 - Llenar cafetera"
                    + "\n2 - Servir taza"
                    + "\n3 - Vaciar cafera"
                    + "\n4 - Agregar cafe"
                    + "\n5 - Salir");
            opc = leer.nextInt();
            if(opc == 5){break;}
            if(opc < 1 || opc > 4){
                System.out.println("\n"
                        + "\n***********************************"
                        + "\n"
                        + "\nError - Ingrese una opción valida"
                        + "\n"
                        + "\n************************************");
            }
            switch(opc){
                case 1:
                    llenarCafetera(c1);
                    break;
                case 2:
                    servirTaza(c1);
                    break;
                case 3:
                    vaciarCafetera(c1);
                    break;
                case 4:
                    agregarCafe(c1);
                    break;
                case 5:
                    break;
            }
        } while(opc < 1 || opc > 5 || opc != 6 );
    }
    
    
    /**
     * 
     * @param c1 
     ********************************************************/
    
    
    public void llenarCafetera(Cafetera c1){
        
        if(c1.getCapacidadActual()==c1.getCapacidadMaxima()){
            System.out.println("La cafetera está llena");
        } else {
            System.out.println("Aguarde un momento");
            c1.setCapacidadActual(c1.getCapacidadMaxima());
            System.out.println("Cantidad de cafe en cafetera: " + c1.getCapacidadActual() + " CC");
        }
    }
    
    
    /**
     * 
     * @param c1 
     ********************************************************/
    
    
    public void servirTaza(Cafetera c1){

        if(c1.getCapacidadActual()== 0 || c1.getCapacidadActual() < 100){
            System.out.println("La cafetera está vacia, recargue por favor");
        } else {
            double taza;
            String respuesta;
            do {
                System.out.println("Ingrese el tamaño de la taza en CC - Minimo: 100CC");
                taza = leer.nextDouble();
                if(taza < 100) {
                    System.out.println("Error");
                }
            } while (taza < 100);
            
            if (taza > c1.getCapacidadActual()){
            System.out.println("\nEl café no alcanza a llenar la taza"
                + "\nDesea servir lo que queda?");
            respuesta = leer.next();
            respuesta = respuesta.toUpperCase();
            if (respuesta.equals("SI")) {
                System.out.println("Cantidad de cafe en taza: " + c1.getCapacidadActual() + " CC");
                c1.setCapacidadActual(0);
                System.out.println("Cantidad de cafe en cafetera: " + c1.getCapacidadActual() + " CC");
            }
            } else {
                System.out.println("Taza llena");
                c1.setCapacidadActual(c1.getCapacidadActual()-taza);
                System.out.println("Cantidad de cafe en cafetera: " + c1.getCapacidadActual() + " CC");
            }
        }
    }
    
    
    /**
     * 
     * @param c1
     ********************************************************/
        
    
    public void vaciarCafetera(Cafetera c1){
        c1.setCapacidadActual(0);
        System.out.println("Cantidad de cafe en cafetera: " + c1.getCapacidadActual() + " CC");
    }
        
    
    /**
     * 
     * @param c1
     ********************************************************/
        
    
    public void agregarCafe(Cafetera c1){
        
        if(c1.getCapacidadActual() == c1.getCapacidadMaxima()){
            System.out.println("La cafetera está llena - No necesita agregar");
        } else {
            double rellenar;
            do{
                System.out.println("Para llenar la cafetera se necesita " + (c1.getCapacidadMaxima()-c1.getCapacidadActual()));
                System.out.println("Ingrese la cantidad que le va a agregar - Min: 100CC");
                rellenar = leer.nextDouble();
                if(rellenar < 100 || (c1.getCapacidadActual() + rellenar) > c1.getCapacidadMaxima()){
                    System.out.println("Error");
                }
            } while ((c1.getCapacidadActual() + rellenar) > c1.getCapacidadMaxima() || rellenar < 100);

            System.out.println("Aguarde un momento");
            c1.setCapacidadActual(c1.getCapacidadActual() + rellenar);
            System.out.println("Cantidad de cafe en cafetera: " + c1.getCapacidadActual() + " CC");
        }
        
        
    }
    
    
    
}
