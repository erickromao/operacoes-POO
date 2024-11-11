package set.operacoesBasicas.convidados;

public class ExecConvidados {
    public static void main (String[] args){
        ConjuntoConvidados convidado = new ConjuntoConvidados();

        System.out.println(convidado.contarConvidados());

        convidado.adicionarConvidado("erick", 23);
        convidado.adicionarConvidado("joao", 12);
        convidado.adicionarConvidado("gd", 25);
        convidado.adicionarConvidado("gd", 25);
        convidado.adicionarConvidado("teixeira", 21);

        System.out.println(convidado.contarConvidados());
        convidado.removerConvidadoPorCodigoConvite(12);

        convidado.exibirConvidados();

    }
}
