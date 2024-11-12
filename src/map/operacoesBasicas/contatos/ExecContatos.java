package map.operacoesBasicas.contatos;

public class ExecContatos {
    public static void main(String[] args){
        AgendaContatos contatos = new AgendaContatos();

        System.out.println(contatos.exibirContatos());
        contatos.adicionarContato("erick", 123123);
        contatos.adicionarContato("erick", 1212);
        contatos.adicionarContato("gd", 232323);
        contatos.adicionarContato("teixeira", 171717);

        System.out.println(contatos.exibirContatos());
        contatos.removerContato("teixeira");

        System.out.println(contatos.exibirContatos());
        System.out.println(contatos.pesquisarPorNome("erick"));
    }
}
