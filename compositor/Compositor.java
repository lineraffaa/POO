package compositor;

public class Compositor {
    String codigo;
    String nome;

    public Compositor(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /*
     * public static void main(String[] args){
     * Compositor vetor[] = new Compositor[10];
     * 
     * for(int i = 0; i < vetor.length; i++){
     * vetor[i] = new Compositor(null, null);
     * 
     * }
     * 
     * Compositor Compositor1 = new Compositor(null, null);
     * 
     * Compositor1.setCodigo("*****");
     * Compositor1.setNome("******");
     * 
     * System.out.println("Codigo "+ Compositor1.getCodigo());
     * System.out.println("Nome "+ Compositor1.getNome());
     * 
     * }
     */

}
