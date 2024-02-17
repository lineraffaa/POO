package retangulo;

public class Retangulo {
    private double largura, comprimento;

    public Retangulo() {
        largura = 1;
        comprimento = 1;
    }

    public Retangulo(double largura, double comprimento) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double getLargura() {
        return largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double PerimetroRetangulo() {
        return (comprimento * 2) + (largura * 2);
    }

    public double CalcularArea() {
        return largura * comprimento;
    }

    public void exibeDados() {
        System.out.printf("Perimetro: %.2f/n", PerimetroRetangulo());
        System.out.printf("Area: %.2f/n", CalcularArea());
    }
}
