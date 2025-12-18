package com.gustavo.agenda.service;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;




import com.gustavo.agenda.model.Agendamento;

@Service
public class AgendaService {

    private final List<Agendamento> agendamentos = new ArrayList<>();
    private int proximoId = 1;

    public List<Agendamento> listarAgendamentos() {
        return agendamentos;
    }

    public Agendamento criarAgendamento(Agendamento agendamento) {
        agendamento.setId(proximoId++);
        agendamentos.add(agendamento);
            return agendamento;
        
    }

    public void removerAgendamento(int id) {
        agendamentos.removeIf(a -> a.getId() == id);
    }

    public List<Agendamento> buscarPorData(LocalDate data) {
        return agendamentos.stream()
        .filter(a -> a.getDataHora().toLocalDate().equals(data))
        .collect(Collectors.toList());
    }

    
}
