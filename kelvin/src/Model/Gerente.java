package Model;

public class Gerente extends Empleado {

    private static final Object TAG = "Gerente";

    public Gerente(String name, int id) {
        super(name, id);

    }

    @Override
    public void atender() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(TAG).append("\n");
            sb.append("name: ").append(name).append("\n");
            sb.append("id: ").append(id).append(",");
            sb.append("Tarea: ").append(tareas.getTipo()).append(" esta con  el cliente ").append(tareas.getCliente());
            Thread.sleep(3000,1500);;// Simulamos que se tarda 1 segundo en atender la llamada
            System.out.println(sb.toString());
        } catch (InterruptedException e) {
            e.printStackTrace();

        } finally {
            System.out.println("Tarea de " + tareas.getTipo() + " atendida por el Gerente " + name + "\n");

        }
    }
}
