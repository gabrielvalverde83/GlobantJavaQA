package desafiorelacionesclase10;

import Servicio.ProductoServicio;
import Servicio.TiendaServicio;

public class Main {

    public static void main(String[] args) {
       ProductoServicio ps = new ProductoServicio();
       TiendaServicio ts = new TiendaServicio();
             
       ts.inicializarTienda();
       ps.inicializar(ts.tamanioListaTiendas());
       
       
       //esto es para que al crear productos nuevos o modificar existentes, tenga en cuenta el stock según la cantidad de tiendas existentes, ya que el inventario es un arraylist y su tamaño deepnde de la cantidad de tiendas, donde cada posicion del arraylist es cada tienda
       //int tamanioListaTiendas = ts.tamanioListaTiendas();

       //ps.crearProducto(ts.tamanioListaTiendas());
       ps.mostrarProductos(ts.tamanioListaTiendas());
       //ps.modificarProducto(ts.tamanioListaTiendas());
       //ps.mostrarProductos();
//       ps.eliminarProducto();
//       ps.mostrarProductos();
       
//       ts.crearTienda(ps.getListaProductos());
//       ts.mostrarTienda(ps.getListaProductos());    
//       ps.mostrarProductos(ts.tamanioListaTiendas());
       
//       ts.eliminarTienda(ps.getListaProductos());
//       ts.mostrarTienda(ps.getListaProductos());    
//       ps.mostrarProductos(ts.tamanioListaTiendas());
       
       ts.modificarTienda(ps.getListaProductos());
       ts.mostrarTienda(ps.getListaProductos());    
       ps.mostrarProductos(ts.tamanioListaTiendas());
       
//       ts.venderProducto(ps.getListaProductos());
//       ts.mostrarTienda(ps.getListaProductos()); 
//       ps.mostrarProductos(ts.tamanioListaTiendas());
    }
    
}
