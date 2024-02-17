package cozinha;

public class Cozinha {
    private Liquidificador liquidificador;
    private Geladeira geladeira;
    private Microondas microondas;

    public Cozinha(Liquidificador l, Geladeira g, Microondas m) {
        this.liquidificador = l;
        this.geladeira = g;
        this.microondas = m;
    }

    public void ligar() {
        this.liquidificador.ligar();
        this.geladeira.ligar();
        this.microondas.ligar();
    }

    public void desligar() {
        this.liquidificador.desligar();
        this.liquidificador.desligar();
        this.liquidificador.desligar();
    }

}
