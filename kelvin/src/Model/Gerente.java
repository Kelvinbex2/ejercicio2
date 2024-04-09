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


            sb.append("Tarea: ").append(tareas.getTipo()).append(" esta con  el cliente ").append(tareas.getCliente());
            Thread.sleep(1000);
            System.out.println(sb.toString());
            sb.setLength(0);

            Thread.sleep(1000);
            System.out.println("Tarea de " + tareas.getTipo() + " atendida por el Gerente " + name + "\n");
            
            

        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}
