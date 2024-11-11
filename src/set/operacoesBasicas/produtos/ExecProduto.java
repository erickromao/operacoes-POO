package set.operacoesBasicas.produtos;

public class ExecProduto {
    public static void main(String[] args) {
        CadastroProdutos produto = new CadastroProdutos();


        produto.adicionarProduto(54321, "eproduto3", 1, 1);
        produto.adicionarProduto(123123, "bdproduto1", 10, 3);
        produto.adicionarProduto(4321, "aproduto1", 30, 2);
        produto.adicionarProduto(123123, "cproduto2", 40, 9);


        System.out.println(produto.exibirProdutosPorNome());
        System.out.println(produto.exibirProdutosPorPreco());
        System.out.println(produto.ordenarPorCodigo());
    }
}
