package Servicios;

import Entidades.ArraysClienteConId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import java.util.Scanner;

public class ArraysClienteServicio {

    ArrayList<ArraysClienteConId> clientes = new ArrayList<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void inicializarClientes() {
        //3 maneras distintas de crear objetos y agregarlos al arraylist
        
        ArraysClienteConId cli1 = new ArraysClienteConId("Pepita", 45, 180, 78, "Bajar Peso");
        clientes.add(cli1);

        clientes.add(new ArraysClienteConId("Juanelo", 40, 200, 55, "Marcar"));
        clientes.add(new ArraysClienteConId("Juanelo", 25, 175, 80, "Marcar"));
        clientes.add(new ArraysClienteConId("Juanelo", 45, 145, 60, "Marcar"));
        
        //otra forma de agregar
        
        ArraysClienteConId cli2 = new ArraysClienteConId();
        cli2.setNombre("Hermenegilda");
        cli2.setEdad(40);
        cli2.setAltura(168);
        cli2.setObjetivo("Levantar Gluteos");
        cli2.setId();
        clientes.add(cli2);
    }
    
    /*************************************************************************************************/
    /*************************************************************************************************/
    /*************************************************************************************************/
    
    //validacion general con try & catc, fc registrar cliente, creando un objeto cliente
        
    public void registrarCliente() {
        ArraysClienteConId clienteAux = new ArraysClienteConId();
        boolean validacion;
        

        System.out.println("");
         
        do{
            try {
                validacion = false; 
                System.out.println("Introduzca el nombre del cliente");
                clienteAux.setNombre(leer.next());
                System.out.println("Ingrese la edad");
                clienteAux.setEdad(leer.nextInt());
                System.out.println("Ingrese su altura en m");
                clienteAux.setAltura(leer.nextDouble());
                //clienteAux.setAltura(Double.parseDouble(leer.next()));
                System.out.println("Ingrese su peso en kg");
                clienteAux.setPeso(leer.nextDouble());
                //clienteAux.setPeso(Double.parseDouble(leer.next()));
                System.out.println("Ingrese el objetivo");
                clienteAux.setObjetivo(leer.next());
                //catch (NumberFormatException e)
            } catch (Exception e) {
                System.out.println("");
                System.out.println("******************************************************************************");
                System.out.println("Error en el ingreso de los datos");
                System.out.println("Reingrese los valores solicitados");
                validacion = true;
            }
        }while(validacion);
        
        clienteAux.setId();
        clientes.add(clienteAux);
    }
    
    /*************************************************************************************************/
    /*************************************************************************************************/
    /*************************************************************************************************/

    public void actualizarCliente() {

            ArraysClienteConId opcion = encontrarClientes();
            
            System.out.println("");
            System.out.println("Seleccione el dato a modificar:\n"
                    + "\n 1.NOMBRE"
                    + "\n 2.EDAD"
                    + "\n 3.ALTURA"
                    + "\n 4.PESO"
                    + "\n 5.OBJETIVO"
                    + "\n 9.Salir sin modificar");
            
            int datoAMod;
              
            boolean salir;
            do{
                do{
                    datoAMod = leer.nextInt();
                } while ((datoAMod <1 || datoAMod >6) && datoAMod!=9);
                salir = true;
                switch (datoAMod) {
                    case 1:
                        System.out.println("Ingrese el nombre correcto");
                        opcion.setNombre(leer.next());
                        break;
                    case 2:
                        System.out.println("Ingrese la edad correcta");
                        opcion.setEdad(leer.nextInt());
                        break;
                    case 3:
                        System.out.println("Ingrese el altura correcto");
                        opcion.setAltura(Double.parseDouble(leer.next()));
                        break;
                    case 4:
                        System.out.println("Ingrese el peso correcto");
                        opcion.setPeso(Double.parseDouble(leer.next()));
                        break;
                    case 5:
                        System.out.println("Ingrese el objetivo correcto");
                        opcion.setObjetivo(leer.next());
                        break;
                    case 9:
                        System.out.println("Saliendo");
                        salir = false;
                        break;
                    default:
                        System.out.println("Error - No ingreso dato valido");
                }
                System.out.println("Vuelva a ingresar una opción para modificar y sino 9 para salir");
            } while(salir == false);           
            
             System.out.println("Los datos actualizados son");
             System.out.println(opcion);
             

        
    }

    /*************************************************************************************************/
    /*************************************************************************************************/
    /*************************************************************************************************/
        
    public void eliminarCliente() {
        ArraysClienteConId opcion=encontrarClientes();
        clientes.remove(opcion);
        obtenerClientes();
        
    }
    
    /*************************************************************************************************/
    /*************************************************************************************************/
    /*************************************************************************************************/
 
    public ArraysClienteConId encontrarClientes() {
        
        System.out.println("");
        System.out.println("Ingrese el nombre para la búsqueda");
        ArrayList<ArraysClienteConId> resultset = new ArrayList();
        
        boolean noEncontrado;
        String nombre;
        
        do {
            nombre = leer.next();
            noEncontrado = false;

            for (int i = 0; i < clientes.size(); i++) {
                if (clientes.get(i).getNombre().equalsIgnoreCase(nombre)) {
                    resultset.add(clientes.get(i));
                }
            }
            
            if (resultset.isEmpty()) {
                System.out.println("No se han encontrado clientes coincidentes");
                System.out.println("Pruebe con otro nombre o ! para salir");
                noEncontrado = true;
            }
        } while (true == noEncontrado && !nombre.equals("!"));

        String respuesta;
        ArraysClienteConId clienteOpcion = new ArraysClienteConId();
       
        if (resultset.size() > 1) {
            System.out.println("Hay más de una coincidencia con su búsqueda");
            System.out.println("Ingrese el id de la persona a seleccionar del siguiente listado");
            resultset.forEach(System.out::println);
            int seleccion = leer.nextInt();
            Optional<ArraysClienteConId> clienteEncontrado = clientes.stream()
                    .filter(cliente -> cliente.getId() == seleccion)
                    .findFirst();
            clienteOpcion = clienteEncontrado.get();
        } else {
            clienteOpcion = resultset.get(0);
        }
        
        return clienteOpcion;
        
    }

    /*************************************************************************************************/
    /*************************************************************************************************/
    /*************************************************************************************************/

    public void obtenerClientes() {
        System.out.println("");
        System.out.println("------ DATOS  DE  LOS  CLIENTES -------");
        
        clientes.forEach((cliente) -> {
            System.out.println(cliente);
        });
    }
    
    
    /*************************************************************************************************/
    /*************************************************************************************************/
    /*************************************************************************************************/
  
    // otras cosas de Arrays //////////////////
    
    // borrando todos los elementos de la lista   
    
    
    public void eliminarTodosElementosArray(ArrayList clientes){
        
        Iterator<String> it = clientes.iterator();
        String aux;
        
        while(it.hasNext()){
            aux = it.next();
            
            //if(aux.equals("tal cosa")){it.remove;}

            it.remove();
        }
    }

    
    /*************************************************************************************************/
    /*************************************************************************************************/
    /*************************************************************************************************/
    


    
        
        
 }
    
    
    
    
    
    
    



/*RegistrarCliente: lo registra en el sistema.
obtenerClientes(): devuelve una lista con todos los clientes registrados en el sistema.
actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo): recibe el identificador
de un cliente existente y los nuevos datos del cliente, y actualiza la información correspondiente en el sistema.
eliminarCliente(int id): recibe el identificador de un cliente existente y lo elimina del sistema.*/
