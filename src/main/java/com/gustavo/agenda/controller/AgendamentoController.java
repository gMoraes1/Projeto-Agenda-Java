package com.gustavo.agenda.controller;

import com.gustavo.agenda.model.Agendamento;
import com.gustavo.agenda.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

import java.util.List;


@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {

    private final AgendaService agendaService;

    @Autowired
    public AgendamentoController(AgendaService agendaService) {
        this.agendaService= agendaService;
    }


    @GetMapping
    public List<Agendamento> listarTodos() {
        return agendaService.listarAgendamento();
    }

    @PostMapping
    public Agendamento criar(@RequestBody Agendamento agendamento) {
        return agendaService.criarAgendamento(agendamento);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        agendaService.removerAgendamento(id);
    }
    
}
