package enc61.pkg62.ejerc04;

import Servicios.TareaServicios;

/*
Crea una clase TaskManager que permita agregar, eliminar y listar tareas.
Escribe pruebas unitarias para verificar que el gestor de tareas realiza las operaciones
correctamente, como agregar una tarea, eliminar una tarea existente y listar las tareas disponibles.
*/

public class Main {

    public static void main(String[] args) {
        
        TareaServicios ts = new TareaServicios();
        
        for(int i=0; i<3; i++){
            ts.crearTarea();
        }
        
        ts.mostrarTares();
        ts.eliminarTarea();
        ts.mostrarTares();
    }
    
}
