public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente[] contas = new ContaCorrente[3];

        contas[0] = new ContaCorrente(1000);
        contas[1] = new ContaCorrenteEspecial(2000);
        contas[2] = new ContaCorrenteEspecial(5000);

        for (ContaCorrente c : contas) {
            c.depositar(1000);
            c.sacar(200);
            System.out.println("Saldo da Conta ap�s depositar R$ 1.000 e sacar R$ 200 � de: R$ " + c.getSaldo());
        }

    }
}