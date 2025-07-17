import java.util.ArrayList;
import java.util.List;

public class Academia {
    private String nome;
    private List<Aluno> alunos;
    private List<Professor> professores;

    public Academia(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void listarAlunos() {
        System.out.println("Alunos da academia:");
        for (Aluno a : alunos) {
            System.out.println(a.getNome() + " - Matrícula: " + a.getMatricula());
        }
    }

    public void listarProfessores() {
        System.out.println("Professores da academia:");
        for (Professor p : professores) {
            System.out.println(p.getNome() + " - Especialidade: " + p.getEspecialidade());
        }
    }
}
