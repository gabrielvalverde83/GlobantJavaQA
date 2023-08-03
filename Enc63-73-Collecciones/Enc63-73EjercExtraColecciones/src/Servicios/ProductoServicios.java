package Servicios;

import Entidades.Producto;
import java.util.Scanner;

public class ProductoServicios {
    
    public Producto crearProducto(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Producto nuevoProducto = new Producto();
    
        System.out.println("Ingrese el nombre del producto");
        nuevoProducto.setNombre(leer.next());
        
        System.out.println("Ingrese la categoria"
                + "\n1 - Limpieza"
                + "\n2 - Aseo Personal"
                + "\n3 - Comestible"
                + "\n4 - Varios");                
        nuevoProducto.setCategoria(opcionCategoria(nuevoProducto));
        
        System.out.println("Ingrese el precio");
        nuevoProducto.setPrecio(leer.nextInt());
        
        System.out.println("Ingrese la cantidad inicial");
        nuevoProducto.setCantidadDisponible(leer.nextInt());
    
        return nuevoProducto;
    }
    
    public String opcionCategoria(Producto nuevoProducto){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String categoria = "";
        int opcion;
        
        do{
            opcion = leer.nextInt();
            if(opcion < 1 || opcion > 4){System.out.println("Error - Ingrese una opción valida, entre 1 y 4");}
        }while(opcion < 1 || opcion > 4);
        
        switch(opcion){
            case 1:
                categoria = "Limpieza";
                break;
            case 2:
                categoria = "Aseo Personal";
                break;
            case 3:
                categoria = "Comestible";
                break;
            case 4:
                categoria = "Varios";
                break;
        }
                
        return categoria;
    }
    
    
}
