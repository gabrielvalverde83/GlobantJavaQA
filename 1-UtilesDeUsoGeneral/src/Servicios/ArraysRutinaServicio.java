package Servicios;

import Entidades.ArraysRutina;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import java.util.Scanner;

public class ArraysRutinaServicio {
    
    ArrayList<ArraysRutina> rutinas = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void inicializarRutinas(){
    
        //rutinas.add(new Rutina("Adaptacion", ("3x2 - Plancha", "5x4 - Abdominales")));
        
        ArrayList<String> ejerciciosAux = new ArrayList();
        ejerciciosAux.add("4x10 - Plancha");
        ejerciciosAux.add("4x8 - Abdominales");
        rutinas.add(new ArraysRutina("Adaptacion", ejerciciosAux));
        
        ArrayList<String> ejerciciosAux2 = new ArrayList();
        ejerciciosAux2.add("4x10 - Estocadas");
        ejerciciosAux2.add("4x8 - Mancuernas biceps");
        ejerciciosAux2.add("4x8 - Triceps parado");
        rutinas.add(new ArraysRutina("Adaptacion2", ejerciciosAux2));
        
        ArrayList<String> ejerciciosAux3 = new ArrayList();
        ejerciciosAux3.add("8x4 - Pecho acostado");
        ejerciciosAux3.add("8x4 - Mancuernas biceps acostado");
        ejerciciosAux3.add("8x4 - Triceps acostado");
        rutinas.add(new ArraysRutina("Fuerza", ejerciciosAux3));
        
        ArrayList<String> ejerciciosAux4 = new ArrayList();
        ejerciciosAux4.add("4x15 - Abdominales acostado");
        ejerciciosAux4.add("4x12 - Lagartijas");
        rutinas.add(new ArraysRutina("Adaptacion3", ejerciciosAux4));
        
        ArrayList<String> ejerciciosAux5 = new ArrayList();
        ejerciciosAux5.add("8x4 - Pecho 45°");
        ejerciciosAux5.add("8x4 - Sentadillas");
        ejerciciosAux5.add("8x4 - Cuadriceps sentado");
        ejerciciosAux5.add("8x4 - Isquiostobiales acostado");
        ejerciciosAux5.add("8x4 - Biceps parado");
        rutinas.add(new ArraysRutina("Volumen", ejerciciosAux5));
    }
    
    /*************************************************************************************************/
    /*************************************************************************************************/
    /*************************************************************************************************/
        
    public void obtenerRutinas() {
        System.out.println("");
        System.out.println("------ DATOS  DE  LAS  RUTINAS -------");
        rutinas.forEach(System.out::println);
    }
    
    /*************************************************************************************************/
    /*************************************************************************************************/
    /*************************************************************************************************/
    
    public void registrarRutina() {
        ArraysRutina rutinaAux = new ArraysRutina();
        ArrayList<String> ejerciciosAuxReg = new ArrayList();
        
        System.out.println("");
        System.out.println("Introduzca el nombre de la rutina");
        rutinaAux.setNombre(leer.next());
        
        registrarEjercicios(ejerciciosAuxReg);   

        rutinaAux.setId();
        rutinaAux.setEjercicios(ejerciciosAuxReg);
        rutinas.add(rutinaAux);
    }    
    
     /*************************************************************************************************/
    /*************************************************************************************************/
    /*************************************************************************************************/
    
    public void registrarEjercicios(ArrayList ejerciciosAuxReg){
        
        String respuesta;
        String ejercicio;
        
        do {
            System.out.println("Introduzca el número de las repeticiones");
            ejercicio = leer.next();
            System.out.println("Introduzca el número de las series");
            ejercicio = ejercicio + "x"+ leer.next();
            System.out.println("Introduzca el nombre del ejercicio");
            ejercicio = ejercicio + " - " + leer.next();
            System.out.println("Desea ingresar otro? S o N");
            ejerciciosAuxReg.add(ejercicio);
            do {
                respuesta = leer.next().toUpperCase();
                if (!respuesta.equals("S") && !respuesta.equals("N")) {
                    System.out.println("Error - Ingrese S o N");
                }
            } while (!respuesta.equals("S") && !respuesta.equals("N"));
        } while (respuesta.equals("S"));
    }   
    
    
    /*************************************************************************************************/
    /*************************************************************************************************/
    /*************************************************************************************************/
    
    public void actualizarRutina() {

        ArraysRutina opcion = encontrarRutinas();
        ArrayList<String> ejerciciosAuxReg = new ArrayList();

        if (opcion.getNombre() != null) {
            
            int datoAMod;

            boolean salir;
            do {
                System.out.println("");
                System.out.println("Seleccione el dato a modificar:\n"
                    + "\n 1.NOMBRE"
                    + "\n 2.EJERCICIOS"
                    + "\n 9.Salir sin modificar");
                do {
                    datoAMod = leer.nextInt();
                } while ((datoAMod < 1 || datoAMod > 2) && datoAMod != 9);
                salir = true;
                switch (datoAMod) {
                    case 1:
                        System.out.println("Ingrese el nombre correcto");
                        opcion.setNombre(leer.next());
                        break;
                    case 2:
                        eliminarTodosElementosArray(opcion);
                        registrarEjercicios(ejerciciosAuxReg);
                        opcion.setEjercicios(ejerciciosAuxReg);
                        break;
                    case 9:
                        System.out.println("Saliendo");
                        salir = false;
                        break;
                    default:
                        System.out.println("Error - No ingreso dato valido");
                        System.out.println("Vuelva a ingresar una opción para modificar y sino 9 para salir");
                }
                
            } while (salir == true);
            
            System.out.println("");
            System.out.println("Los datos actualizados son");
            System.out.println(opcion);
        } else {
            System.out.println("");
            System.out.println("Saliendo sin actualizar por no encontrar rutina coincidente");
        }
    }

    /*************************************************************************************************/
    /*************************************************************************************************/
    /*************************************************************************************************/
        
    public void eliminarRutina() {
        ArraysRutina opcion=encontrarRutinas();
        
        if(opcion.getNombre() != null){rutinas.remove(opcion);}
        else{
            System.out.println("");
            System.out.println("Saliendo sin eliminar por no encontrar rutina coincidente");
        }
    }
    
    /*************************************************************************************************/
    /*************************************************************************************************/
    /*************************************************************************************************/
        
    public void eliminarTodosElementosArray(ArraysRutina opcion){
        
        Iterator<String> it = opcion.getEjercicios().iterator();
        String aux;
        
        while(it.hasNext()){
            aux = it.next();
            it.remove();
        }
    }

    /*************************************************************************************************/
    /*************************************************************************************************/
    /*************************************************************************************************/
 
    public ArraysRutina encontrarRutinas() {
        
        System.out.println("");
        System.out.println("Ingrese el nombre para la búsqueda");
        ArrayList<ArraysRutina> resultset = new ArrayList();
        
        boolean noEncontrado;
        String nombre;
        
        do {
            nombre = leer.next();
            noEncontrado = false;

            for (int i = 0; i < rutinas.size(); i++) {
                if (rutinas.get(i).getNombre().equalsIgnoreCase(nombre)) {
                    resultset.add(rutinas.get(i));
                }
            }
            
            if (resultset.isEmpty()) {
                System.out.println("No se han encontrado clientes coincidentes");
                System.out.println("Pruebe con otro nombre o ! para salir");
                noEncontrado = true;
            }
        } while (true == noEncontrado && !nombre.equals("!"));

        ArraysRutina rutinaOpcion = new ArraysRutina();
        
        if (resultset.size() > 1) {
            String respuesta;
            System.out.println("Hay más de 1 coincidencia con su búsqueda");
            System.out.println("Ingrese el id de la persona a seleccionar del siguiente listado");
            resultset.forEach(System.out::println);
            int seleccion = leer.nextInt();
            Optional<ArraysRutina> clienteEncontrado = resultset.stream()
                    .filter(rutina -> rutina.getId() == seleccion)
                    .findFirst();
            rutinaOpcion = clienteEncontrado.get();
        } else if(resultset.size() == 1){
            rutinaOpcion = resultset.get(0);
        } else {
            System.out.println("");
            System.out.println("No se encontraron resultados");
            System.out.println("Saliendo");
        }
        
        return rutinaOpcion;
    }
    
    
    
    
    

    
    
    
    
    
    
    
}
