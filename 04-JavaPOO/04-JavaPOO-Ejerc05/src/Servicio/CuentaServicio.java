package Servicio;

import Entidades.Cuenta;
import java.util.Scanner;

public class CuentaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Cuenta crearCuenta(){
        
        Cuenta c1 = new Cuenta();
        
        System.out.println("Ingrese el número de cuenta");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el DNI del cliente");
        c1.setDniCliente(leer.nextLong());
   
        return c1;
    }
    
    /**
     * @param c1*****************************************************/
    
    public void menu(Cuenta c1){
        
        int opc;
        
        do{
            System.out.println("\n************** Menu **************"
                    + "\nIngrese la opción a operar"
                    + "\n1 - Ingresar dinero"
                    + "\n2 - Retirar dinero"
                    + "\n3 - Extracción rápida (20% del saldo)"
                    + "\n4 - Consultar saldo"
                    + "\n5 - Mostrar los datos de la cuenta"
                    + "\n6 - Salir");
            opc = leer.nextInt();
            if(opc == 6){break;}
            if(opc < 1 || opc > 5){
                System.out.println("\n"
                        + "\n***********************************"
                        + "\n"
                        + "\nError - Ingrese una opción valida"
                        + "\n"
                        + "\n************************************");
            }
            switch(opc){
                case 1:
                    ingresar(c1);
                    break;
                case 2:
                    retirar(c1);
                    break;
                case 3:
                    extraccionRapida(c1);
                    break;
                case 4:
                    consultarSaldo(c1);
                    break;
                case 5:
                    consultarDatos(c1);
                    break;
            }
        } while(opc < 1 || opc > 5 || opc != 6 );
    }
    
    /**
     * @param c1******************************************************/
    
    public void ingresar(Cuenta c1){

        System.out.println("Ingrese el monto y luego el dinero");
        double deposito = leer.nextDouble();
        c1.setSaldoActual(deposito + c1.getSaldoActual());
        System.out.println("El nuevo saldo es: $ " + c1.getSaldoActual());
    }
    
    /**
     * @param c1******************************************************/
    
    public void retirar(Cuenta c1){
    
        System.out.println("Ingrese el monto a retirar");
        double retirar = leer.nextDouble();
        
        if(retirar > c1.getSaldoActual()){
            System.out.println("No dispone de saldo suficiente");
        } else {
            c1.setSaldoActual(c1.getSaldoActual()-retirar);
            System.out.println("El nuevo saldo es: $ " + c1.getSaldoActual());
        }
    }
    
    /**
     * @param c1******************************************************/
    
    public void extraccionRapida(Cuenta c1){

        if(c1.getSaldoActual() == 0){
            System.out.println("No dispone de saldo suficiente");
        } else {
            double retirar = 0.2*c1.getSaldoActual();
            System.out.println("Se retira el 20% del saldo de su cuenta: $ " + retirar);
            c1.setSaldoActual(c1.getSaldoActual() - retirar);
            System.out.println("El nuevo saldo es: $ " + c1.getSaldoActual());
        }
    }
    
    /**
     * @param c1******************************************************/
    
    public void consultarSaldo(Cuenta c1){
      
        System.out.println("Saldo actual: $ "+ c1.getSaldoActual());
    }
    
    /**
     * @param c1******************************************************/
        
    public void consultarDatos(Cuenta c1){
    
        System.out.println("Numero de cuenta: " + c1.getNumeroCuenta());
        System.out.println("DNI del cliente: " + c1.getDniCliente());
        System.out.println("Saldo Actual: $ " + c1.getSaldoActual());
    }
}
