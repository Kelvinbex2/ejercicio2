package Model;

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
}
