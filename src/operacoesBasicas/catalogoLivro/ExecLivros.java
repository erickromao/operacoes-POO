package operacoesBasicas.catalogoLivro;

public class ExecLivros {
    public static void main (String[] args){
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Pequeno", "anao", 2003);
        catalogoLivros.adicionarLivro("grandao", "grande", 2003);
        catalogoLivros.adicionarLivro("peixe", "dore", 2006);
        catalogoLivros.adicionarLivro("tubarao", "mar", 2009);

        catalogoLivros.pesquiarPorIntervaloAnos(2006,2009);
        catalogoLivros.pesquisarPorAutor("grandee");
        catalogoLivros.pesquisarPorTitulo("Pequeno");

        catalogoLivros.todosLivros();
    }
}
