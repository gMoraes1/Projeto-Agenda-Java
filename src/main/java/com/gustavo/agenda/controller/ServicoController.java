package com.gustavo.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gustavo.agenda.dto.ServicoDTO;
import com.gustavo.agenda.model.Servico;
import com.gustavo.agenda.model.ServicoEspecial;
import com.gustavo.agenda.service.ServicoService;

import jakarta.validation.Valid;

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
        return servicoService.listarServico();
    }

    @PostMapping("/especial")
    public Servico criar(@RequestBody @Valid ServicoDTO dto) {
        return servicoService.criarServico(dto);
    }

    @PostMapping
    public Servico criarServico(@RequestBody @Valid ServicoDTO dto) {
    return servicoService.criarServico(dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        servicoService.deletarServico(id);
    }
}
