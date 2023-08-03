package Servicios;

import java.util.Scanner;

public class MenuServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public int menu(){
        
        int opcion = 0;
        System.out.println("");
        System.out.println("**************************************");
        System.out.println("************* MENU *******************");
        System.out.println("**************************************");
        System.out.println("");
        
        System.out.println("Ingrese una opción válida"
                    + "\nClientes::::"
                    + "\n     1 - Mostrar"
                    + "\n     2 - Registrar"
                    + "\n     3 - Actualizar"
                    + "\n     4 - Eliminar"
                    + "\nRutinas::::"
                    + "\n     5 - Mostrar"
                    + "\n     6 - Registrar"
                    + "\n     7 - Actualizar"
                    + "\n     8 - Eliminar"
                    + "\n9 - SALIR XXXXXXXX");

        do{
            opcion = leer.nextInt();
            if(opcion < 1 || opcion > 9){System.out.println("Error - Ingrese una opción válida");}
        } while(opcion < 1 || opcion > 9);
        
        return opcion;
    }
}
