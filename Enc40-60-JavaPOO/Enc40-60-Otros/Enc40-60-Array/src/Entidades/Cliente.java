
package Entidades;

/* @author jmlucero */
public class Cliente {
    private static int internalId = 0;
    private int id;
    private String nombre;
    private int edad;
    private double altura;
    private double peso;
    private String objetivo;
    
    
    public Cliente() {
        //internalId++;               //PROBLEMA ID: el problema de hacerlo asi es que cada vez que se crea un cliente, se incrementa el id
        //id = internalId;            //si hacemos consultas o pasos previos creando un auxiliar,etc, al momento de crear un cliente real van a haber Ids salteados
    }

    public Cliente(String nombre, int edad, double altura, double peso, String objetivo) {
        //this();                     //PROBLEMA ID
        internalId++;                   //inicia del id = 1
        id = internalId;                //lo hago asi para evitar el PROBLEMA ID, y cuando ingreso por teclado lo incremento desde el set
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.objetivo = objetivo;
       
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", objetivo=" + objetivo + '}';
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    
    public void setId() {       //PROBLEMA ID
        internalId++;   
        id = internalId; 
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the objetivo
     */
    public String getObjetivo() {
        return objetivo;
    }

    /**
     * @param objetivo the objetivo to set
     */
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
   
  

}
/*Crea una clase de entidad llamada "Cliente" con los siguientes atributos: id, nombre, edad, altura, peso, objetivo
(cadena de caracteres)*/