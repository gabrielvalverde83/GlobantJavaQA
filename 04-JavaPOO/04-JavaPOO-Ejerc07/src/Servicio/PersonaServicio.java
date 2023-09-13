package Servicio;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
    
        Persona p = new Persona();
        
        System.out.println("Ingrese el nombre de la persona");
        p.setNombre(leer.next());
        System.out.println("Ingrese la edad");
        int edad;
        do{
            edad = leer.nextInt();
            p.setEdad(edad);
            if(edad<0){System.out.println("Error - Debe ser mayor a cero");}
        } while(edad<0);
        
        System.out.println("Ingrese el sexo:"
                + "\nH - Para Hombre"
                + "\nM - Para Mujer"
                + "\nO - Otro");
        String sexo;
        do{
            sexo = leer.next().toUpperCase();
            p.setSexo(sexo);
            if (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")){System.out.println("Error - Ingrese una opción valida");}
        }while(!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O"));
        
        return p;
    }
    
    public int calcularIMC(Persona p){

        System.out.println("Ingrese el peso de la persona en kg");
        
        double peso;
        do{
            peso = leer.nextDouble();
            p.setPeso(peso);
            if(peso<0){System.out.println("Error - Debe ser mayor a cero");}
        } while(peso<0);
        
        double altura;
        System.out.println("Ingrese la altura");
        do{
            altura = leer.nextDouble();
            p.setAltura(altura);
            if(altura<0){System.out.println("Error - Debe ser mayor a cero");}
        } while(altura<0);
                
        double imc = p.getPeso()*Math.pow(p.getAltura(), 2);
        int resultado;
        
        if (imc < 20){
            resultado = -1;
        } else if(imc <= 20 && imc >= 25){
            resultado = 0;
        } else {
            resultado = 1;
        }
        return resultado;
    }
    
    public boolean mayorEdad(Persona p){
        boolean mayor;
        mayor = p.getEdad() >= 18;
        return mayor;
    }
}
        
