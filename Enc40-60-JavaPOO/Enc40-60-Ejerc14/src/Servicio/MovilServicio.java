package Servicio;

import Entidad.Movil;
import java.util.Scanner;

public class MovilServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");    
    
    public Movil cargarMovil(){
        Movil mov = new Movil();

        System.out.println("Por favor ingresa la marca del movil: ");
        mov.setMarca(leer.next());
        System.out.println("Por favor ingresa el precio del movil: ");
        mov.setPrecio(leer.nextDouble());
        System.out.println("Por favor ingresa el modelo del movil: ");
        mov.setModelo(leer.next());
        System.out.println("Por favor ingresa la memoria ram del movil: ");
        mov.setRam(leer.nextInt());
        System.out.println("Por favor ingresa el almacenamiento del movil: ");
        mov.setAlmacenamiento(leer.nextInt());

        generarCodigo(mov);
        return mov;
    }
    
    public void generarCodigo(Movil mov){
        
        // es mejor hacerlo como un String así se puede validar y no con un numérico que es más dificil validar la longitud
        int [] aux = new int [mov.getCodigo().length];
        String leido;
        boolean resultado;
        System.out.println("Ingresa los numeros del codigo: ");
        for (int i = 0; i < mov.getCodigo().length; i++) {
            do{
                leido = leer.next();
                resultado = esNumero(leido);
                if(leido.length()>1){System.out.println("Error - Debe tener solo 1 número");}
            }while(resultado == false || leido.length()>1);
            aux[i] = Integer.parseInt(leido);
        }
        mov.setCodigo(aux);
    }
    
    public boolean esNumero(String leido){
	try {
            Integer.parseInt(leido);
            return true;
	} catch (NumberFormatException nfe){
            System.out.println("Error - Solo números se pueden ingresar");
            return false;
	}
}
}
