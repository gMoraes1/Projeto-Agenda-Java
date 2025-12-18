package com.gustavo.agenda.service;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.gustavo.agenda.model.Servico;

@Service
public class ServicoService {
    
    private final List<Servico> servicos = new ArrayList<>();
    private int proximoId = 1;

    public List<Servico> listarServicos() {
        return servicos;
    }

    public Servico criarServico(Servico servico) {
        servico.setId(proximoId++);
        servicos.add(servico);
        return servico;
    }

    public void removerServico(int id) {
        servicos.removeIf(a -> a.getId() == id);
    }


    
}
