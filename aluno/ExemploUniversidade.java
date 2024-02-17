package aluno;

public class ExemploUniversidade {
    public static void main(String[] args) {
        Universidade uni = new Universidade();
        uni.nome = "rafa";
        uni.cidade = "*****";
        uni.estado = "****";
        uni.exibeDados();

        Aluno aluno = new Aluno();
        aluno.nome = "rafa";
        aluno.curso = "cc";
        aluno.exibeDados();
    }
}
