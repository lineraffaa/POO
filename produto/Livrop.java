package produto;

public class Livrop extends Produto {
    private String autor;
    private int paginas;

    public Livrop(String autor, int paginas, String nome, double preco) {
        super(nome, preco);
        this.autor = autor;
        this.paginas = paginas;
    }

    public boolean ehExtenso() {
        if (paginas > 100) {
            return true;
        }
        return false;
    }

    public boolean ehExtenso(int x) {
        if (paginas > x) {
            return true;
        }
        return false;
    }

    @Override
    public boolean EhCaro() {
        if (getpreco() > 100) {
            return true;
        }
        return false;
    }

}
