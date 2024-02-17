package produto;

public class ProdutoApp {
    public static void main(String[] args) {
        Produto produto1 = new Produto("c", 30);
        Livrop livro1 = new Livrop("s", 10, "l", 50);

        if (livro1.ehExtenso())
            System.out.println("livro eh extenso");
        else
            System.out.println("nao é extenso");

        if (produto1.EhCaro())
            System.out.println("Produto eh caro");
        else
            System.out.println("nao é caro");

    }
}