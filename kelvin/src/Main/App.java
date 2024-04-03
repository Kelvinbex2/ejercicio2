package Main;

import Model.Asesores;
import Model.Cajero;
import Model.Cola;
import Model.Empleado;
import Model.Gerente;
import Model.Tarea;

public class App {

    
    public static void main(String[] args) throws Exception {
        // Crear cola de tareas
        Cola cola = new Cola();
        // Agregar empleados a la cola de tareas

        Tarea tarea1=new Tarea("Cajero","Kelvin");
        Tarea tarea2=new Tarea("Asesores","Noma");
        Tarea tarea3=new Tarea("Gerente","Davida");

        // Crear empleados
        Empleado asesores = new Asesores("Mazta", 1);
        Empleado gerente = new Gerente("Fabaz", 2);
        Empleado cajero = new Cajero("Claraz", 3);
        
        // Agregar empleados a la cola de tareas
        cola.agregar(tarea1);
        cola.agregar(tarea2);
        cola.agregar(tarea3);

        
            Tarea tarea = cola.obtener();
            if (tarea != null) {


                cajero.asignarTarea(tarea);
                cajero.atender();

                asesores.asignarTarea(tarea);
                asesores.atender();

                gerente.asignarTarea(tarea);
                gerente.atender();

                
                
            }
        

        
        
    }



    
}
