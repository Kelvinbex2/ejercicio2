package Model;

import Entrada.Entrada;

public class Cajero extends Empleado {
    public static final String TAG = "Cajero";

    public Cajero(String name, int id) {
        super(name, id);
    
    }

    @Override
    public void atender() {
        try {
            StringBuilder sb = new StringBuilder();
            
            sb.append(TAG).append("\n");
            sb.append("name:").append(name).append("\n");
            sb.append("idCajero:").append(id).append("\n");
            sb.append("Tarea: ").append(tareas.getTipo()).append(" esta con el cliente ").append(tareas.getCliente());
            System.out.println(sb.toString());
            Thread.sleep(1000);

        } catch (InterruptedException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("Tarea de " + tareas.getTipo() + " atendida por el cajero " + name +"\n");

        }

    }

    

}
