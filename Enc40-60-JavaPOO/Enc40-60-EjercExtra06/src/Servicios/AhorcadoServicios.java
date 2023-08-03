package Servicios;

import Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoServicios {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Ahorcado inicializarJuego(){

       //en vez de ingresar por teclado, le vamos a precargar n adivinanzas y que le toque por un método random
       //me parece más real y divertido
       
        Ahorcado seteo[] = new Ahorcado [5];
        
        seteo[0] = new Ahorcado("CEREBRO", "Extremidad superior del cuerpo");
        seteo[1] = new Ahorcado("TECLADO", "Se usa para escribir");
        seteo[2] = new Ahorcado("COCODRILO", "Animal con cola y boca larga");
        seteo[3] = new Ahorcado("TELEVISOR", "Metodo de entretenimiento");
        seteo[4] = new Ahorcado("NAVEGAR", "Accion de trasladarse por agua");
        
        int aux = (int)(Math.random()*(4-0+1)+0);  
        
        /**********************************************************************************/
        
        Ahorcado juego = new Ahorcado();
        
        juego = seteo[aux];
        
        juego.setIntentosMax(3);
        
        juego.setLongPalabra(juego.getPalabra().length());
        
        /**********************************************************************************/
        
        //intente hacerlo con toCharArray pero me da error al querer usar funciones de String y no conozco un toStringArray...
        
        String letra;
        
        //plantie el setPalabraVector de esta forma asi no tengo que usar un vector auxiliar en AhorcadoServicios
        juego.setPalabraVector(juego.getLongPalabra());
        
        for(int i=0; i<juego.getLongPalabra(); i++){
            letra = juego.getPalabra().substring(i, i+1);
            juego.setPalabraVector2(letra, i);
        }
        
         /**********************************************************************************/

         //seteo la dimensión del vector palabraAdivinada
         
         juego.setPalabraAdivinada(juego.getLongPalabra());

         /**********************************************************************************/
        
        System.out.println(juego.toString());
        
        return juego;
             
    }
    
    public void jugarAhorcado(Ahorcado juego){
        
        System.out.println("La palabra a adivinar tiene " + juego.getLongPalabra() + " palabras");
        System.out.println("Le damos una ayudita: " + juego.getPista());
        System.out.println("Tiene " + juego.getIntentosMax() + " intentos para adivinar");
               
        System.out.println(Arrays.toString(juego.getPalabraAdivinada()));
        
        System.out.println("Ingrese una letra para ver si corresponde o no");
        
        int intentos = 0;
        boolean acierto = false;

        do{
            String letra = leer.next().toUpperCase();
            buscar(juego, letra);
            
        } while(juego.getIntentosMax()-intentos == 0 && acierto == false);
        
        System.out.println("Se llegó al limite de intentos, GAME OVER");
        
    }
    
    public void buscar(Ahorcado juego, String letra){
        
       
    }
    

    
    
}
