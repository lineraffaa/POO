package contacorrente2;

public class Exercicio2App {
    public static void main(String[] args) {
        ContaCorrente2 conta = new ContaCorrente2();

        /* Testa a exce��o de valor negativo. */
        try {
            conta.depositar(100);
            conta.depositar(-50);
        } catch (ValorNegativoException e) {
            System.out.println("Exce��o encontrada: " + e);
        }

        /* Testa a exce��o de saldo insuficiente. */
        try {
            conta.sacar(70);
            conta.sacar(50);
        } catch (ValorNegativoException | SaldoInsuficienteException e) {
            System.out.println("Exce��o encontrada: " + e);
        }

        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}