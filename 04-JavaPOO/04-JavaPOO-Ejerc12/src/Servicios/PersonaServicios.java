package Servicios;

import Entidades.Persona;
//import java.text.SimpleDateFormat;          //
import java.util.Scanner;
import java.util.Date;

public class PersonaServicios {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona() {
        
        Persona p = new Persona();
        
        System.out.println("Ingrese el nombre de la persona");
        p.setNombre(leer.next());
        
    
        //Anulo la carga de datos manual para las pruebas:
        
        System.out.println("Ingrese la fecha de nacimiento");
        System.out.println("Ingrese el día");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año");
        int anio = leer.nextInt();
        
        /*
        para hacer pruebas
        
        int dia = 13;
        int mes = 06;
        int anio = 1983;
        */

        Date fechaNacimiento = new Date(anio-1900, mes-1, dia);
        
        p.setFechaNacimiento(fechaNacimiento);
        
        return p;
    }
    
    public void calcularEdad(Persona p){
        
        long fechaActual = System.currentTimeMillis();
        Long fechaNacimiento = p.getFechaNacimiento().getTime();
        
        //int edad = fechaActual.getYear() - p.getFechaNacimiento().getYear();  //no se puede hacer asi ya que no respeta dias ni meses, es solo años
                
        // 365.25 dias * 24 hs * 60 min * 60 seg * 1000 mseg
        double añoEnMiliSegParc = 365.25*24*60*60*1000;
        Long añoEnMiliSeg = Math.round(añoEnMiliSegParc);
        
        long tiempoTranscurrido = (fechaActual - fechaNacimiento) / añoEnMiliSeg;
        
        int tiempo = (int)tiempoTranscurrido;
        
        p.setEdad(tiempo);
        
        System.out.println(p.getNombre() + " tiene " + tiempo + " años");
    }
    
    
    public void menorEdad(Persona p){
    
        System.out.println("Ingrese la edad del sujeto 2");
        int edadN = leer.nextInt(); 
        
        if (p.getEdad() > edadN){System.out.println("El sujeto 2 es menor que el sujeto 1");}
        else if (p.getEdad() < edadN){System.out.println("El sujeto 2 es mayor que el sujeto 1");}
        else{System.out.println("El sujeto 2 tiene la misma edad que el sujeto 1");}
    }


    public void mostrarPersona(Persona p){
            
        System.out.println(p.getNombre() + " nacio el " + p.getFechaNacimiento() + " entonces tiene " + p.getEdad() + " años");
        //System.out.println(p.getNombre() + " nacio el " + p.getFechaNacimiento().getYear() + "/" + p.getFechaNacimiento().getMonth() + "/" + p.getFechaNacimiento().getDate() + " entonces tiene " + p.getEdad());    //me resta 1 mes
    }
}
