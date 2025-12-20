package com.gustavo.agenda.service;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavo.agenda.dto.ServicoDTO;
import com.gustavo.agenda.model.Servico;
import com.gustavo.agenda.repository.ServicoRepository;

@Service
public class ServicoService {
    
    private final ServicoRepository repository;

    @Autowired
    public ServicoService(ServicoRepository repository) {
        this.repository = repository;
    } 

    public List<Servico> listarServico() {
        return repository.findAll();
    }

    public Servico criarServico(ServicoDTO dto) {
        Servico servico = new Servico();
        servico.setNome(dto.getNome());
        servico.setPreco(dto.getPreco());
        servico.setDuracacao(dto.getDuracaoMinutos());
        return repository.save(servico);
    }

    public void deletarServico(Integer id) {
        repository.deleteById(id);
    }

    
}
