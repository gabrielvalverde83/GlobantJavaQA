package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Producto {

    private static Integer contadorID = 0;
    private Integer id;
    private String nombre;
    private double precio;
    private List<Integer> inventario;   //la primera posición del inventario, corresponde  a la primer tienda//lo hago asi para poder inicializar la lista con valores al inicializar los productos, para no tener que ingresarlos a mano. de esta forma puedo pasarle valores sin tener que usar add y hacerlo de uno en uno
    
    /*******************************************************************************************/
    /*******************************************************************************************/
    /*******************************************************************************************/
    
    public Producto() {
        this.inventario = new ArrayList();
    }
    
    public Producto(String nombre, double precio, ArrayList<Integer> inventario) {
        this.id = contadorID;
        contadorID++;
        this.nombre = nombre;
        this.precio = precio;
        this.inventario = inventario;
    }

    public Producto(String nombre, double precio) {
        this.id = contadorID;
        contadorID++;
        this.nombre = nombre;
        this.precio = precio;
        this.inventario = new ArrayList();
    }

    
    

    public Integer getId() {
        return id;
    }

    public void setId() {
        this.id = contadorID;
        contadorID++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<Integer> getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario.add(inventario);
    }
    
    public void setNuevoStock(int i, Integer valor){
        this.inventario.set(i, valor);
    }

    
    
    
    
    

    
    

    
    
    
    
    @Override
    public String toString() {
        return "Producto{\n" + "ID: " + id + "\nNombre: " + nombre + "\nPrecio:" + precio +"\nInventario:"+ inventario +"\n}";
    }
    
}
