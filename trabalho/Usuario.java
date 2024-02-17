package trabalho;

public class Usuario {
    private String nome;
    private int matricula;
    private Dispositivo dispositivo;

    Usuario(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void trabalhar() {
        System.out.println(nome + " esta ");
        dispositivo.usar();

    }
}
