package operacoesBasicas.carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras(){
        itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> removerItem = new ArrayList<>();

        for(Item i : itemList){
            if(i.getNome().equalsIgnoreCase(nome)){
                removerItem.add(i);
            }
        }

        itemList.removeAll(removerItem);
    }

   public double calcularValorTotal(){

        double valorTotal = 0 ;
        for(Item i : itemList){
            valorTotal+= i.getPreco()*i.getQuantidade();
        }

        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }
}
