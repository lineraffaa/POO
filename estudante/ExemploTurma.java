package estudante;

public class ExemploTurma {
    public static void main(String[] args) {
        Turma turma1 = new Turma();
        turma1.setCurso("****");
        turma1.setDisciplina("****");

        System.out.println("Curso: " + turma1.getCurso());
        System.out.println("Disciplina: " + turma1.getDisciplina());

    }

}
