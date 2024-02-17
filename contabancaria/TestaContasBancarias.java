
public class TestaContasBancarias {
    public static void main(String[] args) {
        ContaSimples cs = new ContaSimples("rafa");
        ContaEspecial ce = new ContaEspecial("rafa", 1000);

        cs.depositar(200);
        ce.depositar(3000);
        cs.retira(10);
        ce.retira(30);

        System.out.println("Saldo da conta simples:" + cs.getSaldo());
        System.out.println("Saldo da conta Especial:" + ce.getSaldo());
    }
}
