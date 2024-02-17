public class ContaCorrenteEspecial extends ContaCorrente {
    public ContaCorrenteEspecial(double saldo) {
        super(saldo);
    }

    @Override

    public double getTaxaOperacao() {
        return 0.001;
    }

}
