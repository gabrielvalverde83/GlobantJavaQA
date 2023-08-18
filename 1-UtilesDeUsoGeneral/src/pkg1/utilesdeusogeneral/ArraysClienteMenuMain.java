package pkg1.utilesdeusogeneral;

import Servicios.ArraysClienteServicio;
import Servicios.ArraysClienteMenuServicio;

public class ArraysClienteMenuMain {

    public static void main(String[] args) {
        ArraysClienteServicio clServicio = new ArraysClienteServicio();
        clServicio.inicializarClientes();
        
//        RutinaServicio rutServicio = new RutinaServicio();
//        rutServicio.inicializarRutinas();
        
        ArraysClienteMenuServicio menuServicio = new ArraysClienteMenuServicio();
        
        int opcion;
        
        do{
            opcion = menuServicio.menu();
            switch (opcion){
                case 1:
                    clServicio.obtenerClientes();
                    break;
                case 2:
                    clServicio.registrarCliente();
                    break;
                case 3:
                    clServicio.actualizarCliente();
                    break;
                case 4:
                    clServicio.eliminarCliente();
                    break;
//                case 5:
//                    rutServicio.obtenerRutinas();
//                    break;
//                case 6:
//                    rutServicio.registrarRutina();
//                    break;
//                case 7:
//                    rutServicio.actualizarRutina();
//                    break;
//                case 8:
//                    rutServicio.eliminarRutina();
//                    break;
                case 9:
                    System.out.println("FIN!!!");
                    break;
            }
            if(opcion<1 || opcion>9){System.out.println("Error - Ingrese una opción valida");}
        } while (opcion!=9);
    }
}