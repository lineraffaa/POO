package figuras;

public class Circulo extends Figura {
    @Override
    public double area(double raio1) {
        return Math.PI * raio1 * raio1;
    }

}
