package shape;

public class Triangulo extends TwoDShape {
    private String estilo;
    private double largura, altura;

    public double area() {
        return (largura * altura) / 2;
    }

    public void mostraEstilo() {
        System.out.println("Triangulo = " + estilo);

    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
}
