package cozinha;

public class TestaCozinha {
    public static void main(String[] args) {
        Liquidificador l = new Liquidificador();
        Geladeira g = new Geladeira();
        Microondas m = new Microondas();

        Cozinha c = new Cozinha(l, g, m);
        c.desligar();
        c.ligar();

    }

}
