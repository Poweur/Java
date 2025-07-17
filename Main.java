public class Main {
    public static void main(String[] args) {
        Academia academia = new Academia("Academia Boa Forma");

        Aluno aluno1 = new Aluno("João Silva", "123.456.789-00", "A001");
        Aluno aluno2 = new Aluno("Maria Oliveira", "987.654.321-00", "A002");

        Professor professor1 = new Professor("Carlos Lima", "456.789.123-00", "Musculação");
        Professor professor2 = new Professor("Ana Souza", "321.654.987-00", "Yoga");

        academia.adicionarAluno(aluno1);
        academia.adicionarAluno(aluno2);
        academia.adicionarProfessor(professor1);
        academia.adicionarProfessor(professor2);

        academia.listarAlunos();
        academia.listarProfessores();
    }
}
