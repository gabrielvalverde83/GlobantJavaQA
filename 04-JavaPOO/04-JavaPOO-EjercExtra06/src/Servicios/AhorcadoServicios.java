package Servicios;

import Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoServicios {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Ahorcado inicializarJuego() {

        //en vez de ingresar por teclado, le vamos a precargar n adivinanzas y que le toque por un método random
        //me parece más real y divertido
        Ahorcado seteo[] = new Ahorcado[5];

        seteo[0] = new Ahorcado("CEREBRO", "Extremidad superior del cuerpo");
        seteo[1] = new Ahorcado("TECLADO", "Se usa para escribir");
        seteo[2] = new Ahorcado("COCODRILO", "Animal con cola y boca larga");
        seteo[3] = new Ahorcado("TELEVISOR", "Metodo de entretenimiento");
        seteo[4] = new Ahorcado("NAVEGAR", "Accion de trasladarse por agua");

        int aux = (int) (Math.random() * (4 - 0 + 1) + 0);

        /********************************************************************************/
        Ahorcado juego = new Ahorcado();

        juego = seteo[aux];

        juego.setIntentosMax(3);

        /********************************************************************************/
        //seteo la dimensión del vector palabraAdivinada y lo lleno con _
        juego.setPalabraAdivinada(juego.getPalabra().length());
        
        String letra = "_";
        
        juego.setPalabraAdivinada(juego.getPalabra().length());
        for (int i = 0; i < juego.getPalabra().length(); i++) {
            juego.setPalabraAdivinada2(letra, i);
        }

        /********************************************************************************/
        
        System.out.println(juego.toString());
        
        return juego;

    }
    
    
    /**
    * *******************************************************************************
    */
    /**
    * *******************************************************************************
    */
    
    
    public void jugarAhorcado(Ahorcado juego){
        
        String letrasUtilizadas = "";
        String letra;
        boolean completado;
                
        do{
            System.out.println("********************************************************");
            System.out.println("La palabra a adivinar tiene " + juego.getPalabra().length() + " palabras");
            System.out.println("Le damos una ayudita: " + juego.getPista());
            System.out.println("");
            System.out.println("Le quedan " + juego.getIntentosMax() + " intentos para adivinar");
            System.out.println("");
            System.out.println("Palabra:");
            System.out.println(Arrays.toString(juego.getPalabraAdivinada()));
            System.out.println("");
            System.out.println("Letras Utilizadas: " + letrasUtilizadas);
            System.out.println("");
            System.out.println("Ingrese una letra para ver si corresponde o no");
            letra = leer.next().toUpperCase();
            letrasUtilizadas = letrasUtilizadas.concat("-" + letra);
            
            buscar(juego, letra);
            completado = completadoCheck(juego);
        } while(juego.getIntentosMax() > 0 && completado == false);
        
        System.out.println("");
        System.out.println("*****************************************************************************************");
        if(juego.getIntentosMax() == 0){System.out.println("Se llegó al limite de intentos, GAME OVER");}
        if(completado == true){System.out.println("FELICITACIONES, LOGRASTE COMPLETAR EL JUEGO");}
        System.out.println("");
        System.out.println("La Palabra quedó:");
        System.out.println(Arrays.toString(juego.getPalabraAdivinada()));
    }
    
    /**
    * *******************************************************************************
    */
    /**
    * *******************************************************************************
    */
    
    public void buscar(Ahorcado juego, String letra){
        
        int intentos = juego.getIntentosMax();
        int cont = 0;
        System.out.println("");
        System.out.println("****************************************************************");
        
        for(int i=0; i<juego.getPalabra().length(); i++){
            if(juego.getPalabra().substring(i, i+1).equals(letra)){
                juego.setPalabraAdivinada2(letra, i);
                System.out.println("Felicitaciones! Acertó");
                cont++;
            }
        }
        if(cont == 0){
            System.out.println("La letra ingresa no corresponde");
            juego.setIntentosMax(intentos-1);   //utilizamos esta variable para ver cuantos intentos quedan para no crear otra variable ya que solo se uso al ppio y ya no se usa
        }  
    }
    
    /**
    * *******************************************************************************
    */
    /**
    * *******************************************************************************
    */
    
    public boolean completadoCheck(Ahorcado juego){
    
        boolean completado = true;
        
        for(int i=0; i<juego.getPalabra().length();i++){
            if(juego.getPalabraAdivinada2(i).equals("_")){
                completado = false;
            }
        }
        return completado;
    }   
}
