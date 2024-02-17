package compositor;

public class Compositor1 {

    public static void main(String[] args) {
        Compositor vetor[] = new Compositor[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = new Compositor("codigo", "nome");

        }
        Compositor Compositor1 = new Compositor(null, null);
        Compositor1.setCodigo("*****");
        Compositor1.setNome("******");

        System.out.println("Codigo " + Compositor1.getCodigo());
        System.out.println("Nome " + Compositor1.getNome());
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Codigo " + vetor[i].getCodigo() + "Nome " + vetor[i].getNome());
        }
    }

}
