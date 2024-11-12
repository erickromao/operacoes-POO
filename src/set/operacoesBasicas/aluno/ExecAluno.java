package set.operacoesBasicas.aluno;

public class ExecAluno {
    public static void main(String[] args){
        GerenciadorAlunos aluno = new GerenciadorAlunos();

        aluno.adicionarAluno("Erick", 12123L,9);
        aluno.adicionarAluno("Bola", 121212323L,8.5);
        aluno.adicionarAluno("Abner", 12121233L,8.6);

        System.out.println(aluno.exibirAlunosPorMatricula());
        System.out.println(aluno.exibirAlunosPorNota());
        System.out.println(aluno.exibirAlunos());

    }
}
