package Entidades;

public class Producto {
    private static int internalId=0;
    private int id;
    private String nombre;
    private String categoria;
    private int precio;
    private int cantidadDisponible;    

    public Producto() {
        //internalId++; //lo hago asi porque cada vez que buscaba un producto, me generaba un id nuevo, y luego al querer ingresar un producto nuevo me dejaba muchos lugares en blanco, y no es la idea
        //id = internalId;
    }

    public Producto(String nombre, String categoria, int precio, int cantidadDisponible) {
        //this();
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }
    
    public int getId() {
        return id;
    }

    public void setId() {
        internalId++;   //lo hago asi porque cada vez que buscaba un producto, me generaba un id nuevo, y luego al querer ingresar un producto nuevo me dejaba muchos lugares en blanco, y no es la idea
        id = internalId;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio + ", cantidadDisponible=" + cantidadDisponible + '}';
    }

   
    
    
}
