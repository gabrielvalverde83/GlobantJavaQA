package extraejer1herencia;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.BarcoVelero;
import Entidades.BarcoYate;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean salir =false;
        Alquiler a = new Alquiler();
        while(!salir){
            System.out.println(" INGRESE LA OPCION ");
            System.out.println(" 1 - Alquilar Barco Velero");
            System.out.println(" 2 - Alquilar Barco a Motor");
            System.out.println(" 3 - Alquilar Barco Yates de Lujo");
            System.out.println(" 4 - Alquilar Barco");
            System.out.println(" 0 - Salir ");
            System.out.print("Ingrese opcion: ");
            
            // Obtenemos el numero ingresado por el usuario en la consola:
            int opcion = Integer.parseInt(leer.next());
            switch(opcion){
                case 1:
                    BarcoVelero bv = new BarcoVelero();
                    a.crearAlquiler(a);
                    System.out.println("----Crear Velero----");
                    bv.crearVelero(bv);
                    a.alquiler(a, bv);
                    break;
                case 2:
                    BarcoMotor bm = new BarcoMotor();
                    a.crearAlquiler(a);
                    System.out.println("----Crear Motor----");
                    bm.crearMotor(bm);
                    a.alquiler(a, bm);
                    break;
                case 3:
                    BarcoYate by = new BarcoYate();
                    a.crearAlquiler(a);
                    System.out.println("----Crear Yate----");
                    by.crearYate(by);
                    a.alquiler(a, by);
                    break;
                case 4:
                    Barco b = new Barco();
                    a.crearAlquiler(a);
                    System.out.println("----Crear Barco----");
                    b.crearBarco(b);
                    a.alquiler(a, b);
                    break;
                case 0:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default: // En caso de que el numero ingresado no corresponda a ningún "case"
                    System.out.println("Opcion invalida!!!!!!!");
            }
        }

        
        //BarcoYate by = new BarcoYate(5, 6, "abc123", 7, 2023);
        //Alquiler alquiler = new Alquiler("nata", 123, LocalDate.of(2023, 8, 15), LocalDate.of(2023, 8, 20), 7, by);
        
        //alquiler.alquiler();
    }
    
}
