package Servicios;

import Entidades.Producto;
import java.util.ArrayList;
import java.util.Scanner;

public class TiendaServicios {
    
    ArrayList<Producto> listadoProductos = new ArrayList();
    
    public ArrayList inicializar(){

        listadoProductos.add(new Producto("Jabon Dove","Limpieza", 100, 10));
        listadoProductos.get(0).setId();    //lo hago asi porque cada vez que buscaba un producto, me generaba un id nuevo, y luego al querer ingresar un producto nuevo me dejaba muchos lugares en blanco, y no es la idea
        listadoProductos.add(new Producto("Detergente Magistral", "Limpieza", 500, 5));
        listadoProductos.get(1).setId();
        listadoProductos.add(new Producto("Shampoo Sedal", "Aseo Personal", 1000 , 7));        
        listadoProductos.get(2).setId();
        listadoProductos.add(new Producto("Fideos Vicente", "Comestible", 350 , 50));
        listadoProductos.get(3).setId();
        listadoProductos.add(new Producto("Manteca SyS", "Comestible", 200 , 21));
        listadoProductos.get(4).setId();
        listadoProductos.add(new Producto("Palmolive","Limpieza", 150, 12));
        listadoProductos.get(5).setId();
        listadoProductos.add(new Producto("Rollos de Papel Cocina Sussex", "Limpieza", 670 , 38));
        listadoProductos.get(6).setId();
        listadoProductos.add(new Producto("Yogurt Sancor", "Comestibles", 710, 8));
        listadoProductos.get(7).setId();
        listadoProductos.add(new Producto("Leche La Serenisima", "Comestible", 403, 17));
        listadoProductos.get(8).setId();
        listadoProductos.add(new Producto("Papel Higienico Higienol", "Aseo Personal", 478, 15));
        listadoProductos.get(9).setId();
        listadoProductos.add(new Producto("Cerveza Stella", "Comestibles", 980 , 20));
        listadoProductos.get(10).setId();
        listadoProductos.add(new Producto("Galletas Oreo", "Comestibles", 380, 22));
        listadoProductos.get(11).setId();
        listadoProductos.add(new Producto("Gaseosa Coca-Cola", "Comestibles", 700, 55));
        listadoProductos.get(12).setId();
        listadoProductos.add(new Producto("Cerveza Andes", "Comestible", 500, 35));
        listadoProductos.get(13).setId();
        listadoProductos.add(new Producto("Manteca La Serenisima", "Comestibles", 600 , 18));
        listadoProductos.get(14).setId();
        listadoProductos.add(new Producto("Fideos Luquetti", "Comestibles", 410, 23 ));
        listadoProductos.get(15).setId();
        listadoProductos.add(new Producto("Cerveza Patagonia", "Comestibles", 1100, 29));
        listadoProductos.get(16).setId();
        listadoProductos.add(new Producto("Juego x 6 vasos", "Varios", 1500, 6));
        listadoProductos.get(17).setId();
        listadoProductos.add(new Producto("Axe","Limpieza", 130, 24));
        listadoProductos.get(18).setId();
        listadoProductos.add(new Producto("Fosforos Patitos", "Varios", 360, 8));
        listadoProductos.get(19).setId();
        
        //System.out.println(listadoProductos.toString());
        
        return null;
    }
    
    /****************************************************************************************/
    /****************************************************************************************/
    /****************************************************************************************/
    
    public void menu(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion;
        
        do{
            System.out.println("");
            System.out.println("*****************************");
            System.out.println("Menu: "
                + "\n1 - Reponer producto"
                + "\n2 - Comprar producto"
                + "\n3 - Mostrar todos los productos en tienda"
                + "\n4 - Agregar producto"
                + "\n5 - Eliminar producto"
                + "\n6 - Salir");
        
            do{
                opcion = leer.nextInt();
                if(opcion < 1 || opcion > 6){System.out.println("Opción no válida - Debe ingresar un num entre 1 y 6");}
            } while(opcion < 1 || opcion > 6);
            
            switch(opcion){
                case 1:
                    reponerProducto();
                    break;
                case 2:
                    comprarProducto();
                    break;
                case 3:
                    mostrarProductos(listadoProductos);
                    break;
                case 4:
                    agregarProducto();
                    break;
                case 5:
                    eliminarProducto();
                    break;
                case 6:
                    System.out.println("Saliendo");
                    break;
            }
        }while(opcion != 6);
    }
    
    /****************************************************************************************/
    /****************************************************************************************/
    /**
     * @return **************************************************************************************/
    
    public Producto buscarProducto(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList<Producto> resultBusq = new ArrayList();
        //ArrayList<Producto> auxiliar = new ArrayList<>();
        
        boolean noEncontrado;
        String nombreProducto;
        
        do{
            nombreProducto = leer.next().toUpperCase();
            noEncontrado = false;
            
            for(int i=0; i < listadoProductos.size();i++){
                if(listadoProductos.get(i).getNombre().toUpperCase().contains(nombreProducto)){
                    resultBusq.add(listadoProductos.get(i));
                }
            }
            
            if(resultBusq.isEmpty()){
                System.out.println("No se han encontrado productos con ese nombre");
                System.out.println("Pruebe con otro nombre o ! para salir");
                noEncontrado = true;
            }
        } while(true == noEncontrado && !nombreProducto.equals("!"));
        
        if(nombreProducto.equals("!")){
            return null;
        }
        
        String respuesta;
        Producto productoEncontrado = new Producto();

        if(resultBusq.size()>1){
            System.out.println("Hay más de una coincidencia con su búsqueda");
            System.out.println("Ingrese el número del producto a seleccionar del siguiente listado");
            resultBusq.forEach(System.out::println);
            int seleccion;
            boolean comprobar = false;
            do{
                seleccion = leer.nextInt();
                for(int i=0; i<resultBusq.size(); i++){
                    if(resultBusq.get(i).getId()== seleccion){
                        comprobar = true;
                        productoEncontrado = resultBusq.get(i);
                    } else {
                        System.out.println("Opción Incorrecta");
                        comprobar = false;
                    }
                }
            }while(false == comprobar);

        } else {
            productoEncontrado = resultBusq.get(0);
        }
        
        System.out.println("Producto Seleccionado: ");
        System.out.println(productoEncontrado.toString());
        return productoEncontrado;
    }

    /****************************************************************************************/
    /****************************************************************************************/
    /****************************************************************************************/
    
    public void reponerProducto(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("");
        System.out.println("************************************");
        System.out.println("Ingrese el nombre del producto a reponer");
        Producto productoEncontrado = buscarProducto();
        if(productoEncontrado == null){
            System.out.println("Producto no Encontrado"
                    + "\nSaliendo sin reponer");
        }else{
            System.out.println("Ingrese la cantidad de productos a agregar");
            int cantidad;
            do{
                cantidad = leer.nextInt();
                if(cantidad < 1){System.out.println("Error - Debe ingresar un numero mayor o igual a 1");}
            } while(cantidad < 1);
            System.out.println("Confirma operación? S o N");
            String respuesta;
            do{
                respuesta = leer.next().toUpperCase();
                if(!respuesta.equals("S") && !respuesta.equals("N")){System.out.println("Error - Ingrese S o N");}
            } while (!respuesta.equals("S") && !respuesta.equals("N"));
            
            if(respuesta.equals("S")){
                productoEncontrado.setCantidadDisponible(productoEncontrado.getCantidadDisponible() + cantidad);
                System.out.println("Nueva cantidad en stock para el producto " + productoEncontrado.getNombre() + " es de : " + productoEncontrado.getCantidadDisponible() + " unidades");
            } else {
                System.out.println("Saliendo sin reponer");
            }
        }
    }
    
    /****************************************************************************************/
    /****************************************************************************************/
    /****************************************************************************************/
    
    public void comprarProducto(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String respuesta;
        ArrayList<Producto> carrito = new ArrayList();
        
        do{
            System.out.println("");
            System.out.println("************************************");
            System.out.println("Ingrese el nombre del producto a comprar");
            Producto productoEncontrado = buscarProducto();

            if(productoEncontrado == null){
                System.out.println("Producto no encontrado");
            }else{
                if(productoEncontrado.getCantidadDisponible() == 0) {
                    System.out.println("No hay stock disponible");
                } else{
                    System.out.println("Ingrese la cantidad a comprar");
                    System.out.println("Stock: " + productoEncontrado.getCantidadDisponible());
                    int cantidad;
                    do{
                        cantidad = leer.nextInt();
                        if(cantidad < 1 || cantidad > productoEncontrado.getCantidadDisponible()){System.out.println("Ingrese una cantidad validad: Entre 1 y " + productoEncontrado.getCantidadDisponible());}
                    }while(cantidad < 1 || cantidad > productoEncontrado.getCantidadDisponible());
                    carrito.add(productoEncontrado);
                    carrito.get(carrito.size()-1).setCantidadDisponible(cantidad);
                    //listadoProductos.get(carrito.size()-1).getId();
                }
            }
            
            System.out.println("Desea agregar más productos al carrito? S o N");
            do {
                respuesta = leer.next().toUpperCase();
            } while (!respuesta.equals("S") && !respuesta.equals("N"));
        } while(respuesta.equals("S"));
        
        System.out.println("");
        System.out.println("************************************");
        System.out.println("Carrito");
        mostrarProductos(carrito);
        int costo = 0;
        for(int i=0; i<carrito.size(); i++){
            costo = costo + carrito.get(i).getPrecio();
        }
        System.out.println("El costo de la compra es: " + costo);
        
        System.out.println("Confirma compra? S o N");
        do {
            respuesta = leer.next().toUpperCase();
        } while (!respuesta.equals("S") && !respuesta.equals("N"));

        if (respuesta.equals("S")) {
            Producto productoEncontrado = new Producto();
            for(int i=0; i<carrito.size(); i++){
                for(int j=0; j < listadoProductos.size(); j++){
                    if(listadoProductos.get(j).getId() == carrito.get(i).getId()){
                        listadoProductos.get(j).setCantidadDisponible(listadoProductos.get(j).getCantidadDisponible() - carrito.get(i).getCantidadDisponible());
                    }
                }
            }
        } else {
                System.out.println("Saliendo sin comprar");
        }
    }
    
    /****************************************************************************************/
    /****************************************************************************************/
    /**
     * @param listadoProductos**************************************************************************************/
        
    public void mostrarProductos(ArrayList listadoProductos){
        
        System.out.println("");
        System.out.println("************************************");
        System.out.println("Listado de Productos");
        for(int i=0; i<listadoProductos.size(); i++){
            System.out.println(listadoProductos.get(i).toString());
            System.out.println("");
        }
    }
    
    /****************************************************************************************/
    /****************************************************************************************/
    /****************************************************************************************/
    
    public void agregarProducto(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("************************************");
        System.out.println("Agregar Producto");
        ProductoServicios nuevoProducto = new ProductoServicios();
        Producto auxProducto = nuevoProducto.crearProducto();
        System.out.println("Confirma operación? S o N");
            String respuesta;
            do{
                respuesta = leer.next().toUpperCase();
            } while (!respuesta.equals("S") && !respuesta.equals("N"));
            
            if(respuesta.equals("S")){
                listadoProductos.add(auxProducto);
                listadoProductos.get(listadoProductos.size()-1).setId();    //lo hago asi porque cada vez que buscaba un producto, me generaba un id nuevo, y luego al querer ingresar un producto nuevo me dejaba muchos lugares en blanco, y no es la idea
            } else {
                System.out.println("Saliendo sin agregar");
            }
    }
    
    public void eliminarProducto(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("************************************");
        System.out.println("Ingrese el nombre del producto a eliminar");
        Producto productoEncontrado = buscarProducto();
         if(productoEncontrado == null){
            System.out.println("Producto no Encontrado"
                    + "\nSaliendo sin eliminar");
        }else{
            System.out.println("Confirma operación? S o N");
            String respuesta;
            do {
                respuesta = leer.next().toUpperCase();
            } while (!respuesta.equals("S") && !respuesta.equals("N"));

            if (respuesta.equals("S")) {
                listadoProductos.remove(productoEncontrado);
            } else {
                    System.out.println("Saliendo sin eliminar");
            }
         }
    }
}
