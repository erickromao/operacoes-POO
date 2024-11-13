package map.operacoesBasicas.livraria;

import java.util.Comparator;
import java.util.Objects;

public class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

   public String getTitulo(){
        return titulo;
   }

   public String getAutor(){
        return autor;
   }

   public double getPreco(){
        return preco;
   }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(titulo, livro.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(titulo);
    }

    @Override
    public int compareTo(Livro l) {
        return Double.compare(preco, l.getPreco());
    }
}

class removerLivrosPorAutor implements Comparator<Livro>{
    @Override
    public int compare(Livro l1, Livro l2) {
        return l1.getAutor().compareTo(l2.getAutor());
    }
}
