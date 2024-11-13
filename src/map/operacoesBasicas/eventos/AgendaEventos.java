package map.operacoesBasicas.eventos;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos(){
        eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
       Map<LocalDate, Evento> eventoOrganizado = new TreeMap<>(eventoMap);
       System.out.println(eventoOrganizado);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventoOrganizado = new TreeMap<>(eventoMap);
        for(Map.Entry<LocalDate,Evento> entry : eventoOrganizado.entrySet()){
            LocalDate data = entry.getKey();
            Evento evento = entry.getValue();

            if(data.isEqual(dataAtual) || data.isAfter(dataAtual)){
                System.out.println("Data:"+data+"\n"+ evento);
                break;
            }
        }
    }

}
