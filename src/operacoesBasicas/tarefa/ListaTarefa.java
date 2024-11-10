package operacoesBasicas.tarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> listTarefa;

    public ListaTarefa(){
        listTarefa =  new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> removerTarefa = new ArrayList<>();

        for(Tarefa t: listTarefa){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                removerTarefa.add(t);
            }
        }
        listTarefa.removeAll(removerTarefa);
    }

    public int obterNumeroTotalTarefas(){
        return listTarefa.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listTarefa);
    }

}
