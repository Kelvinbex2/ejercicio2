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

        Tarea tarea1=new Tarea(null, );

        // Crear empleados
        Empleado asesores = new Asesores("Asesores", 1, null);
        Empleado gerente = new Gerente("Gerente", 2, null);
        Empleado cajero = new Cajero("Cajero", 3, null);
        
        // Agregar empleados a la cola de tareas
        cola.agregar(asesores);
        cola.agregarTarea(gerente);
        cola.agregar(cajero);
        
    }
}
