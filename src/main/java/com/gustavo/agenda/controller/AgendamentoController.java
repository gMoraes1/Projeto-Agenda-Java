package com.gustavo.agenda.controller;

import com.gustavo.agenda.dto.AgendamentoDTO;
import com.gustavo.agenda.model.Agendamento;
import com.gustavo.agenda.service.AgendamentoService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

import java.util.List;


@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {

    private final AgendamentoService service;

    @Autowired
    public AgendamentoController(AgendamentoService service) {
        this.service= service;
    }


    @GetMapping
    public List<Agendamento> listar() {
        return service.listar();
    }

    @PostMapping
    public Agendamento criar(@RequestBody @Valid AgendamentoDTO dto) {
        return service.criarAgendamento(dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        service.deletar(id);
    }
    
}
