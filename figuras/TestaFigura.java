package figuras;

public class TestaFigura {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[2];
        figuras[0] = new Quadrado();
        figuras[1] = new Circulo();

        for (Figura fig : figuras) {
            System.out.printf("\n Area %.2f", fig.area(10));

        }
    }

}
