package com.gustavo.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gustavo.agenda.model.Servico;
import com.gustavo.agenda.service.ServicoService;


import java.util.List;

@RestController
@RequestMapping("/servicos")
public class ServicoController {
    
    private final ServicoService servicoService;

    @Autowired
    public ServicoController(ServicoService servicoService) {
        this.servicoService = servicoService;
    }

    @GetMapping
    public List<Servico> listarTodos() {
        return servicoService.listarServicos();
    }

    @PostMapping
    public Servico criar(@RequestBody Servico servico) {
        return servicoService.criarServico(servico);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        servicoService.removerServico(id);
    }
}
