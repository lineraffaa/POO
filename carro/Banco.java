package carro;

public class Banco {
    private String tipo;

    public Banco(String tipo) {
        this.tipo = tipo;

    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return tipo;
    }

}
