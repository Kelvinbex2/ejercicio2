package Model;

public class Asesores extends Empleado {

    private static final Object TAG = "Asesores";

    public Asesores(String name, int id) {
        super(name, id);
        
    }

    @Override
    public void atender() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(TAG).append("\n");
            sb.append("name: ").append(name).append("\n");
            sb.append("id: ").append(id).append("\n");
            sb.append("Tarea: ").append(tareas.getTipo()).append(" esta con el cliente ").append(tareas.getCliente());
            System.out.println(sb.toString());
            Thread.sleep(3000);// Simulamos que se tarda 1 segundo en atender la llamada
           
        } catch (InterruptedException e) {
            e.printStackTrace();

        } finally {
            System.out.println("Tarea de " + tareas.getTipo().toString() + " atendida por Asesores " + name+"\n");

        }
    }

}
