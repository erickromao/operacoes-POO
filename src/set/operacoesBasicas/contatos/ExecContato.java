package set.operacoesBasicas.contatos;

public class ExecContato {
    public static void main (String[] args){
        AgendaContatos contato =  new AgendaContatos();

        contato.exibirContatos();
        contato.adicionarContato("erick", 232323);
        contato.adicionarContato("erick romao", 2121212);
        contato.adicionarContato("erick oliveira", 2222222);
        contato.adicionarContato("gd", 242424);
        contato.adicionarContato("teixeira", 2121212121);
        contato.adicionarContato("random", 232323);

        System.out.println(contato.pesquisarPorNome("erick"));
        System.out.println(contato.atualizarNomeContato("teixeira", 2222));

        contato.exibirContatos();

    }
}
