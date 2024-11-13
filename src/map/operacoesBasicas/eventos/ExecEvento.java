package map.operacoesBasicas.eventos;

import java.time.LocalDate;

public class ExecEvento {
    public static void main(String[] args){
        AgendaEventos evento = new AgendaEventos();

        evento.adicionarEvento(LocalDate.of(2025, 2,  20), "evento1", "atracao1");
        evento.adicionarEvento(LocalDate.of(2024, 12,  22), "evento3", "atracao3");
        evento.adicionarEvento(LocalDate.of(2026, 2,  21), "evento2", "atracao2");

        evento.exibirAgenda();
        evento.obterProximoEvento();

    }
}
