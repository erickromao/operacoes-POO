package set.operacoesBasicas.palavraUnica;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<Palavra> palavraSet;

    public ConjuntoPalavrasUnicas(){
        palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavraSet.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra){
        Palavra removerPalavra = null;
        for(Palavra p: palavraSet){
            if(p.getPalavra().equalsIgnoreCase(palavra)){
                removerPalavra = p;
                break;
            }
        }
        palavraSet.remove(removerPalavra);
    }

    public Palavra verificarPalavra(String palavra){
        Palavra verificarPalavra = null;
        for(Palavra p: palavraSet){
            if(p.getPalavra().equalsIgnoreCase(palavra)){
                verificarPalavra = p;
            }
        }
        return verificarPalavra;
    }

    public Set<Palavra> exibirPalavraUnicas(){
        return palavraSet;
    }
}
