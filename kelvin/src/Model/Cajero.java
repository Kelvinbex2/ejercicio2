package Model;

import Entrada.Entrada;

public class Cajero extends Empleado {
    public static final String TAG = "Cajero";

    public Cajero(String name, int id, Tarea tareas) {
        super(name, id, tareas);
    
    }

    @Override
    public void atender() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(TAG).append(",");
            sb.append("name=").append(name).append(", ");
            sb.append("id=").append(id).append(",");
            sb.append("Tareas").append(tareas).append(",");
            sb.append("por el cliente").append(tareas.getCliente());
            System.out.println(sb.toString());
            Thread.sleep(1000);

        } catch (InterruptedException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("Tarea de " + tareas.getTipo() + " atendida por el cajero " + name);

        }

    }

    

}
