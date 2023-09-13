package Servicio;

import Entidades.Nif;
import java.util.Scanner;

public class NifServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Nif crearNif(){

        Nif n1 = new Nif();
        
        int longDni;
        long dni;
        String dniS;
        
        System.out.println("Ingrese el DNI");
        do{
            dni = leer.nextLong();
            dniS = String.valueOf(dni);
            longDni = dniS.length();
        }while (longDni>8);
        
        n1.setDni(dni);
        
        long numero = n1.getDni() % 23;
        
        n1.setLetra(letra(numero));
        
        mostrar(n1, dniS, longDni);
        
        return n1;
    }
    
    /*
    public String letra (int numero){
        
        String letra = "";
        
        switch(numero) {
            case 0:
                letra = "T";
                break;
            case 1:
                letra = "R";
                break;
            case 2:
                letra = "W";
                break;
            case 3:
                letra = "A";
                break;
            case 4:
                letra = "G";
                break;
            case 5:
                letra = "M";
                break;
            case 6:
                letra = "Y";
                break;
            case 7:
                letra = "F";
                break;
            case 8:
                letra = "P";
                break;
            case 9:
                letra = "D";
                break;
            case 10:
                letra = "X";
                break;
            case 11:
                letra = "B";
                break;
            case 12:
                letra = "N";
                break;
            case 13:
                letra = "J";
                break;
            case 14:
                letra = "Z";
                break;
            case 15:
                letra = "S";
                break;
            case 16:
                letra = "Q";
                break;
            case 17:
                letra = "V";
                break;
            case 18:
                letra = "H";
                break;
            case 19:
                letra = "L";
                break;
            case 20:
                letra = "C";
                break;
            case 21:
                letra = "K";
                break;
            case 22:
                letra = "E";
                break;
                
        }
        
        return letra;
    }
    */
    
    public String letra (long numero){
    
        String letra = "";
        
        String vector [] = new String [23];
        
        vector[0] = "T";
        vector[1] = "R";
        vector[2] = "W";
        vector[3] = "A";
        vector[4] = "G";
        vector[5] = "M";
        vector[6] = "Y";
        vector[7] = "F";
        vector[8] = "P";
        vector[9] = "D";
        vector[10] = "X";
        vector[11] = "B";
        vector[12] = "N";
        vector[13] = "J";
        vector[14] = "Z";
        vector[15] = "S";
        vector[16] = "Q";
        vector[17] = "V";
        vector[18] = "H";
        vector[19] = "L";
        vector[20] = "C";
        vector[21] = "K";
        vector[22] = "E";
        
        int numero2 = (int)numero;
                
        letra = vector[numero2];
    
        return letra;
    }
    
    public void mostrar (Nif n1, String dniS, int longDni){
        
        if (longDni < 8){
            do{
                dniS = "0".concat(dniS);
                longDni = longDni +1;
            } while(longDni<8);
        }
        System.out.println(dniS + "-" + n1.getLetra());   
    }
}
