package map.operacoesBasicas.produto;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> produtosMap;

    public EstoqueProdutos(){
        produtosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        produtosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public Map<Long, Produto> exibirProdutos(){
        return produtosMap;
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0d;
        for(Produto p: produtosMap.values()){
            if(!produtosMap.isEmpty()){
                valorTotal += p.getPreco()*p.getQuantidade();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for(Produto p: produtosMap.values()){
            if(!produtosMap.isEmpty()){
                if(p.getPreco()>maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for(Produto p: produtosMap.values()){
            if(!produtosMap.isEmpty()){
                if(p.getPreco()<menorPreco){
                    menorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto maiorQuantidadeTotal = null;
        double maiorTotal = Double.MIN_VALUE;
        for(Produto p: produtosMap.values()){
            double valorTotal = p.getQuantidade()*p.getPreco();
            if(valorTotal > maiorTotal){
                maiorTotal = valorTotal;
                maiorQuantidadeTotal = p;
            }
        }
        return maiorQuantidadeTotal;
    }
}
