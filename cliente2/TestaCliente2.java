package cliente2;

public class TestaCliente2 {
    public static void main(String[] args) {
        Cliente2[] c = new Cliente2[2];
        c[0] = new ClienteEspecial2();
        c[1] = new Cliente2();

        for (Cliente2 cl : c) {
            System.out.println(cl.calcularDesconto(4930));

        }

    }

}
