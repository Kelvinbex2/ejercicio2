package Model;

public abstract class  Empleado {
    protected String name;
    protected int id;
    protected Tarea tareas;

    public Empleado() {
    }

    public Empleado(String name, int id) {
        this.name = name;
        this.id = id;
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

    public void atender() { }

    public void asignarTarea(Tarea tarea) {
        tareas = tarea;
    }

}
