package Servicios;

import Entidades.Butaca;
import Entidades.Cine;
import java.util.Arrays;
import java.util.Scanner;


public class CineServicios {
    
    Cine cine = new Cine();

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
        System.out.println("");
        System.out.println("Butacas");

        for (int i=0; i<8; i++){
            System.out.println("");
            for (int j=0; j<6;j++){
                System.out.print("[" + cine.getMatrizButaca(i, j).getButaca(0) + "]" + "[" + cine.getMatrizButaca(i, j).getButaca(1) + "]" + "[" + cine.getMatrizButaca(i, j).getButaca(2) + "]");
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
                cine.getMatrizButaca(i, j).setButacaOcup(2);
                cont++;
            }
        }while(cont<20);
            
         imprimirM();
    }
    
    /*************************************************************************************/
    /*************************************************************************************/
    /*************************************************************************************/
    
    public void ubicarPersona(){
        System.out.println("");
        System.out.println("******************************************");
        System.out.println("Ubicacion Personas");
        System.out.println("");
        System.out.println("Ingrese fila donde quiere ubicarse");
        int fila = validarFila();
        int columnaInt = Integer.parseInt(convertirColumna());
        if(cine.getMatrizButaca(fila, columnaInt).getButaca(2).endsWith("  ")){
            System.out.println("La ubicación está vacia");
            System.out.println("Validando dinero....");
            cine.getMatrizButaca(fila, columnaInt).setButacaOcup(2);
        }
        imprimirM();
        
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
    
        return (ingreso-1);
    
    }
    
    
    
    
    /**************************************************************************************/
    
    public String convertirColumna(){
        
        Scanner leer = new Scanner(System.in);
        String columna;
        boolean validacion;
        
        do{
            System.out.println("Ingrese una letra entre la A y la F");
            columna = leer.next().toUpperCase();
            validacion = true;
            switch (columna) {
                case "A":
                    columna = "0";
                    break;
                case "B":
                    columna = "1";
                    break;
                case "C":
                    columna = "2";
                    break;
                case "D":
                    columna = "3";
                    break;
                case "E":
                    columna = "4";
                    break;
                case "F":
                    columna = "5";
                    break;
                default:
                    System.out.println("ERROR");
                    System.out.println("Ingrese opción válida");
                    validacion = false;
            }
        }while(validacion == false);
        
        return columna;
    }
    
    
    
    
    
    
}
