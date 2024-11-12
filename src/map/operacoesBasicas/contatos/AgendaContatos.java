package map.operacoesBasicas.contatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatosMap;

    public AgendaContatos(){
        contatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        contatosMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!contatosMap.isEmpty()){
            contatosMap.remove(nome);
        }else{
            System.out.println("Nenhum contato existente.");
        }
    }

    public Map<String, Integer> exibirContatos(){
            return contatosMap;
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroContato = null;
        if(!contatosMap.isEmpty()){
            numeroContato = contatosMap.get(nome);
        }else{
            System.out.println("Sem contatos");
        }
        return numeroContato;

    }


}
