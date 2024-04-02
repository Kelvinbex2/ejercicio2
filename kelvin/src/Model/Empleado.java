package Model;

public class Empleado {
    protected String name;
    protected int id;
    protected Tarea tareas;

    public Empleado(String name, int id, Tarea tareas) {
        this.name = name;
        this.id = id;
        this.tareas = tareas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tarea getTareas() {
        return tareas;
    }

    public void setTareas(Tarea tareas) {
        this.tareas = tareas;
    }

    public void atender(){}

}
