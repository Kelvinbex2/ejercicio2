package Model;

import Entrada.Entrada;

public class Tarea {
    private String tipo;
    private String cliente;

    public Tarea(String tipo, String cliente) {
        this.tipo = tipo;
        this.cliente = cliente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void generarTipo(){
        int opc=elegirTipo();
        if (!tipo.isEmpty()) {
            System.out.println("---Vas a generar un tipo: "  );
            while (opc >= 0 && opc <=3) {
                if(opc==1) {
                    System.out.println("Has elegido Deposito");
                    tipo="Deposito";
                }else if (opc==2) {
                    System.out.println("Has elegido Retiro");
                    tipo="Retiro";
                } else if (opc==3) {
                    System.out.println("Has elegido Consulta");
                    tipo="Consulta";
                }
                
            }
            
            
        }
    }

    public int elegirTipo(){
        int opc=0;
        System.out.println("1.Deposito:");
        System.out.println("2.Retiro");
        System.out.println("3.Consulta");
        System.out.println("Elige: ");
        opc= Entrada.leerEntero();
        return opc;
    }
}
