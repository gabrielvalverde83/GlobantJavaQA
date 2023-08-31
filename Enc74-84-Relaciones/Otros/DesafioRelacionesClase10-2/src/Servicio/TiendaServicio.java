package Servicio;

import Entidades.Producto;
import Entidades.Tienda;
import java.util.ArrayList;
import java.util.Scanner;

public class TiendaServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Tienda> listaTiendas;
        
    /*******************************************************************************************/
    /*******************************************************************************************/
    /*******************************************************************************************/
    
    public TiendaServicio() {
        listaTiendas = new ArrayList();
    }
    
    /*******************************************************************************************/
    /*******************************************************************************************/
    /*******************************************************************************************/
    
    //esto lo hago para no hacer private el ArrayList listaTiendas y poder pasarselo al main
    
    public int tamanioListaTiendas(){
        int tamanioListaTiendas = listaTiendas.size();
        return tamanioListaTiendas;
    }
    
    /*******************************************************************************************/
    /*******************************************************************************************/
    /*******************************************************************************************/
        
    public void inicializarTienda(){
        System.out.println("Inicializando tiendas.....");

        listaTiendas.add(new Tienda("Araoz 232","Roberto Gonzalez"));
        listaTiendas.add(new Tienda("Cochabamba 2000", "Paula Lopez"));
        listaTiendas.add(new Tienda("Saenz Peña 890", "Erica Gomez"));
        listaTiendas.add(new Tienda("Boedo s/n ", "Carrodilla"));
    }
  
    /*******************************************************************************************/
    /*******************************************************************************************/
    /*******************************************************************************************/
    
    public void crearTienda(ArrayList<Producto> listaProductos){
        System.out.println("");
        System.out.println("**************************************************");
        System.out.println("Crear Tienda");
        Tienda t = new Tienda();
        System.out.println("Informacion de la tienda:");
        t.setIdTienda();
        System.out.println("Direccion:");
        t.setDireccion(leer.next());
        System.out.println("Representante: ");
        t.setRepresentante(leer.next());
        
        for(int i=0; i<listaProductos.size(); i++){
            System.out.println("Ingrese stock para el producto " + listaProductos.get(i).getNombre());
            listaProductos.get(i).setInventario(leer.nextInt());
        }

        listaTiendas.add(t);
    }
    
    /*******************************************************************************************/
    /*******************************************************************************************/
    /*******************************************************************************************/
    
    public void mostrarTienda(ArrayList<Producto> listaProductos){
        System.out.println("");
        System.out.println("**************************************************");
        System.out.println("Mostrar Tiendas");
        for(int i=0; i<listaTiendas.size(); i++){
            System.out.println("******************************");
            System.out.println("Tienda n°: " + listaTiendas.get(i).getIdTienda());
            System.out.println("Dirección: " + listaTiendas.get(i).getDireccion());
            System.out.println("Representante: " + listaTiendas.get(i).getRepresentante());
            System.out.println("");
            System.out.println("Productos en la tienda:");
            for(int j=0; j<listaProductos.size(); j++){
                System.out.println("******  Producto n°: " + listaProductos.get(j).getId());
                System.out.println("\tNombre: " + listaProductos.get(j).getNombre());
                System.out.println("\tPrecio: $ " + listaProductos.get(j).getPrecio());
                System.out.println("\tStock: " + listaProductos.get(j).getInventario().get(i));
            }
        }
    }
    
    /*******************************************************************************************/
    /*******************************************************************************************/
    /*******************************************************************************************/
   
    public void modificarTienda(ArrayList<Producto> listaProductos){
        System.out.println("");
        System.out.println("**************************************************");
        System.out.println("Modificar Tienda");
        Tienda t = buscarTienda();
        System.out.println("Nuevos datos de la tienda:");
        System.out.println("Direccion:");
        t.setDireccion(leer.next());
        System.out.println("Representante:");
        t.setRepresentante(leer.next());
        for(int i=0; i<listaProductos.size(); i++){
           System.out.println("Ingrese stock para el producto " + listaProductos.get(i).getNombre());
           listaProductos.get(i).setNuevoStock(t.getIdTienda(), leer.nextInt());
        }
    }
    
    /*******************************************************************************************/
    /*******************************************************************************************/
    /*******************************************************************************************/
        
    public void eliminarTienda(ArrayList<Producto> listaProductos){
        System.out.println("");
        System.out.println("**************************************************");
        System.out.println("Eliminar Tienda");
        Tienda t = buscarTienda();

        for(int i=0; i<listaProductos.size(); i++){
           listaProductos.get(i).setNuevoStock(t.getIdTienda(), 0);
        }
        
        listaTiendas.remove(t);
    }
    
    /*******************************************************************************************/
    /*******************************************************************************************/
    /*******************************************************************************************/
        
    private Tienda buscarTienda(){
        System.out.println("");
        System.out.println("Buscar:");
        Tienda t = new Tienda();
        Integer idTienda;
        boolean esta = false;
        
        do{
            System.out.println("Ingrese ID de la tienda:");
            idTienda = leer.nextInt();
            System.out.println("Buscando....");
            for (Tienda tienda : listaTiendas) {
                if(tienda.getIdTienda().equals(idTienda)){
                    t = tienda;
                    esta = true;
                }
            }
        }while(esta == false);
        
        return t;
    }

    /*******************************************************************************************/
    /*******************************************************************************************/
    /*******************************************************************************************/
    
    public void venderProducto(ArrayList<Producto> listaProductos){
        System.out.println("");
        System.out.println("**************************************************");
        System.out.println("Vender Producto");
        System.out.println("Ingrese la tienda:");
        int tienda = leer.nextInt();
        
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
        
        int stock = p.getInventario().get(tienda);
        System.out.println("Hay " + stock + "" + p.getNombre() + " en esta tienda");
        System.out.println("");
        int compra;
        do{
            System.out.println("Ingrese la cantidad a comprar");
            compra = leer.nextInt();
        }while(compra>=stock);
        
        p.setNuevoStock(tienda, (stock - compra));
    }

    
}
