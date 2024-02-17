package ponto;

public class Ponto2D {
    private double x, y;
    private static int contador;

    public Ponto2D() {
        x = 10;
        y = 15;
        contador++;
    }

    public Ponto2D(double x, double y) { // tem dois parametros;
        this.x = x; // atributo da classe;
        this.y = y;
        contador++;
    }

    public double getx() {
        return x;
    }

    public double gety() {
        return y;
    }

    public static int getContador() {
        return contador;
    }
}
