package enc40.pkg60.ejerc11;

import java.util.Date;
//import java.util.Scanner;

public class Enc4060Ejerc11 {

    /**
      Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la 
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase 
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al 
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date, 
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que 
se puede conseguir instanciando un objeto Date con constructor vacío. 
Ejemplo fecha: Date fecha = new Date(anio, mes, dia); 
Ejemplo fecha actual: Date fechaActual = new Date(); 
     * @param args
     */
    
    public static void main(String[] args) {
        
        //Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el día");
        int dia = 13;
        System.out.println("Ingrese el mes");
        int mes = 06;
        System.out.println("Ingrese el año");
        int anio = 1983;

        Date fecha2 = new Date(anio-1900, mes -1, dia); //fecha ingresada
        Date fechaActual = new Date();                  //fecha actual
        
        
        System.out.println("Fecha 2" + fecha2);
        System.out.println("Fecha actual" + fechaActual);
        
        
        int diferencia = fechaActual.getYear() - fecha2.getYear();  //diferencia en años, no respeta meses ni dias, lo hace en bruto
        System.out.println("Diferencia" + diferencia);
        
        diferencia = fechaActual.getMonth() - fecha2.getMonth();    //diferencia de mes a mes
        System.out.println("Diferencia" + diferencia);
        
        
        
        //Date fecha = new Date(anio, mes, dia);      //esta no sirve
        //Date fechaActual2 = new Date("d-MMM-yy");     //no anda
        
    }
    
}
