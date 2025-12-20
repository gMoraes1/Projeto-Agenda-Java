package com.gustavo.agenda.service;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavo.agenda.dto.AgendamentoDTO;
import com.gustavo.agenda.model.Agendamento;
import com.gustavo.agenda.model.Cliente;
import com.gustavo.agenda.model.Servico;
import com.gustavo.agenda.repository.AgendamentoRepository;
import com.gustavo.agenda.repository.ClienteRepository;
import com.gustavo.agenda.repository.ServicoRepository;

@Service
public class AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;
    private final ClienteRepository clienteRepository;
    private final ServicoRepository servicoRepository;

    @Autowired
    public AgendamentoService(
        AgendamentoRepository agendamentoRepository,
        ClienteRepository clienteRepository,
        ServicoRepository servicoRepository
    ) {
        this.agendamentoRepository = agendamentoRepository;
        this.clienteRepository = clienteRepository;
        this.servicoRepository = servicoRepository;
    }

    public Agendamento criarAgendamento(AgendamentoDTO dto) {

        Cliente cliente = clienteRepository.findById(dto.getClienteId())
            .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

        Servico servico = servicoRepository.findById(dto.getServicoId())
            .orElseThrow(() -> new RuntimeException("Serviço não encontrado"));

        Agendamento agendamento = new Agendamento();
        agendamento.setDataHora(dto.getDataHora());
        agendamento.setCliente(cliente);
        agendamento.setServico(servico);

        return agendamentoRepository.save(agendamento);
    }

    public List<Agendamento> listar() {
        return agendamentoRepository.findAll();
    }

    public void deletar(Integer id) {
        agendamentoRepository.deleteById(id);
    }
}

