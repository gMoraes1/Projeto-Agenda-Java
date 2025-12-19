package com.gustavo.agenda.service;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavo.agenda.model.Agendamento;
import com.gustavo.agenda.repository.AgendamentoRepository;

@Service
public class AgendaService {
    private final AgendamentoRepository repository;

    @Autowired
    public AgendaService(AgendamentoRepository repository) {
        this.repository = repository;
    }

    public List<Agendamento> listarAgendamento() {
        return repository.findAll();
    }

    public Agendamento criarAgendamento(Agendamento agendamento) {
        return repository.save(agendamento);
    }

    public void removerAgendamento(Integer id) {
        repository.deleteById(id);
    }

    
}
