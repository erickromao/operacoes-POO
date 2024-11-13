package map.operacoesBasicas.eventos;

public class Evento {
    private String nome;
    private String atracao;

    public Evento(String nome, String atracao){
        this.atracao = atracao;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", atracao='" + atracao + '\'' +
                '}';
    }


}
