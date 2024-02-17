package conta;

public class Conta {
	private double saldo;

	public Conta(double saldoInicial) {
		if (saldoInicial > 0.0)
			saldo = saldoInicial;
		else
			saldo = 0.0;
	}

	public double getSaldo() {
		return saldo;
	}

	public void creditar(double quantia) {
		saldo += quantia;
	}

	public void debitar(double quantia) {
		if (saldo >= quantia) {
			saldo -= quantia;
			System.out.printf("Subtraindo %.2f do saldo da conta1\n\n", quantia);
		} else
			System.out.println("Quantia de débito excedeu o saldo da conta" + saldo);
	}

}
