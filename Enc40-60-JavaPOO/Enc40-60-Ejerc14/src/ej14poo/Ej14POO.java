package ej14poo;

/*Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo*/

import Entidad.Movil;
import Servicio.MovilServicio;

public class Ej14POO {

    public static void main(String[] args) {
        
        MovilServicio mov = new MovilServicio();
        
        Movil mov1 = mov.cargarMovil();
        Movil mov2 = mov.cargarMovil();

        System.out.println(mov1.toString());
        System.out.println(mov2.toString());
    }
    
}

