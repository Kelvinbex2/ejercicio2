package Model;

public class Gerente extends Empleado{

    private static final Object TAG = "Gerente";
    public Gerente(String name, int id, Tarea tareas) {
        super(name, id, tareas);
        
    }
    @Override
    public void atender(){
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(TAG).append(",");
            sb.append("name=").append(name).append(", ");
            sb.append("id=").append(id).append(",");
            sb.append("Tareas").append(tareas).append(",");
            sb.append("por el cliente").append(tareas.getCliente());
            Thread.sleep(4000);// Simulamos que se tarda 1 segundo en atender la llamada
            System.out.println(sb.toString());
        } catch (InterruptedException e) {
            e.printStackTrace();

        } finally {
            System.out.println("Tarea de " + tareas.getTipo() + " atendida por el Gerente " + name);

        }
    }
}
