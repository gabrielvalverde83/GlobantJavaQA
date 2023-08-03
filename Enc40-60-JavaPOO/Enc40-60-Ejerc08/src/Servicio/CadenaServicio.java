package Servicio;

import Entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cadena crearCadena(){
        
        Cadena c = new Cadena();
        
        System.out.println("Ingrese la frase:");
        c.setFrase(leer.next());
        
        c.setLongFrase(c.getFrase().length());

        return c;
    }
    
    /**********************************************************************************************************/
    
    
    public void mostrarVocales(Cadena c){
        
        String letra;
        int contA = 0;
        int contE = 0;
        int contI = 0;
        int contO = 0;
        int contU = 0;
        
        for (int i=0; i<c.getLongFrase();i++){
            letra = c.getFrase().substring(i, i+1).toUpperCase();
            if (letra.equals("A")){contA++;}
            if (letra.equals("E")){contE++;}
            if (letra.equals("I")){contI++;}
            if (letra.equals("O")){contO++;}
            if (letra.equals("U")){contU++;}
        }
        
        
        System.out.println("*****************************************************************");
        System.out.println("");
        
        System.out.println("Hay " + contA + " letras A"
                + "\nHay " + contE + " letras E"
                + "\nHay " + contI + " letras I"
                + "\nHay " + contO + " letras O"
                + "\nHay " + contU + " letras U");
    }
    
    /**********************************************************************************************************/
    
    public void invertirFrase(Cadena c){
        
        String letra;
        String fraseInvertida = "";
    
        for (int i=0; i<c.getLongFrase(); i++){
            letra = c.getFrase().substring(c.getLongFrase()-i-1, c.getLongFrase()-i);
            fraseInvertida = fraseInvertida.concat(letra);
        }
        System.out.println("*****************************************************************");
        System.out.println("");
        System.out.println("Frase invertida:");
        System.out.println(fraseInvertida);
    
    }
    
    /**********************************************************************************************************/
    
    public void vecesRepetido(Cadena c){
        
        int cont = 0;
        
        System.out.println("*****************************************************************");
        System.out.println("");
        System.out.println("Ingrese la letra a buscar en la frase");
        String letra = leer.next().toUpperCase();
        String letra2;
        
        for (int i=0; i<c.getLongFrase();i++){
            letra2 = c.getFrase().substring(i, i+1).toUpperCase();
            if (letra.equals(letra2)){
                cont++;
            }
        }

        System.out.println("La letra " + letra + " se encontró " + cont + " veces");
    }
    
    /**********************************************************************************************************/
    
    public void compararLongitud(Cadena c){
        
        System.out.println("Ingrese una nueva frase");
        String fraseNueva = leer.next();
        
        boolean resultado = fraseNueva.equalsIgnoreCase(c.getFrase());
        
        System.out.println("Las frases son iguales? " + resultado);
    }
    
     /**********************************************************************************************************/
    
    public void unirFrases(Cadena c){
        
        System.out.println("Ingrese una nueva frase");
        String fraseNueva = leer.next();
        
        fraseNueva = c.getFrase().concat(fraseNueva);
        
        System.out.println("Las 2 frases unidas queda: " + fraseNueva);
    }
    
     /**********************************************************************************************************/
    
    public void remplazar(Cadena c){
    
        System.out.println("Ingrese la letra a reemplazar");
        String letra = leer.next();
        
        System.out.println("Ingrese la letra o símbolo por el cual lo quiere reemplazar");
        String letra2 = leer.next();
        
        String reemplazo = c.getFrase().replaceAll(letra, letra2);
        
        System.out.println("La nueva frase queda: " + reemplazo);
    }
    
     /**********************************************************************************************************/
    
    public void contiene(Cadena c){
    
        System.out.println("Ingrese la letra a buscar en la frase");
        String letra = leer.next().toUpperCase();
        
        boolean resultado = c.getFrase().toUpperCase().contains(letra);
        
        System.out.println("La frase contiene a la letra: " + letra + " ??? " + resultado);
    
    }
    
}   
