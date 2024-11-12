package map.operacoesBasicas.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario(){
        dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
    }

    public Map<String, String> exibirPalavras(){
        return dicionarioMap;
    }

    public String pesquisarPorPalavra(String palavra){
        String definiciaoPalavra = null;
        if(!dicionarioMap.isEmpty()){
            definiciaoPalavra = dicionarioMap.get(palavra);
        }
        return definiciaoPalavra;
    }
}
