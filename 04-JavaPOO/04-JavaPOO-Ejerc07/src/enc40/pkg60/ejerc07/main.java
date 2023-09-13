package enc40.pkg60.ejerc07;

import Entidades.Persona;
import Servicio.PersonaServicio;
import java.util.Scanner;

/**
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, 
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro 
atributo, puede hacerlo. Los métodos que se implementarán son: 
 Un constructor por defecto. 
 Un constructor con todos los atributos como parámetro. 
 Métodos getters y setters de cada atributo. 
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos 
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o 
O. Si no es correcto se deberá mostrar un mensaje 
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, 
significa que la persona está por debajo de su peso ideal y la función devuelve un -1. 
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la 
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado 
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la 
función devuelve un 1. 
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función 
devuelve un booleano. 
A continuación, en la clase main hacer lo siguiente: 
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos 
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, 
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la 
persona es mayor de edad. 
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en 
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas 
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y 
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores 
 */
public class main {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        PersonaServicio ps = new PersonaServicio();
        
        System.out.println("Ingrese la cantidad de personas a ingresar:");
        int dimension = leer.nextInt();
        
        Persona [] vector = new Persona [dimension];
        
        for(int i=0; i<vector.length; i++){
            
            Persona p = ps.crearPersona();
            
            vector[i] = p;
            
            p.setImc(ps.calcularIMC(p));
            p.setMayor(ps.mayorEdad(p));
        }
        
        //analizar(vector); //para hacer una fc aca, la fc main no tiene que ser estatica
        //por eso lo hago en el main, ya que aun no vimos eso
        
        int contIMCbajo = 0;
        int contIMCideal = 0;
        int contMayor = 0;
               
        for (Persona vector1 : vector) {
            if (vector1.getImc() < 0) {
                contIMCbajo ++;
            } else if (vector1.getImc() == 0) {
                contIMCideal ++;
            }
            
            if (vector1.getMayor() == true) {
                contMayor++;
            }
        }
        
        System.out.println("**************************************************");
        System.out.println("Porcentaje de personas que: "
                + "\nestán por debajo de su peso: " + contIMCbajo*100/dimension + " %"
                + "\nestán con un peso ideal: " + contIMCideal*100/dimension + " %"
                + "\nestán por encima de su peso: " + (dimension - contIMCbajo-contIMCideal)*100/dimension + " %");
                
        System.out.println("Porcentaje de personas que: "
                + "\nSon mayores de edad: " + contMayor*100/dimension + " %"
                + "\nSon menores de edad: " + (dimension-contMayor)*100/dimension + " %");
        
        
        
    }
}
