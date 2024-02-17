package produto;

public class Produto {
    private String nome;
    private double preco;

    protected double getpreco() {
        return preco;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public boolean EhCaro() {
        if (preco > 100) {
            return true;
        }
        return false;
    }

}
