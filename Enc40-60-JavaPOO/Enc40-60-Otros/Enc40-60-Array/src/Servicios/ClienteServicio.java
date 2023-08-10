package Servicios;

import Entidades.Cliente;
import java.util.ArrayList;
//import java.util.List;
import java.util.Optional;
import java.util.Scanner;
//import java.util.stream.Collectors;

/* @author jmlucero */
public class ClienteServicio {

    ArrayList<Cliente> clientes = new ArrayList<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void inicializarClientes() {
        //3 maneras distintas de crear objetos y agregarlos al arraylist
        
        Cliente cli1 = new Cliente("Pepita", 45, 1.8, 78, "Bajar Peso");
        clientes.add(cli1);

        clientes.add(new Cliente("Juanelo", 40, 2.00, 55, "Marcar"));
        clientes.add(new Cliente("Juanelo", 25, 1.75, 80, "Marcar"));
        clientes.add(new Cliente("Juanelo", 45, 1.45, 60, "Marcar"));

        Cliente cli2 = new Cliente();
        cli2.setNombre("Hermenegilda");
        cli2.setEdad(40);
        cli2.setAltura(1.68);
        cli2.setObjetivo("Levantar Gluteos");
        clientes.add(cli2);
    }
    
    /*************************************************************************************************/
    /*************************************************************************************************/
    /*************************************************************************************************/

    public void registrarCliente() {
        Cliente cl1 = new Cliente();

        System.out.println("");
        
        try {
            System.out.println("Introduzca el nombre del cliente");
            cl1.setNombre(leer.next());
            System.out.println("Ingrese la edad");
            cl1.setEdad(leer.nextInt());
            System.out.println("Ingrese su altura en cm");
            cl1.setAltura(Double.parseDouble(leer.next()));
            System.out.println("Ingrese su peso");
            cl1.setPeso(leer.nextDouble());
            System.out.println("Ingrese el objetivo");
            cl1.setObjetivo(leer.next());
            clientes.add(cl1);
        } catch (NumberFormatException e) {
            System.out.println("Error en el ingreso de los datos");
            System.out.println("Reintente");
        }
    }
    
    /*************************************************************************************************/
    /*************************************************************************************************/
    /*************************************************************************************************/

    public void actualizarCliente() {

            Cliente opcion = encontrarClientes();
            
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
        Cliente opcion=encontrarClientes();
        clientes.remove(opcion);
        obtenerClientes();
        
    }
    
    /*************************************************************************************************/
    /*************************************************************************************************/
    /*************************************************************************************************/
 
    public Cliente encontrarClientes() {
        
        System.out.println("");
        System.out.println("Ingrese el nombre para la búsqueda");
        ArrayList<Cliente> resultset = new ArrayList();
        
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
        Cliente clienteOpcion = new Cliente();
       
        if (resultset.size() > 1) {
            System.out.println("Hay más de una coincidencia con su búsqueda");
            System.out.println("Ingrese el id de la persona a seleccionar del siguiente listado");
            resultset.forEach(System.out::println);
            int seleccion = leer.nextInt();
            Optional<Cliente> clienteEncontrado = clientes.stream()
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


//        for (Object cliente : clientes) {
//            System.out.println(cliente);
//        }
        // clientes.forEach(cliente -> System.out.println(cliente));
        // clientes.forEach(System.out::println);
    }
}


/*RegistrarCliente: lo registra en el sistema.
obtenerClientes(): devuelve una lista con todos los clientes registrados en el sistema.
actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo): recibe el identificador
de un cliente existente y los nuevos datos del cliente, y actualiza la información correspondiente en el sistema.
eliminarCliente(int id): recibe el identificador de un cliente existente y lo elimina del sistema.*/
