package set.operacoesBasicas.aluno;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunosSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Aluno removerAluno = null;
        for (Aluno a : alunosSet) {
            if (a.getMatricula() == matricula) {
                removerAluno = a;
            }
        }
        alunosSet.remove(removerAluno);
    }

    public Set<Aluno> exibirAlunosPorMatricula(){
        Set<Aluno> exibirAlunosPorMatricula = new TreeSet<>(alunosSet);
        return exibirAlunosPorMatricula;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> exibiriAlunosPorNota = new TreeSet<>(new exibirAlunosPorNota());
            exibiriAlunosPorNota.addAll(alunosSet);
            return exibiriAlunosPorNota;
    }

    public Set<Aluno> exibirAlunos(){
        return alunosSet;
    }

}
