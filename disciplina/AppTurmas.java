package disciplina;

public class AppTurmas {
    public static void main(String[] args) {
        Turma2[] turma = new Turma2[3];

        turma[0] = new Turma2("A", "Helena", "POOI");
        turma[1] = new Turma2("A", "Igor", "POOI");
        turma[2] = new Turma2("A", "Davi", "POOI");

        for (Turma2 turmas : turma) {
            System.out.println("Estudante: " + turmas.getEstudante()
                    + " está cursando a disciplina: " + turmas.getDisciplina()
                    + " na Turma " + turmas.getCodTurma());
        }
    }

}
