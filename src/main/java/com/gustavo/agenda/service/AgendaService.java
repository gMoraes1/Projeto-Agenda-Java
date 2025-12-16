package service;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;


import model.Cliente;
import model.Servico;

import model.Agendamento;

public class AgendaService {
    private List<Agendamento> agendamentos;

    public AgendaService() {
        this.agendamentos = new ArrayList<>();
    }

    private boolean verificarConflito(LocalDateTime dataHora) {
        return agendamentos.stream()
        .anyMatch(a -> a.getDataHora().equals(dataHora));

    }

    public boolean criarAgendamento(Cliente cliente, Servico servico, LocalDateTime dataHora) {
        if (verificarConflito(dataHora)) {
            System.out.println("Horario ja ocupado");
            return false;
        }

        Agendamento agendamento = new Agendamento(cliente, servico, dataHora);
        agendamentos.add(agendamento);
        System.out.println("agendamento concluido" + agendamento);
        return true; 
    }

    public boolean removerAgendamento(Agendamento agendamento) {
        return agendamentos.remove(agendamento);
    }

    public List<Agendamento> listarAgendamentos() {
        return new ArrayList<>(agendamentos);
    }

    public List<Agendamento> buscarPorCliente(String nomeCliente) {
        return agendamentos.stream()
        .filter(a -> a.getCliente().getNome().equalsIgnoreCase(nomeCliente)).collect(Collectors.toList());
    }

    public List<Agendamento> buscarPorData(LocalDate  data) {
        return agendamentos.stream()
        .filter(a -> a.getDataHora().toLocalDate().equals(data))
        .collect(Collectors.toList());
    }

    public List<Agendamento> buscarProximos() {
        return agendamentos.stream()
        .filter(a -> a.getDataHora().isAfter(LocalDateTime.now()))
        .sorted(Comparator.comparing(Agendamento::getDataHora))
        .collect(Collectors.toList());
    }


    
}
