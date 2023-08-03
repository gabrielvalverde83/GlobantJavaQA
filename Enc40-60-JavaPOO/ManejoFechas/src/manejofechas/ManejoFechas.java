package manejofechas;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class ManejoFechas {

    public static void main(String[] args) {
        
        LocalDate hoy = LocalDate.now();
        LocalDate finDeAnio = hoy.with(TemporalAdjusters.lastDayOfYear());
        Period hastaFinDeAnio = Period.between(hoy, finDeAnio);
        
        System.out.println(hastaFinDeAnio); //imprime un string
        
        
        /**************************************************************************************************/
        
        
        LocalDate fNacimiento = LocalDate.of(1983, Month.JUNE, 13);
        System.out.println("Tu edad es de " +
          ChronoUnit.YEARS.between(fNacimiento, LocalDate.now())
          + " años."
        );
        
        
        
        
    }
    
}
