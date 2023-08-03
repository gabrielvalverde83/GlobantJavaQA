package Servicios;

import Entidades.DateValidator;
import java.util.Date;
import java.util.Scanner;

public class DateValidatorServicios {
    
    Scanner leer = new Scanner(System.in);
    
    public DateValidator crearFecha(){
        
        DateValidator fechaObj = new DateValidator();
        System.out.println("Ingrese el año de la fecha");
        System.out.println("Fecha valida entre -3500 (3500 AC - Primera civilización) - 9999");
        int anio = revisarAnio();
        System.out.println("Ingrese el mes");
        int mes = revisarMes();
        System.out.println("Ingrese el día");
        int dia = revisarDia(mes, anio);
        
        Date fecha = new Date(anio-1900, mes-1, dia);
        fechaObj.setFecha(fecha);
        
        System.out.println(fechaObj.getFecha());
        
        return null;
    }
    
    /*******************************************************************************/
    
    public int revisarAnio(){
        
        int anio;

        do{
            anio = leer.nextInt();
            if(anio<-3500 || anio > 9999){System.out.println("Error - Fecha valida entre -3500 y 9999");}
        }while(anio<-3500 || anio > 9999 );
        
        return anio;
    }

    /*******************************************************************************/
        
    public int revisarMes(){
        
        int mes;
        
        do{
            mes = leer.nextInt();
            if(mes<1 || mes>12){System.out.println("Error - Debe ser un mes entre 1 y 12");}
        }while(mes<1 || mes>12);
        
        return mes;
    }
    
    /*******************************************************************************/
    
    public int revisarDia(int mes, int anio){
    
        //Tiene 28 o 29 días: 02    //año bisiesto 2024
        //Tiene 30 días: 04-06-09-11
        //Tiene 31 días: 01-03-05-07-08-10-12
        
        int dia;
        int diaMax=0;
        
        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {diaMax = 31;}
        if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {diaMax = 30;}
        if(mes == 2){
        
            int anioBis = Math.abs(2024-anio);
            anioBis = anioBis%4;
            if(anioBis == 0){diaMax = 29;}
            if(anioBis > 0){diaMax = 28;}
        }
        
        System.out.println("Recuerde que el mes " + mes + " tiene un máximo de " + diaMax + " días");

        do{
            dia = leer.nextInt();
            if(dia<1 || dia>diaMax){System.out.println("Error - Ingrese un número válido entre 1 y " + diaMax);} 
        }while(dia<1 || dia>diaMax);
        
        return dia;
    }
    
    
    
    
    
}
