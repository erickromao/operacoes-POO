package operacoesBasicas.catalogoLivro;


import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private final List<Livro> livroList;

    public CatalogoLivros() {
        livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public void pesquisarPorAutor(String autor) {

        if (!livroList.isEmpty()) {
            List<Livro> livrosAutor = new ArrayList<>();

            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosAutor.add(l);
                }
            }
            if (!livrosAutor.isEmpty()) {
                System.out.println(livrosAutor);
            } else {
                System.out.println("Nenhum livro encontrado!");
            }

        } else {
            System.out.println("Lista vazia");
        }

    }

    public void pesquiarPorIntervaloAnos(int anoInicial, int anoFinal) {

        if (!livroList.isEmpty()) {
            List<Livro> livrosAno = new ArrayList<>();

            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosAno.add(l);
                }
            }
            if (!livrosAno.isEmpty()) {
                System.out.println(livrosAno);
            } else {
                System.out.println("Nenhum livro encontrado!");
            }

        } else {
            System.out.println("Lista vazia");
        }

    }

    public void pesquisarPorTitulo(String titulo) {

        if (!livroList.isEmpty()) {
            List<Livro> livrosTitulo = new ArrayList<>();

            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livrosTitulo.add(l);
                    break;
                }
            }
            if (!livrosTitulo.isEmpty()) {
                System.out.println(livrosTitulo);
            } else {
                System.out.println("Titulo não encontrado!");
            }

        } else {
            System.out.println("Lista vazia");
        }

    }

    public void todosLivros() {
        if (!livroList.isEmpty()) {
            System.out.println(livroList);
        } else {
            System.out.println("Lista vazia");
        }

    }
}
