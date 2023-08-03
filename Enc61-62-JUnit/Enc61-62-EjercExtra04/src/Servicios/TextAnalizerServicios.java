package Servicios;

import Entidades.TextAnalizer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TextAnalizerServicios {
    
    Scanner leer = new Scanner(System.in);
    
    public TextAnalizer crearTexto(){
        
        TextAnalizer texto = new TextAnalizer();
    
        /* Texto por defecto para hacer prubeas asi no lo estoy ingresando por teclado*/
        
        String textoACopiar = "Un objeto en la programación es la forma que tenemos de llevar a código, la representación más fidedigna posible de un objeto de la vida real. Un objeto tendrá características (atributos) que son comunes a todos ellos, pero pueden variar entre sí. Volvamos al ejemplo del fichero o cajonera. El objeto es la cajonera, cada cajón representará un atributo. Una vez creado el molde para crear este objeto cajonera, cada uno de sus cajones alojará un tipo de dato que será el mismo tipo pero la información que se aloje dentro será diferente. En el primer cajón debemos guardar remeras, pero estas pueden ser rojas en una cajonera o verdes en otra. Pensemos también a las personas como objetos. Tenemos ciertas características que son uniformes a todos. Todos tenemos un nombre, un número de identificación, una fecha de nacimiento. Estas características variarían de una persona a otra, pero al compartir esta información podemos elaborar código que represente y nos permita identificar a una o varias personas.";
        
        texto.setTexto(textoACopiar);
        
        //System.out.println(texto.getTexto());
        
        return texto;
    
    }
    
    
    public void buscar(TextAnalizer texto){
            
        // cantidad de frases
        
        String vector [] = ((texto.getTexto().split("\\.")));
        System.out.println("Hay " + vector.length + " frases");
        
        //otra forma:
        StringTokenizer stringTokenizer = new StringTokenizer(texto.getTexto(),"\\.");
        int tokensCount  = stringTokenizer.countTokens();
        System.out.println("Hay " + tokensCount + " frases");
        
        /*********************************************************/
        
        // cantidad de palabras
        
        String textoLimpio = texto.getTexto().replace(".", "");
        textoLimpio = textoLimpio.replace(",", "");
        textoLimpio = textoLimpio.replace(";", "");
        textoLimpio = textoLimpio.replace("á", "a");
        textoLimpio = textoLimpio.replace("é", "e");
        textoLimpio = textoLimpio.replace("í", "i");
        textoLimpio = textoLimpio.replace("ó", "o");
        textoLimpio = textoLimpio.replace("ú", "u");
        textoLimpio = textoLimpio.toLowerCase();
        
        String vector2 [] = textoLimpio.split(" ");
        System.out.println("Hay " + vector2.length + " palabras");
        
        //otra forma:
        StringTokenizer stringTokenizer2 = new StringTokenizer(texto.getTexto()," ");
        int tokensCount2  = stringTokenizer2.countTokens();
        System.out.println("Hay " + tokensCount2 + " palabras");
        
        /*********************************************************/
        
        //numero de letras
        
        char vector3 [] = ((textoLimpio.toCharArray()));
        
        System.out.println("Hay " + vector3.length + " caracteres");
        
        /*********************************************************/
        
        int vectorRepet [] = new int [vector2.length]; // está relacionado con el vector 2 ya que son la cant veces que se repite cada palabras en el texto
        
        int cont;
        
        for(int i=0; i<vector2.length; i++){
            cont = 0;
            for (String vector21 : vector2) {
                if (vector2[i].equals(vector21)) {
                    cont++;
                }
            }
            vectorRepet[i] = cont;
        }
       
      
//        String matrizPrueba [][] = new String [vector2.length][2];
//        
//        for (int i=0; i<vector2.length; i++){
//            matrizPrueba [i][0] = vector2[i];
//            matrizPrueba [i][1] = String.valueOf(vectorRepet[i]);
//        }
//        
//        imprimirM(matrizPrueba);
        
        /*********************************************************/

        //buscador de palabras
        System.out.println("Ingrese la palabra a buscar, sin acentos");
        String palabraABuscar = leer.next().toLowerCase();
        int cont2 = 0;
        
        for(int i=0; i<vector2.length; i++){
            if(palabraABuscar.equals(vector2[i])){
                System.out.println("Se encontraron " + vectorRepet[i] + " coincidencias");
                cont2 ++;
                break;
            }
        }
        if(cont2 == 0){System.out.println("No se encontraron coincidencias");}
    }
    
//    public static void imprimirM(String matrizPrueba[][]){
//        
//        String aux;
//        
//        System.out.println("Matriz: ");
//
//        for (String [] fila: matrizPrueba){
//            aux = "";
//            for (String elemento:fila){
//            aux = aux + "[" + elemento + "]"; 
//            }
//        System.out.println(aux);
//        }
//    }
    
    
    
}
