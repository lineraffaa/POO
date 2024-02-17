
public class ContaCorrente {

    private double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public double getTaxaOperacao() {
        return 0.05;
    }

    public void sacar(double quantia) {
        saldo -= quantia + quantia + getTaxaOperacao();
    }

    public void depositar(double quantia) {
        saldo += quantia;

    }

    public double getSaldo() {
        return saldo;
    }// metodo acessador;

}
