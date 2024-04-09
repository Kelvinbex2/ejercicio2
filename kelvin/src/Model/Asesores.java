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
            sb.append(TAG).append("");
            Thread.sleep(1000);
            System.out.println(sb.toString());
            sb.setLength(0);

            sb.append("name: ").append(name).append("");
            Thread.sleep(1000);
            System.out.println(sb.toString());
            sb.setLength(0);

            sb.append("id: ").append(id).append("");
            Thread.sleep(1000);
            System.out.println(sb.toString());
            sb.setLength(0);


            sb.append("Tarea: ").append(tareas.getTipo()).append(" esta con el cliente ").append(tareas.getCliente());
            System.out.println(sb.toString());
            Thread.sleep(1000);
            sb.setLength(0);

            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();

        } finally {
            System.out.println("Tarea de " + tareas.getTipo().toString() + " atendida por Asesores " + name + "\n");

        }
    }

}
