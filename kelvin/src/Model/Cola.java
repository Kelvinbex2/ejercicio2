package Model;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    private Queue<Tarea> tareas;
    private boolean hayTareas;

    public Cola() {
        tareas = new LinkedList<>();
        this.hayTareas = true;
    }

    public Queue<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(Queue<Tarea> tareas) {
        this.tareas = tareas;
    }

    public boolean isHayTareas() {
        return hayTareas;
    }

    public void setHayTareas(boolean hayTareas) {
        this.hayTareas = hayTareas;
    }

    public void agregar(Tarea tarea){
        tareas.add(tarea);
    }

    public Tarea obtener(){
        return tareas.poll();
    }

   

}
