package Servicio;

import Entidades.Producto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ProductoServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Producto> listaProductos;

    public ProductoServicio() {
        listaProductos = new ArrayList();
    }
    
    /*******************************************************************************************/
    /*******************************************************************************************/
    /*******************************************************************************************/
    
    public void inicializar(int tamanioListaTiendas){
        System.out.println("Inicializando productos.....");
        
        listaProductos.add(new Producto("Teclado Genius", 8598.99, new ArrayList(Arrays.asList(5,0,11,25))));
        listaProductos.add(new Producto("Mouse Genius", 2000.01, new ArrayList(Arrays.asList(3,7,0,33))));
        listaProductos.add(new Producto("Monitor Asus", 160000.02, new ArrayList(Arrays.asList(25,38,51,0))));
        
        //segunda parte del llenado: parte manual y stock automat
        
        listaProductos.add(new Producto("Disco Solido Kingston", 16119.99));
        listaProductos.add(new Producto("Placa de Video Geforce", 79900.00 ));
        listaProductos.add(new Producto("Procesador AMD Ryzen 3", 103444.55 ));
        listaProductos.add(new Producto("Procesador Intel 5", 138612.61));
        listaProductos.add(new Producto("Adaptador USB Generico", 5399.47));
        listaProductos.add(new Producto("Fuente Noga", 8700.05));
        listaProductos.add(new Producto("Gabinete Gamer", 39900.40 ));
        listaProductos.add(new Producto("Captura de video Galga", 26998.00 ));
        listaProductos.add(new Producto("Adaptador USB SATA", 6799.25));
        listaProductos.add(new Producto("MotherBoard ASUS", 84799.03));
        listaProductos.add(new Producto("Memoria RAM DDR4", 21499.54));
        listaProductos.add(new Producto("Placa PCI Express", 10690.5 ));
        
        //llenado automatico de stock en cada tienda del resto que faltan
        
        for(int i=3; i<listaProductos.size(); i++){
            for(int j=0; j<tamanioListaTiendas; j++){
                listaProductos.get(i).setInventario((int)(Math.random()*(15-0+1)+0));   //stock entre 0 y 15
            }
        }    
    }
    
    /*******************************************************************************************/
    /*******************************************************************************************/
    /*******************************************************************************************/
        
    public Producto crearProducto(int tamanioListaTiendas){
        System.out.println("");
        System.out.println("**************************************************");
        System.out.println("Crear Producto");
        Producto p = new Producto();
        System.out.println("Informacion del producto: ");
        p.setId();
        System.out.println("Nombre: ");
        p.setNombre(leer.next());
        System.out.println("Precio:");
        p.setPrecio(leer.nextDouble());
        System.out.println("Inventario: ");
        for(int i=0; i<tamanioListaTiendas; i++){
           p.setInventario(leer.nextInt());
        }
        listaProductos.add(p);
        return p;
    }
    
    /*******************************************************************************************/
    /*******************************************************************************************/
    /*******************************************************************************************/

    public void mostrarProductos(int tamanioListaTiendas){
        System.out.println("");
        System.out.println("**************************************************");
        System.out.println("Mostrar Total de Productos");
        System.out.println("Lista de productos: ");
        for(int i=0; i<listaProductos.size(); i++){
            System.out.println("******  Producto n°: " + listaProductos.get(i).getId());
            System.out.println("\tNombre: " + listaProductos.get(i).getNombre());
            System.out.println("\tPrecio: $ " + listaProductos.get(i).getPrecio());
            for(int j=0; j<listaProductos.get(i).getInventario().size(); j++){
                System.out.println("\tStock en tienda " + j + " : " + listaProductos.get(i).getInventario().get(j));
            }
        }
    }
    
    /*******************************************************************************************/
    /*******************************************************************************************/
    /*******************************************************************************************/
    
    public void modificarProducto(int tamanioListaTiendas){
        System.out.println("");
        System.out.println("**************************************************");
        System.out.println("Modificar Producto");
        Producto p = buscarProducto();
        System.out.println("Nuevo nombre:");
        p.setNombre(leer.next());
        System.out.println("Precio:");
        p.setPrecio(leer.nextDouble());
        System.out.println("Inventario:");
        eliminarTodosElementosArray(p);
        for(int i=0; i<tamanioListaTiendas; i++){
            System.out.println("Stock en tienda: " + i);
            p.setInventario(leer.nextInt());
        }
    }
    
    /*******************************************************************************************/
    /*******************************************************************************************/
    /*******************************************************************************************/
    
    public void eliminarProducto(){
        System.out.println("");
        System.out.println("**************************************************");
        System.out.println("Eliminar Producto");
        Producto p = buscarProducto();
        listaProductos.remove(p);
    }
    
    /*******************************************************************************************/
    /*******************************************************************************************/
    /*******************************************************************************************/
    
    public Producto buscarProducto(){
        System.out.println("");
        System.out.println("Buscar:");
        Producto p = new Producto();
        Integer id;
        boolean encontrado = false;
        
        do{
            System.out.println("Ingrese id del producto a buscar: ");
            id = leer.nextInt();
            System.out.println("Buscando...");
            for (Producto producto : listaProductos) {
                if(producto.getId().equals(id)){
                    p = producto;
                    encontrado = true;
                }
            }
        }while(encontrado == false);
        
        return p;
    }
    
    /*******************************************************************************************/
    /*******************************************************************************************/
    /*******************************************************************************************/
    
    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }
    
    /*******************************************************************************************/
    /*******************************************************************************************/
    /*******************************************************************************************/
    
    public void eliminarTodosElementosArray(Producto p){
        
        Iterator<Integer> it = p.getInventario().iterator();
        Integer aux;
        
        while(it.hasNext()){
            aux = it.next();
            it.remove();
        }
    }
    
    
    
}
