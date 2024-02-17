package cliente2;

public class ClienteEspecial2 extends Cliente2 {

    @Override

    public double calcularDesconto(double valor3) {

        return valor3 * 20 / 100;

    }

}
