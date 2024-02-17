package contacorrente2;

public class ValorNegativoException extends Exception {
    private double quantia;

    public ValorNegativoException(double quantia) {
        this.quantia = quantia;
    }

    public String toString() {
        return "Valor do saque e deposito não pode ser negativo";
    }

}
