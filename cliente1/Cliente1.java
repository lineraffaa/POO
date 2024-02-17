package cliente1;

public class Cliente1 {
    private String nome;
    private double saldo, limite;

    public Cliente1(String nome, double saldo, double limite) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;

    }

    @Override
    public String toString() {
        return nome + " " + saldo + " " + limite;

    }
}
