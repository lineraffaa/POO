
public class ContaSimples extends ContaBancaria {
    public ContaSimples(String nome1) {
        super(nome1);
    }

    public void retira(double valor) {
        if (valor < getSaldo()) {
            setSaldo(getSaldo() - valor);
        }
    }

}
