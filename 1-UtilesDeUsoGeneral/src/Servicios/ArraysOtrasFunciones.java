package Servicios;

import java.util.Scanner;

public class ArraysOtrasFunciones {
    
    
    public void otrasFunciones(){
        
        Scanner leer = new Scanner(System.in);
        
        //forma de buscar en un arraysList
    
        Producto p = new Producto();
        Integer id;
        boolean encontado = false;
        do{
            System.out.println("Ingrese id del producto a buscar: ");
            id = leer.nextInt();
            System.out.println("Buscando...");
            for (Producto producto : listaProductos) {
                if(producto.getId().equals(id)){
                    p = producto;
                    encontado = true;
                }
            }
        }while(encontado == false);
        
    }
    
}
