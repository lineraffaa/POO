public abstract class ContaBancaria {
    private String nome;
    private double saldo;

    public ContaBancaria(String nome1) {
        saldo = 0;
        this.nome = nome1;
    }

    public abstract void retira(double valor);

    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo1) {
        this.saldo = saldo1;
    }
}
