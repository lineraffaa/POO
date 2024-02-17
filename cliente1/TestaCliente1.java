package cliente1;

public class TestaCliente1 {
    public static void main(String[] args) {
        Cliente1[] clientes = new Cliente1[2];
        clientes[0] = new Cliente1("A", 100, 200);
        clientes[1] = new ClienteEspecial1("A ", 100, 200);

        for (Cliente1 cli : clientes) {
            System.out.println(cli); // polimosfimo, por que faz chamada do to string
        }

    }
}
