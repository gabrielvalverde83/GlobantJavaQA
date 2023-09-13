package enc40.pkg60.ejerc03;

import Entidades.Operacion;
import Servicio.OperacionServicio;

/**
Crear una clase llamada Operacion que tenga como atributos privados numero1 y 
numero2. A continuación, se deben crear los siguientes métodos: 
a) Método constructor con todos los atributos pasados por parámetro. 
b) Metodo constructor sin los atributos pasados por parámetro. 
c) Métodos get y set. 
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda 
en los atributos del objeto. 
e) Método sumar(): calcular la suma de los números y devolver el resultado al Main. 
f) Método restar(): calcular la resta de los números y devolver el resultado al Main 
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si 
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. 
Si no, se hace la multiplicación y se devuelve el resultado al Main 
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar 
una división por cero, el método devuelve 0 y se le informa al usuario el error se le 
informa al usuario. Si no, se hace la división y se devuelve el resultado al Main. 

 */
public class Main {

    public static void main(String[] args) {
        
        OperacionServicio os = new OperacionServicio();
        
        Operacion op1 = os.crearOperacion();
        
        os.sumar(op1);
        os.restar(op1);
        os.multiplicar(op1);
        os.dividir(op1);
    }
    
}
