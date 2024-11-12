package map.operacoesBasicas.dicionario;

public class ExecDicionario {
    public static void main(String[] args){
        Dicionario palavra = new Dicionario();

       System.out.println(palavra.exibirPalavras());
       palavra.adicionarPalavra("kappa", "mentira");
       palavra.adicionarPalavra("dale", "boa");

       System.out.println(palavra.exibirPalavras());
       System.out.println(palavra.pesquisarPorPalavra("dale"));
       palavra.removerPalavra("dale");
       System.out.println(palavra.exibirPalavras());

    }
}
