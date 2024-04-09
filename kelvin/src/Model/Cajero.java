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
            
            sb.append(TAG).append("");
            Thread.sleep(1000);
            System.out.println(sb.toString());
            
            sb.setLength(0); // Limpiamos el StringBuilder para agregar nuevas líneas
            
            Thread.sleep(1000);
            sb.append("name:").append(name).append("");
            System.out.println(sb.toString());
            
            sb.setLength(0);
            
            Thread.sleep(1000);
            sb.append("idCajero:").append(id).append("");
            System.out.println(sb.toString());
            
            sb.setLength(0);
            
            Thread.sleep(1000);
            sb.append("Tarea: ").append(tareas.getTipo()).append(" esta con el cliente ").append(tareas.getCliente());
            System.out.println(sb.toString());
            
            sb.setLength(0);
            
            Thread.sleep(1000);
            System.out.println("Tarea de " + tareas.getTipo() + " atendida por el cajero " + name +"\n");
            Thread.sleep(1000);
            
    
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
    

    

}
