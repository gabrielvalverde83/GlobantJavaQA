package pkg1.utilesdeusogeneral;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.Scanner;
import Entidades.ClaseDatePersona;

public class ClaseDate {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
      
        //calcula cuantos dias falta hasta.... fin de año en este caso
        
        LocalDate hoy = LocalDate.now();
        LocalDate finDeAnio = hoy.with(TemporalAdjusters.lastDayOfYear());
        Period hastaFinDeAnio = Period.between(hoy, finDeAnio);
        
        System.out.println(hastaFinDeAnio); //imprime un string
        
    /*************************************************************************************************/
    /*************************************************************************************************/
    /*************************************************************************************************/
        
        //calcular edad
        
        LocalDate fNacimiento = LocalDate.of(1983, Month.JUNE, 13);
        System.out.println("Tu edad es de " +
          ChronoUnit.YEARS.between(fNacimiento, LocalDate.now())
          + " años."
        );
        
    /*************************************************************************************************/
    /*************************************************************************************************/
    /*************************************************************************************************/    
        
        //forma de pasarle una fecha
        //se podria resolver con concat supongo si lo pedimos por teclado o sumando dentro del partentesis...
        
        Date fecha = new Date("2023/08/17");
        
    /*************************************************************************************************/
    /*************************************************************************************************/
    /*************************************************************************************************/ 
        
        //otra forma de pasarle una fecha
    
        System.out.println("Ingrese el día");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año");
        int anio = leer.nextInt();

        Date fecha2 = new Date(anio-1900, mes -1, dia); //fecha ingresada
        Date fechaActual = new Date();                  //fecha actual
        
        
        System.out.println("Fecha 2" + fecha2);
        System.out.println("Fecha actual" + fechaActual);
        
        
        int diferencia = fechaActual.getYear() - fecha2.getYear();  //diferencia en años, no respeta meses ni dias, lo hace en bruto
        System.out.println("Diferencia " + diferencia + " años");

    }
    
    /*************************************************************************************************/
    /*************************************************************************************************/
    /*************************************************************************************************/ 
    
    //calcular edad de una persona
    
    public void calcularEdad(ClaseDatePersona p){

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
    
}
