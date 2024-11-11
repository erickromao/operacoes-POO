package ordenacao.pessoa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoasList;

    public OrdenacaoPessoas(){
        pessoasList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoasList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> ordenarPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(ordenarPorIdade);
        return ordenarPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> ordenarPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(ordenarPorAltura, new comparePorAltura());
        return ordenarPorAltura;
    }

    public void mostrarTodos(){
        System.out.println(pessoasList);
    }

}
