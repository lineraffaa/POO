package figura;

public class TestaFigura1 {
    public static void main(String[] args) {
        Figura1[] fig = new Figura1[2];
        fig[0] = new Quadrado1();
        fig[1] = new Circulo1();

        for (Figura1 f : fig) {
            System.out.println(f.area2(20));

        }

    }
}
