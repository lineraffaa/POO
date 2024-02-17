
public class ContaEspecial extends ContaBancaria {
    private double adicional;

    public ContaEspecial(String nome1, double adicional) {
        super(nome1);
        this.adicional = adicional;
    }

    public void retira(double valor) {
        if (valor < getSaldo() + adicional) {
            setSaldo(getSaldo() - valor);
        }
    }

}
