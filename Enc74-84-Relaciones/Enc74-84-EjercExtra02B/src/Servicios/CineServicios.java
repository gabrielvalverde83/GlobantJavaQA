package Servicios;

import Entidades.Butaca;
import Entidades.Cine;
import Entidades.Pelicula;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class CineServicios {
    
    Cine cine = new Cine();

    /*************************************************************************************/
    
    public void iniciarCine(Pelicula peli){
        
        cine.setPelicula(peli);
        cine.setPrecio(10);
        
        System.out.println("**************************************************");
        System.out.println("                  Info de la Pelicula              ");
        System.out.println("Nombre: " + cine.getPelicula().getNombre());
        System.out.println("Director: " + cine.getPelicula().getDirector());
        System.out.println("Duración: " + cine.getPelicula().getDuracion() + " min");
        System.out.println("Precio de la entrada: $ " + cine.getPrecio());
        System.out.println("Edad mínima: " + cine.getPelicula().getEdad() + " años");
    }
    
    /*************************************************************************************/
    /*************************************************************************************/
    /*************************************************************************************/
        
    public void inicializarButacas(){
        
        int cont = 8;
        String contS;
        String jS;
        char jC;
        
        for(int i=0; i<8; i++){     //i son filas, va del 8 al 1, posic 0 en el vector de Butacas
            contS = String.valueOf(cont);
            jC = 'A';
                for (char j=0; j<6; j++){  //j son columnas, va de la A a la F, posic 1 en el vector de Butacas
                    //cine.setMatrizButaca(i, j, new Butaca("B", "A", "");
                    jS = String.valueOf(jC);
                    //jI = Integer.parseInt(jS);
                    cine.setMatrizButaca(i, j, new Butaca(contS, jS, "  "));
                    jC++;
                }
            cont--;    
        }
    }
    
    /*************************************************************************************/
    /*************************************************************************************/
    /*************************************************************************************/
    
    public void imprimirM(){
                
        System.out.println("");
        System.out.println("Butacas");

        for (int i=0; i<8; i++){
            System.out.println("");
            for (int j=0; j<6;j++){
                System.out.print("[" + cine.getMatrizButaca(i, j).getButaca(0) + "" + cine.getMatrizButaca(i, j).getButaca(1) + "|" + cine.getMatrizButaca(i, j).getButaca(2) + "]  ");
            }
        }
        System.out.println("");
        System.out.println("Capacidad libre de: " + cine.getCapacidadCont() + " asientos");
    }
    
    /*************************************************************************************/
    /*************************************************************************************/
    /*************************************************************************************/
    
    public void imprimirEspaciosLibres(){
                
        System.out.println("");
        System.out.println("Butacas Libres");

        for (int i=0; i<8; i++){
            System.out.println("");
            for (int j=0; j<6;j++){
                if(cine.getMatrizButaca(i, j).getButaca(2).equals("  ")){
                    System.out.print("[" + cine.getMatrizButaca(i, j).getButaca(0) + "" + cine.getMatrizButaca(i, j).getButaca(1) + "]");
                }
            }
        }
        System.out.println("");
    }
    
    /*************************************************************************************/
    /*************************************************************************************/
    /*************************************************************************************/
        
    public void llenarButacasAleat(){
        
        int cont = 0;
        int i,j;
        
        do{
            i = (int)(Math.random()*(7-0+1)+0); //selecciona fila de 0 a 7
            j = (int)(Math.random()*(5-0+1)+0); //selecciona columna entre 0 y 5
            
            if(cine.getMatrizButaca(i, j).getButaca(2).equals("  ")){
                cine.getMatrizButaca(i, j).setButacaOcup();
                cine.setCapacidadCont();
                cont++;
            }
        }while(cont<45);

        imprimirM();
    }
    
    /*************************************************************************************/
    /*************************************************************************************/
    /*************************************************************************************/
    
    public void ubicarPersona(){
        
        Scanner leer = new Scanner(System.in);
        Persona p = new Persona();
        
        if(cine.getCapacidadCont()>0){
            System.out.println("");
            System.out.println("******************************************");
            System.out.println("Ubicacion Persona");
            System.out.println("");
            System.out.println("Ingrese el nombre");
            p.setNombre(leer.next());
            System.out.println("Ingrese la edad");
            p.setEdad(leer.nextInt());
            System.out.println("Ingrese el dinero que tiene disponible");
            p.setDinero(leer.nextInt());

            if (validandoCondiciones(p)) {
                elegirAsiento();
            } else {
                System.out.println("No cumple con los requisitos");
            }
            imprimirM();
        } else{
            System.out.println("No hay capacidad para ingresar más personas");
        }
    }

    /**************************************************************************************/
    
    public void elegirAsiento(){
        
        Scanner leer = new Scanner(System.in);
        String respuesta = "N";
        int fila;
        int columnaInt;
        
        do{ 
            imprimirEspaciosLibres();
            System.out.println("Ingrese fila donde quiere ubicarse");
            fila = validarFila();
            System.out.println("Ingrese asiento donde quiere ubicarse");
            columnaInt = convertirColumna();
            if (cine.getMatrizButaca(fila, columnaInt).getButaca(2).endsWith("  ")) {
                System.out.println("La persona se ubicará en la butaca: " + cine.getMatrizButaca(fila, columnaInt).getButaca(0)+ cine.getMatrizButaca(fila, columnaInt).getButaca(1));
                cine.getMatrizButaca(fila, columnaInt).setButacaOcupP(" P");
                cine.setCapacidadCont();
                respuesta = "N";
            } else {
                System.out.println("El lugar elegido está ocupado");
                System.out.println("Desea probar con otro? S o N");
                do {
                    respuesta = leer.next().toUpperCase();
                    if (!respuesta.equals("S") && !respuesta.equals("N")) {
                        System.out.println("Error - Ingrese S o N");
                    }
                } while (!respuesta.equals("S") && !respuesta.equals("N"));
            }
        } while(respuesta.equals("S"));
    }
    
    /**************************************************************************************/
        
    public int validarFila(){
        
        Scanner leer = new Scanner(System.in);
        int ingreso = 0;
        boolean validacion;

        do {
            System.out.println("Ingrese un numero cuyo valor debe ser mayor a 1 y menor a 8");
            validacion = true;    
            try {
                ingreso = Integer.parseInt(leer.next());
            }catch (Exception e) {
                validacion = false;
                System.out.println("Error - Ingrese un número valido");
            }
            if(validacion == false || ingreso < 1 || ingreso > 8){System.out.println("ERROR");}
        } while (validacion == false || ingreso < 1 || ingreso > 8);
    
        return (8-ingreso);
    
    }

    /**************************************************************************************/
    
    public int convertirColumna(){
        
        Scanner leer = new Scanner(System.in);
        String columna;
        int columnaN = 0;
        boolean validacion;
        
        do{
            System.out.println("Ingrese una letra entre la A y la F");
            columna = leer.next().toUpperCase();
            validacion = true;
            switch (columna) {
                case "A":
                    columnaN = 0;
                    break;
                case "B":
                    columnaN = 1;
                    break;
                case "C":
                    columnaN = 2;
                    break;
                case "D":
                    columnaN = 3;
                    break;
                case "E":
                    columnaN = 4;
                    break;
                case "F":
                    columnaN = 5;
                    break;
                default:
                    System.out.println("ERROR");
                    System.out.println("Ingrese opción válida");
                    validacion = false;
            }
        }while(validacion == false);
        
        
        
        return columnaN;
    }
    
    /*************************************************************************************/
    /*************************************************************************************/
    /*************************************************************************************/
    
    public boolean validandoCondiciones(Persona p){
        
        
        if (p.getDinero() >= cine.getPrecio()) {
            if (p.getEdad() >= cine.getPelicula().getEdad()) {
                System.out.println("Cumple los requisitos");
                return true;
            } else {
                System.out.println("No cumple con la edad");
            }
        } else {
            System.out.println("No tiene suficiente dinero");
        }
        

        return false;
    }
    
    /*************************************************************************************/
    /*************************************************************************************/
    /*************************************************************************************/
    
    public void ubicarAleatoriamPersonas(ArrayList<Persona> listadoPersonas){
        
        boolean personaValid;
        int contNoIng = 0;
        int cont = 0;
        
        do{
            System.out.println(listadoPersonas.get(cont).getNombre());
            personaValid = validandoCondiciones(listadoPersonas.get(cont));
            if (personaValid) {
                elegirAsiento();
            }
            cont++;
            System.out.println("*****************");
        }while(cine.getCapacidadCont()>0);
        
        System.out.println("No hay capacidad para ingresar más personas");
        imprimirM();
    }
    
}
