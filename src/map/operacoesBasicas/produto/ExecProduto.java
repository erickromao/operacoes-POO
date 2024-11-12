package map.operacoesBasicas.produto;

public class ExecProduto {
    public static void main(String[] args){
        EstoqueProdutos produto = new EstoqueProdutos();

        System.out.println(produto.exibirProdutos());
        produto.adicionarProduto(123123L, "produto1", 6, 3);
        produto.adicionarProduto(12345L, "produto2", 3, 10);
        produto.adicionarProduto(123455L, "produto3", 1, 21);

        System.out.println(produto.exibirProdutos());

        System.out.println(produto.obterProdutoMaisBarato());
        System.out.println(produto.exibirProdutos());
        System.out.println(produto.obterProdutoMaisCaro());
        System.out.println(produto.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
