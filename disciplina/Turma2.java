package disciplina;

public class Turma2 {
    private String codigo;
    private Estudante estudante;
    private Disciplina disciplina;

    public Turma2(String codigo, String nome, String nome1) {
        this.codigo = codigo;
        this.estudante = new Estudante(nome);
        this.disciplina = new Disciplina(nome1);
    }

    public String getCodTurma() {
        return codigo;
    }

    public String getEstudante() {
        return estudante.getNome();
    }

    public String getDisciplina() {
        return disciplina.getNome();
    }

    @Override
    public String toString() {
        return codigo + " " + estudante + " " + disciplina;
    }

}