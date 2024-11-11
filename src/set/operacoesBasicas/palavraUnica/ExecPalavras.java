package set.operacoesBasicas.palavraUnica;

public class ExecPalavras {
    public static void main(String[] args){
        ConjuntoPalavrasUnicas palavra = new ConjuntoPalavrasUnicas();

        System.out.println(palavra.exibirPalavraUnicas());
        palavra.adicionarPalavra("Palavra1");
        palavra.adicionarPalavra("Palavra1");
        palavra.adicionarPalavra("Palavra2");
        palavra.adicionarPalavra("Palavra3");
        palavra.adicionarPalavra("Palavra4");

        System.out.println(palavra.exibirPalavraUnicas());
        palavra.removerPalavra("palavra2");
        System.out.println(palavra.verificarPalavra("palavra3"));
        System.out.println(palavra.exibirPalavraUnicas());
    }
}
