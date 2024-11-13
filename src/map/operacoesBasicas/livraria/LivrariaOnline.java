package map.operacoesBasicas.livraria;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livrosMap;

    public LivrariaOnline() {
        livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livrosMap.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        String removerLivro = null;
        for (Map.Entry<String, Livro> l : livrosMap.entrySet()) {
            if (l.getValue().getTitulo().equals(titulo)) {
                removerLivro = l.getKey();
                break;
            }
        }
        livrosMap.remove(removerLivro);
    }

    public void exibirLivrosOrdenadosPorPreco() {
        List<Livro> livrosOrdenados = new ArrayList<>(livrosMap.values());
        livrosOrdenados.sort(Comparator.comparingDouble(Livro::getPreco));

        System.out.println(livrosOrdenados);
    }

    public void pesquisarLivrosPorAutor(String autor) {
        List<Livro> listaAutor = new ArrayList<>();
        for (Livro l : livrosMap.values()) {
            if (l.getAutor().equals(autor)) {
                listaAutor.add(l);
            }
        }
        System.out.println(listaAutor);
    }

    public void obterLivroMaisCaro() {
        Livro livroMaisCaro = null;
        double maiorValor = Double.MIN_VALUE;
        for (Livro l : livrosMap.values()) {
            if (l.getPreco() > maiorValor) {
                livroMaisCaro = l;
                maiorValor = l.getPreco();
            }
        }
        System.out.println(livroMaisCaro);
    }

    public void obterLivroMaisBarato(){
        Livro livroMaisBarato = null;
        double menorValor = Double.MAX_VALUE;
        for(Livro l: livrosMap.values()){
            if(l.getPreco()<menorValor){
                livroMaisBarato = l;
                menorValor = l.getPreco();
            }
        }
        System.out.println(livroMaisBarato);
    }

    public static void main(String[] args) {
        LivrariaOnline livro = new LivrariaOnline();

        livro.adicionarLivro("w", "titulo1", "autor1", 21.1);
        livro.adicionarLivro("www", "titulo3", "autor3", 23.3);
        livro.adicionarLivro("ww", "titulo2", "autor2", 22.2);
        livro.adicionarLivro("wwww", "titulo22", "autor2", 24.4);
        livro.adicionarLivro("remove", "remove1", "remove2", 2.2);

        livro.exibirLivrosOrdenadosPorPreco();
        livro.removerLivro("remove1");
        livro.exibirLivrosOrdenadosPorPreco();
        livro.pesquisarLivrosPorAutor("autor2");
        livro.obterLivroMaisCaro();
        livro.obterLivroMaisBarato();
    }
}


