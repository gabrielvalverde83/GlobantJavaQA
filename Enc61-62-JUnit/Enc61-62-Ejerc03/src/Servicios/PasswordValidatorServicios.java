package Servicios;

import Entidades.PasswordValidator;
import java.util.Scanner;


public class PasswordValidatorServicios {
    
    Scanner leer = new Scanner(System.in);
    
    public void validarPass(){
        
        PasswordValidator contrasena = new PasswordValidator();

        do{
            imprimirMenu();
            contrasena.setPalabra(leer.next());
            longPassValidacion(contrasena);
            if(contrasena.isLongPassValidacion() == true){letrasValidacion(contrasena);}            
        } while(contrasena.isLongPassValidacion() == false && contrasena.isLetrasValidacion() == false);
        
    }
        
    
    /*
    *************************************************************************************
    */
    
    public void imprimirMenu(){
        
        System.out.println("");
        System.out.println("********************************************");
        System.out.println("Ingrese la contraseña"
            + "\nDebe contener entre 8 y 12 caracteres"
            + "\nAl menos 1 mayúscula y 1 minúscula"
            + "\nAl menos 1 caracter especial : @#$%^&+= "
            + "\nAl menos 1 número");
    }

    /*
    *************************************************************************************
    */
    
    public void longPassValidacion(PasswordValidator contrasena){
        
        int longPass = contrasena.getPalabra().length();
        boolean cond1;
                
        if (longPass >= 8 && longPass <= 12) {
            contrasena.setLongPassValidacion(true);
        } else {
            contrasena.setLongPassValidacion(false);
            System.out.println("");
            System.out.println("ERROR - Debe contener entre 8 y 12 caracteres");
        }
    }
    
    /*
    *************************************************************************************
    */
        
    public void letrasValidacion(PasswordValidator contrasena){
    
        int contMin = 0;
        int contMay = 0;
        int contNum = 0;
        int contCaractEsp = 0;        
        
        for(int i=0; i<contrasena.getPalabra().length(); i++){
            //no funciona ni con contains ni con contenequals
            if(contrasena.getPalabra().substring(i, i+1).matches("[a-z]")){
                contMin++;
            } else if(contrasena.getPalabra().substring(i, i+1).matches("[A-Z]")){
                contMay++;
            } else if(contrasena.getPalabra().substring(i, i+1).matches("[0-9]")){
                contNum++;
            } else if(contrasena.getPalabra().substring(i, i+1).matches("[@#$%^&+=]")){
                contCaractEsp++;
            }
        }
        
        if(contMin>0 && contMay>0 && contNum>0 && contCaractEsp>0){
            contrasena.setLetrasValidacion(true);
        } else {
            contrasena.setLetrasValidacion(false);
            System.out.println("");
            System.out.println("ERROR - debe ingresar al menos uno de cada uno de los caracteres mencionados");
        }
    }

    /*
    *************************************************************************************
    */
    
    public boolean caractEspValidacion(PasswordValidator contrasena){
        
        boolean caractEspValidacion = false;
    
        return caractEspValidacion;
    }
    
    /*
    *************************************************************************************
    */    
    
    public boolean numValidacion(PasswordValidator contrasena){
        
        boolean numValidacion = false;
        
        return numValidacion;
    } 
}
