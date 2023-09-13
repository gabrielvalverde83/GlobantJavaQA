package Servicios;

import Entidades.Curso;
import java.util.Scanner;

public class CursoServicios {
    
    Scanner leer = new Scanner(System.in);
    
    public Curso crearCurso(){
        
        Curso curso = new Curso();
        
        System.out.println("Ingrese:");
        System.out.println("\tel nombre del curso");
        curso.setNombreCurso(leer.next());
        System.out.println("\tcantidad de horas por día");
        curso.setCantHorasPorDia(leer.nextInt());
        System.out.println("\tcantidad de días por semana");
        curso.setCantDiasPorSemana(leer.nextInt());
        System.out.println("\tturno: mañana o tarde");
        curso.setTurno(leer.next());
        System.out.println("\tprecio por hora");
        curso.setPrecioPorHora(leer.nextInt());
                
        cargarAlumnos(curso);
        calcularGanancias(curso);
                
        return curso;
    }
    
    /*
    //////////////////////////////////////////////////////////////////////////////////////////////////
    */

    public void cargarAlumnos(Curso curso){

        System.out.println("Ingrese la cantidad de alumnos que asisten al curso");
        int cantAlumnos = leer.nextInt();
        
        String [] aux = new String [cantAlumnos];
        
        for(int i=0; i<cantAlumnos; i++){
            System.out.println("Ingrese el nombre del alumno" + (i+1));
            aux[i] = leer.next();
        }
        curso.setNombresAlumnos(aux);
    }
    
     /*
    //////////////////////////////////////////////////////////////////////////////////////////////////
    */
    
    public void calcularGanancias(Curso curso){
    
        int ganancias = curso.getCantHorasPorDia()*curso.getCantDiasPorSemana()*curso.getPrecioPorHora()*curso.getNombresAlumnos().length;
        System.out.println("Las ganancias del teacher son : $ " + ganancias);
    }
}
