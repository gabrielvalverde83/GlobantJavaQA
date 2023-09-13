package pkg08.herencia.ejerc04;

import Entidades.Estudiante;
//import Entidades.Persona;
import Entidades.PersonaServicio;
import Entidades.Profesor;
import enumClases.SeccionesEnum;

public class Main {
    public static void main(String[] args) {
        /*Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
        la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
        tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
        información debe gestionar esta aplicación:
            • Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
        identificación y su estado civil.
            • Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
        incorporación a la facultad y qué número de despacho tienen asignado.
            • En cuanto a los estudiantes, se requiere almacenar el curso en el que están
        matriculados.
            • Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
        pertenecen (lenguajes, matemáticas, arquitectura, ...).
            • Sobre el personal de servicio, hay que conocer a qué sección están asignados
                (biblioteca, decanato, secretaría, ...).
        El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
        continuación, debe programar las clases definidas en las que, además de los constructores,
                hay que desarrollar los métodos correspondientes a las siguientes operaciones:
            1 • Cambio del estado civil de una persona.
            2 • Reasignación de despacho a un empleado.
            3 • Matriculación de un estudiante en un nuevo curso.
            4 • Cambio de departamento de un profesor.
            5 • Traslado de sección de un empleado del personal de servicio.
            6 • Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
        que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.*/


        Estudiante e1 = new Estudiante("Pablo","Mosconi","A201","Soltero","5k1");
        Profesor pr1 = new Profesor("Santiago","Lopez","P201","Casado",2019,3312,"CS basicas");
        PersonaServicio ps1 = new PersonaServicio("Magali","Fuentes", "PS201","Casada",2016,22, SeccionesEnum.BIBLIOTECA);

        pr1.setEstadoCivil("viudo");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Profesor");
        System.out.println(pr1);
        System.out.println("--------------------------------------------------------------");

        ps1.setNroDespacho(3312);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Personal de Servicio");
        System.out.println(ps1);
        System.out.println("--------------------------------------------------------------");


        e1.setCurso("5k3");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Alumno");
        System.out.println(e1);
        System.out.println("--------------------------------------------------------------");
        
        
        ps1.setSeccion(SeccionesEnum.values()[1]);
        //ps1.setSeccion(SeccionesEnum.DECANATO);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Otro personal de servicio");
        System.out.println(ps1);
        System.out.println("--------------------------------------------------------------");






    }
}