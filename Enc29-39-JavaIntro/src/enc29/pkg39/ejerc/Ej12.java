package enc29.pkg39.ejerc;

//Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de 
//dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
//fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que 
//ser X y el último tiene que ser una O. 
//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
//especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia 
//distinta de FDE, que no respete el formato se considera incorrecta. 
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas 
//e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las 
//siguientes funciones de Java Substring(), Length(), equals().

import java.util.Scanner;

public class Ej12 {

    
    public static void main(String[] args) {
               
        Scanner leer = new Scanner(System.in);

        int cont = 0;
        int sumaC =0;
        int sumaI = 0;
        String frase;
        char vi, vf;
        
        do{
            System.out.println("Ingrese una frase de 5 letras");
            frase = leer.nextLine();
            
            vi = frase.charAt(0);
            vf = frase.charAt(frase.length()-1);
            
            if(vi=='X' && vf=='O' && frase.length()<= 5){
                sumaC++;  
            } else {
                sumaI++;
            }
               
        } while (!frase.equals("&&&&&"));
        
        System.out.println("Correctos: " + sumaC);
        System.out.println("Incorrectos: " + (sumaI - 1));
        
    }
    
}
